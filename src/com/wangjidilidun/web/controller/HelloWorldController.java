package com.wangjidilidun.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/welcome", method=RequestMethod.GET)
	public ModelAndView Welcome(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("---------hello wangjidilidun -------");
		String hello = "wangcy hello";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("map1", "I am a solder");
		map.put("map2", hello);
		map.put("map3", 123);
		return new ModelAndView("/welcome1", "map", map);
	}

}
