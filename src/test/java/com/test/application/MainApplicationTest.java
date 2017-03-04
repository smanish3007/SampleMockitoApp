package com.test.application;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.main.application.MainApplication;
@RunWith(MockitoJUnitRunner.class)
public class MainApplicationTest {
	@InjectMocks
	MainApplication mainApp=new MainApplication();
	
	
    

	@Test
	public void testMain() {
		System.out.println("Hi Frnds "+mainApp.getClass());
		fail("Not yet implemented"); // TODO
	}

}
