package ru.atsarev.logopedquizz.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum QuestionType {

    @JsonProperty("text")
    TEXT("text"),
    @JsonProperty("checkbox")
    CHECKBOX("checkbox");

    private String stringValue;

    QuestionType(String s) {
        stringValue = s;
    }

    @JsonValue
    public String toValue(){
        return stringValue;
    }

}
