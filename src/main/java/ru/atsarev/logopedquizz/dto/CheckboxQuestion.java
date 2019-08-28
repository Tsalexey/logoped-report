package ru.atsarev.logopedquizz.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CheckboxQuestion extends Question {

    private String title;
    private List<TextQuestion> options;

    public CheckboxQuestion() {
        super(QuestionType.CHECKBOX);
    }

    @JsonProperty("type")
    public String getStringType() {
        return QuestionType.CHECKBOX.toValue();
    }

}
