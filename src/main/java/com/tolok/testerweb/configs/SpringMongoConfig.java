/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tolok.testerweb.configs;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 *
 * @author ������
 */
@Configuration
public class SpringMongoConfig{
 
	public @Bean
	MongoDbFactory mongoDbFactory() throws Exception {
		return new SimpleMongoDbFactory(new MongoClient(), "testerbd");
	}
 
	public @Bean
	MongoTemplate mongoTemplate() throws Exception {
 
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
 
		return mongoTemplate;
 
	}
}
