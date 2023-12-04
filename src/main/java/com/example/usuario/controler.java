package com.example.usuario;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class controler {
	
@RequestMapping("/")
public String index(){
	return "index";
}
}
