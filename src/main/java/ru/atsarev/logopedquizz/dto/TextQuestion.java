package ru.atsarev.logopedquizz.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

import java.beans.Transient;

@Data
public class TextQuestion extends Question {

    private String question;
    private String answer;

    public TextQuestion() {
        super(QuestionType.TEXT);
    }

    @JsonProperty("type")
    public String getStringType() {
        return QuestionType.TEXT.toValue();
    }
}
