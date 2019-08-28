package ru.atsarev.logopedquizz.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.atsarev.logopedquizz.deserializers.QuestionDeserializer;

@Data
@NoArgsConstructor
//@JsonDeserialize(using = QuestionDeserializer.class)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="type")
@JsonSubTypes({
        @JsonSubTypes.Type(name="text", value=TextQuestion.class),
        @JsonSubTypes.Type(name="checkbox", value=CheckboxQuestion.class)
})
public class Question {

    private QuestionType type;
    private String comment;

    public Question(QuestionType type){
        this.type = type;
    }

    public String getTypeValue(){
        return type.toValue();
    }

}
