package com.jumppang.hakeyemgr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {

	@GetMapping("/hellow") 
	public String hi()	{
		
		return "hi there";
	}
}
