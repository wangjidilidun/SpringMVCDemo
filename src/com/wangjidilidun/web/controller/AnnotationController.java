package com.wangjidilidun.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/anno")
public class AnnotationController {
	@RequestMapping("/helloworld")
	public String helloWorld(HttpServletRequest request, HttpServletResponse response){
		System.out.println("---------hello wangjidilidun -------");
		String hello = "wangcy hello";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("map1", "I am a solder");
		map.put("map2", hello);
		map.put("map3", 123);
		
		request.setAttribute("map", map);
		request.setAttribute("msg", "hello world!");
		return "/welcome1";
	}
	
	@RequestMapping("/staticFile")
	public String staticFile(HttpServletRequest request, HttpServletResponse response){		
		System.out.println("---------static File -------");
		request.setAttribute("msg", "hello world!!!!!!!");
		return "/staticFile";
	}
	
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request, HttpServletResponse response){	
		request.setAttribute("msg", "post 请求啊");
		return "/staticFile";
	}

}
