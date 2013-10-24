/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tolok.testerweb.services;

import com.google.code.morphia.DAO;
import com.tolok.testerweb.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author Serhii_Tolok
 */
public class UserService {
    @Autowired
    @Qualifier("User")
    private DAO<User, String> dao; 
    
    
    public void insert(User user){
        dao.save(user);
    }
    
    public List<User> findAll(){
        return dao.find().asList();
    }
    
    
}
