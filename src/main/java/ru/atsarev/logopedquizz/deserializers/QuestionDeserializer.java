package ru.atsarev.logopedquizz.deserializers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import ru.atsarev.logopedquizz.dto.Question;

import java.io.IOException;

public class QuestionDeserializer extends StdDeserializer<Question> {

    public QuestionDeserializer() {
        this(null);
    }

    public QuestionDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Question deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        JsonNode node = jp.getCodec().readTree(jp);



//        int id = (Integer) ((IntNode) node.get("id")).numberValue();
//        String itemName = node.get("itemName").asText();
//        int userId = (Integer) ((IntNode) node.get("createdBy")).numberValue();
//
//        return new Item(id, itemName, new User(userId, null));
        return new Question();
    }
}