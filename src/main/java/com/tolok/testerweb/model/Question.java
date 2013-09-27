
package com.tolok.testerweb.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Question {
    
    @Id
    private String key;
    private String pictureURI;
    private String questionText;
    private List<Answer> answers;

    public String getPictureURI() {
        return pictureURI;
    }

    public void setPictureURI(String pictureURI) {
        this.pictureURI = pictureURI;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
    
    
}
