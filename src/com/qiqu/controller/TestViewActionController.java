package com.qiqu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/test")
@Controller
public class TestViewActionController {
	
	@RequestMapping("view/testView")
	public String testView() {
		return "test/test";
	}
}