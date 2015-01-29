package com.reuters.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {

	@RequestMapping("TestController")
	//@ResponseBody
	public String test(){
		return "haha";
	}
}
