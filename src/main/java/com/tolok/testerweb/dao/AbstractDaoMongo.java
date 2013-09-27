/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tolok.testerweb.dao;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 *
 * @author Сергей
 */
public abstract class AbstractDaoMongo<T> implements AbstractDao<T> {
    
    @Autowired
    MongoTemplate mongoTemplate;
    
    protected Class type;
    MongoOperations mongoOperation;
    
    public void create(T entity) {
        mongoOperation = (MongoOperations) mongoTemplate;
        mongoOperation.save(entity);
    }

    public boolean update(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public T read(String key) {
        Query searchQuery = new Query(Criteria.where("key").is(key));
        return (T) mongoOperation.findOne(searchQuery, type);
    }

    public void delete(String key) {
        Query searchQuery = new Query(Criteria.where("key").is(key));
        mongoOperation.remove(searchQuery, type);
    }

    public Collection<T> readAll() {
        return mongoOperation.findAll(type);
    }
}
