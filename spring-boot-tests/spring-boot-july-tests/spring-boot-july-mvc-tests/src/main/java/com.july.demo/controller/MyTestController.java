package com.july.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 测试Controller
 */
@Controller
@RequestMapping("/test")
public class MyTestController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
}
