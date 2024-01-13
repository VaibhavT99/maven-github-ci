package com.stackroute.customresponse.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CustomResponseController {

    private String responseString =
            "<!doctype html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "<meta charset=\"utf-8\">\n" +
            "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
            "<title>Spring Boot</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<h1>HELLO WORLD - SPRING BOOT WITH CODE PIPELINE</h1>\n" +
            "</body>\n" +
            "</html>";

    @GetMapping
    public ResponseEntity<String> response() {
        return new ResponseEntity<>(responseString, HttpStatus.OK);
    }
}
