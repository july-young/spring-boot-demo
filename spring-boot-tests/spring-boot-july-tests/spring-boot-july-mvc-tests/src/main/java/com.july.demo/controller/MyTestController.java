package com.july.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 测试Controller
 */
@Controller
@RequestMapping("/test")
public class MyTestController {

	@ResponseBody
	@RequestMapping("/hello/{id}")
	public String hello(@PathVariable Integer id) {

		if(1 == id){
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		return "hello world"+id;
	}
}
