package com.sts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/testHandler")
	@ResponseBody
	public String testHandler()
	{
		return "Sample Application";
	}

}
