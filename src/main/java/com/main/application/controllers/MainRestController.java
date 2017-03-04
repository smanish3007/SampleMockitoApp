package com.main.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.main.application.components.MainComponent;

@RestController
@RequestMapping("test")
public class MainRestController {
	@Autowired
	MainComponent mainComponent;
	
	

	/*public MainRestController() {
		super();
		// TODO Auto-generated constructor stub
	}
	



	public MainRestController(MainComponent mainComponent) {
		super();
		this.mainComponent = mainComponent;
	}*/




	@RequestMapping(value="/name",method=RequestMethod.GET)
	public String showName()
	{
		return mainComponent.sendName();
	}
	

}
