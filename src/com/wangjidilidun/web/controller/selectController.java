package com.wangjidilidun.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/select")
public class selectController {

	@RequestMapping("/toSelect")
	public String toUpload(){
		return "/select2Test";
	}
}
