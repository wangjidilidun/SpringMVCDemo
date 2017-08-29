package com.wangjidilidun.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MultiController {
	@RequestMapping(value = "/add", method=RequestMethod.GET)
  public ModelAndView add(HttpServletRequest request,HttpServletResponse response){
      System.out.println("-----add----");
      return new ModelAndView("/multi","method","add");
  }
	@RequestMapping(value = "/update", method=RequestMethod.GET)
  public ModelAndView update(HttpServletRequest request, HttpServletResponse reponse){
	  return new ModelAndView("/multi", "method", "update");
  }

}
