/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tolok.testerweb.model;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.emul.org.bson.types.ObjectId;

/**
 *
 * @author Сергей
 */
@Entity("users")
public class User {
    
    @Id private ObjectId id;
    private String login;
    private String password;
    private String email;
    private String name;
}
