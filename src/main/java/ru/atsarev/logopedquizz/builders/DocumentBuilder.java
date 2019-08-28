package ru.atsarev.logopedquizz.builders;

import org.apache.poi.xwpf.usermodel.*;
import ru.atsarev.logopedquizz.dto.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class DocumentBuilder {

    public File createWord(Report report) throws IOException
    {
        XWPFDocument document = new XWPFDocument();

        File file = new File("reports/report_" + new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS").format(new Date()) + ".docx");
        FileOutputStream out = new FileOutputStream(file);

        XWPFParagraph reportParagraph = document.createParagraph();
        reportParagraph.setAlignment(ParagraphAlignment.CENTER);

        XWPFRun reportRun = reportParagraph.createRun();

        reportRun.setBold(true);
        reportRun.setFontFamily("Times New Roman");
        reportRun.setFontSize(16);
        reportRun.setText(report.getTitle());

        if (report.getSections() != null) {
            for (Section section : report.getSections()) {

                XWPFParagraph sectionParagraph = document.createParagraph();
                XWPFRun titleRun = sectionParagraph.createRun();

                titleRun.setFontFamily("Times New Roman");
                titleRun.setFontSize(14);
                titleRun.setBold(true);
                titleRun.addTab();
                titleRun.setText(section.getTitle());
                titleRun.addBreak();

                if (section.getSubsections() != null) {
                    for(Subsection subsection: section.getSubsections()) {
                        String subsectionTitle = subsection.getTitle();

                        XWPFRun sectionRun = sectionParagraph.createRun();
                        sectionRun.setFontFamily("Times New Roman");
                        sectionRun.setFontSize(13);
                        sectionRun.setBold(true);
                        sectionRun.setUnderline(UnderlinePatterns.SINGLE);
                        section.setTitle(subsectionTitle);
                        sectionRun.addBreak();

                        if (subsection.getQuestions() != null){
                            for(Question question: subsection.getQuestions()) {

                                String comment = question.getComment();
                                QuestionType type = question.getType();

                                XWPFRun questionRun = sectionParagraph.createRun();
                                questionRun.setFontFamily("Times New Roman");


                                if (type != null) {
                                    switch (type) {
                                        case TEXT:
                                            TextQuestion textQuestion = (TextQuestion) question;
                                            String questionText = textQuestion.getQuestion();
                                            String answer = textQuestion.getAnswer() == null ? " не указано " : textQuestion.getAnswer();

                                            questionRun.setText(questionText + ":" + answer);
                                            questionRun.addBreak();

                                            break;
                                        case CHECKBOX:
                                            CheckboxQuestion checkboxQuestion = (CheckboxQuestion)question;
                                            String questionTitle = checkboxQuestion.getTitle();
                                            List<TextQuestion> options = checkboxQuestion.getOptions();

                                            questionRun.setText(questionTitle);
                                            questionRun.addBreak();
                                            questionRun.addBreak();

                                            if (options != null){
                                                for (TextQuestion tq: options)
                                                {
                                                    String key = tq.getQuestion();
                                                    String value = tq.getAnswer() == null
                                                            || Boolean.valueOf(tq.getAnswer()) == false ? "нет" : "да";
                                                    questionRun.addTab();
                                                    questionRun.setText(key + ": " + value);
                                                    questionRun.addBreak();
                                                }
                                                questionRun.addBreak();
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                    if (comment != null) {
                                        questionRun.setText("Комментарий: " + comment);
                                        questionRun.addBreak();
                                        questionRun.addBreak();
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }


        document.write(out);

        return file;
    }
}
