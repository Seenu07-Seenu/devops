package com.devops.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/devops")
public class DevopsController {

	@GetMapping("/getvalue")
	public String get() {
		return "hello world";
	}
	
	@GetMapping("/getval")
	public String get1() {
		return "hello";
	}
	
}
