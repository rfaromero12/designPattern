package com.example.demo.factoryTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import creationalDesignPattern.Factory.Boss;
import creationalDesignPattern.Factory.WorkerFactory;

public class FactoryTest {
	
	
	@BeforeEach
	void initialize() {
		
	}
	
	@Test
	void createBoss() {
		Boss newBoss = WorkerFactory.createWorker(Boss.class);
		
		Assertions.assertTrue(newBoss.getClass().equals(Boss.class));
	}
}
