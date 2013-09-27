/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tolok.testerweb.dao;

import java.util.Collection;

/**
 *
 * @author Сергей
 */
public interface AbstractDao<T> {
    void create(T entity);
    boolean update(T entity);
    T read(String key);
    void delete(String key);
    Collection<T> readAll();
    
}
