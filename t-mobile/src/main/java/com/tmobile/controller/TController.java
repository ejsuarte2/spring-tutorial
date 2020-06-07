package com.tmobile.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TController {
	
	@RequestMapping(value="/")
	public String hello() {
		return "Hello I work";
	}

}
