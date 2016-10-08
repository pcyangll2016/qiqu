package com.qiqu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/test1")
@RestController
public class TestActionController {

	@RequestMapping("testData")
	public Map<String, Object> testDate() {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("success", true);
		return data;
	}
	
	@RequestMapping("testView")
	public String testView() {
		return "test/test";
	}
}