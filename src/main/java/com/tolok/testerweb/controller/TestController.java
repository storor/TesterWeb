/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tolok.testerweb.controller;

import com.tolok.testerweb.dao.AbstractDao;
import com.tolok.testerweb.dao.TestDaoMongo;
import com.tolok.testerweb.model.Test;
import com.tolok.testerweb.model.User;
import com.tolok.testerweb.services.UserService;
import java.util.Collection;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ������
 */
@Controller
public class TestController {
        
        @RequestMapping(method = RequestMethod.GET, value = "/tests",
            headers = "Accept=application/json")
        public @ResponseBody Collection<Test> readAllTests() {
            
             Test t1 = new Test();
        t1.setName("test1");
        t1.setLevel(1);
        Test t2 = new Test();
        t2.setName("test2");
        t2.setLevel(1);
        
        TestDaoMongo tDao = new TestDaoMongo();
        tDao.create(t1);
        tDao.create(t2);
            
                AbstractDao<Test> testDao = new TestDaoMongo();
                return testDao.readAll();
        }
        
        @RequestMapping(method = RequestMethod.GET, value = "/testst",
            headers = "Accept=text/html")
        public @ResponseBody String readAllTestsText() {
            
             Test t1 = new Test();
        t1.setName("test1");
        t1.setLevel(1);
        Test t2 = new Test();
        t2.setName("test2");
        t2.setLevel(1);
        
        TestDaoMongo tDao = new TestDaoMongo();
        tDao.create(t1);
        tDao.create(t2);
            
                AbstractDao<Test> testDao = new TestDaoMongo();
                return testDao.readAll().toString();
        }
        
        @RequestMapping(method = RequestMethod.GET, value = "/users",
            headers = "Accept=application/json")
        public @ResponseBody Collection<User> readAllUsers() {
            UserService us = new UserService();
            User us0 = new User();
            User us1 = new User();
            User us2 = new User();
            us.insert(us0);
            us.insert(us1);
            us.insert(us2);
            return us.findAll();
        }
}
