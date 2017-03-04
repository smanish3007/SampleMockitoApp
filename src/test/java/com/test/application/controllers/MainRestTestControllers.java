package com.test.application.controllers;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.main.application.components.MainComponent;
import com.main.application.controllers.MainRestController;

import  org.junit.Assert;
@RunWith(MockitoJUnitRunner.class)
public class MainRestTestControllers {
	
	@InjectMocks
	MainRestController mainTestRestContoller=new MainRestController() ;
	@Mock
	MainComponent mockMainComponent;
	
	
	@Test
	public void testShowName() {
		when(mainTestRestContoller.showName()).thenReturn("hi manish");
		Assert.assertEquals(mainTestRestContoller.showName(),"hi manish");
		when(mockMainComponent.sendName()).thenReturn("hi,name has been sent");
		System.out.println("hi manish");
		Assert.assertEquals(mockMainComponent.sendName(),"hi,name has been sent");
		verify(mockMainComponent).sendName();
		
		
	}


	

}
