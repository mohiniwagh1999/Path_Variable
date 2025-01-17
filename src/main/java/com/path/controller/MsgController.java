package com.path.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MsgController {

	@GetMapping("/greet")
	public String getMsg(Model model)
	{
		model.addAttribute("msg", "good morning all");
		return "index";
	}
	
	@GetMapping("/welcome")
	@ResponseBody
	public String getwel(@RequestParam("name") String name)
	{
		
		return name+",welcome to ashok it";
	}
	
	
	@GetMapping("/wel/{name}")
	@ResponseBody
	public String getwel1(@PathVariable("name") String name)
	{
		
		return name+",welcome to ashok it";
	}
	
	
	
	
}
