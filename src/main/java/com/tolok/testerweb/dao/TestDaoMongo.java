/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tolok.testerweb.dao;

import com.tolok.testerweb.model.Test;

/**
 *
 * @author Сергей
 */
public class TestDaoMongo extends AbstractDaoMongo<Test>{
    
    public TestDaoMongo(){
        this.type = Test.class;
    }

    public boolean update(Test entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
}
