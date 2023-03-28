package com.sun.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

	@RequestMapping("/test")
	public String test() {
		System.out.println("SpringBooty源码阅读环境构建成功...");
		return "SpringBooty源码阅读环境构建成功";
	}
}
