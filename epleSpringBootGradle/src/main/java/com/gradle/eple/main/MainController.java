package com.gradle.eple.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	public String main(){
		return "hello spring boot gradle";
	}
}
