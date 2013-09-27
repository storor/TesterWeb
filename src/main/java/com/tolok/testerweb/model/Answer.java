package com.tolok.testerweb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Answer {

    @Id
    private String key;
    private String pictureURI;
    private String answerText;
    private Boolean correct;
}
