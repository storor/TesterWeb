
package com.tolok.testerweb.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Test {   
    @Id
    private String key;
    private List<Question> question;    
    private String name;
    private Integer level;
    private String theme;    

    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
    
    
}
