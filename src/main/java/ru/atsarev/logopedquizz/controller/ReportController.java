package ru.atsarev.logopedquizz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.atsarev.logopedquizz.builders.DocumentBuilder;
import ru.atsarev.logopedquizz.dto.Report;
import ru.atsarev.logopedquizz.stubs.ReportStub;

import java.io.File;
import java.io.IOException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/reports")
public class ReportController {

    @Autowired
    ReportStub stub;

    @RequestMapping(value = "/ndvpfd", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Report getReport() {
        Report report = new Report();
        stub.fillStubForNdvpfd(report);

        return report;
    }

    @RequestMapping(value = "/documents",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_OCTET_STREAM_VALUE
    )
    @ResponseBody
    public ResponseEntity<FileSystemResource>  generateDocument(@RequestBody Report report) throws IOException {
        DocumentBuilder docBuilder = new DocumentBuilder();
        File doc = docBuilder.createWord(report);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Disposition", "attachment; filename=\"otchet.doc\"");

        return ResponseEntity
                .ok()
                .headers(responseHeaders)
                .body(new FileSystemResource(doc));
    }
}
