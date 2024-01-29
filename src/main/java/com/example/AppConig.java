package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AppConig {
	
@RequestMapping("/welcome")
public String hello(){
	return "Welcome Shresth";
}
}
