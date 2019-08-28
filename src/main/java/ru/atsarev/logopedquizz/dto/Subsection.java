package ru.atsarev.logopedquizz.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Subsection {

    private String title;
    private List<Question> questions;
}
