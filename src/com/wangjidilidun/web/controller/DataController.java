package com.wangjidilidun.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wangjidilidun.web.controller.entity.User;

@Controller
@RequestMapping("/data")
public class DataController {
	@RequestMapping("/addUser")
	public String helloWorld(User user, HttpServletRequest request, HttpServletResponse response){
		System.out.println(user.getUserName() + ":\t" + user.getAge());
		request.setAttribute("userName", user.getUserName());
		request.setAttribute("userAge", user.getAge());
		return "/userManager";
	}
	
	@RequestMapping("/addUserJson")
	public void addUserJson(User user, HttpServletRequest request, HttpServletResponse response){
		System.out.println(user.getUserName() + ":\t" + user.getAge());
		request.setAttribute("userName", user.getUserName());
		request.setAttribute("userAge", user.getAge());
		
		String result = "{\"userName\":\"" + user.getUserName() + "\", \"age\": \""+ user.getAge() +"\"}";
		PrintWriter out = null;
		response.setContentType("application/json");
		try{
			out=response.getWriter();
			out.write(result);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/toUser")
	public String toUser(){
		return "/addUser";
	}
	@RequestMapping("/toUserJson")
	public String toUserJson(){
		return "/json";
	}
}
