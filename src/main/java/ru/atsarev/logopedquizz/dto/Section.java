package ru.atsarev.logopedquizz.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Section {

    private String title;
    private List<Subsection> subsections;
}
