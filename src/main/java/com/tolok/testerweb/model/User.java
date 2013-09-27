/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tolok.testerweb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Сергей
 */

@Document
public class User {
    @Id
    private String key;
    private String login;
    private String password;
    private String email;
    private String name;
    
}
