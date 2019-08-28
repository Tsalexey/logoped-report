package ru.atsarev.logopedquizz.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Quizz {
    String question;
    String answer;
    boolean commentAllowed;
}
