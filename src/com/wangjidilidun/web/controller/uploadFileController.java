package com.wangjidilidun.web.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
@RequestMapping("/file")
public class uploadFileController {
	@RequestMapping("/upload")
	public String toUpload(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request, HttpServletResponse reponse) throws IOException{
		System.out.println("fileName:\t" + file.getOriginalFilename());
		if(!file.isEmpty()){
			FileOutputStream os = new FileOutputStream("D:/" + new Date().getTime() + file.getOriginalFilename());
			InputStream in = file.getInputStream();
			int b = 0;
			while((b = in.read()) != -1){
				os.write(b);
			}
			os.flush();
			os.close();
			in.close();
		}
		return "/success";
	}
	@RequestMapping("/toUpload")
	public String toUpload(){
		return "/upload";
	}
}
