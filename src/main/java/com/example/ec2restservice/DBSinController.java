package com.example.ec2restservice;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// imports for use List, Map, String and Object

import java.lang.String;


@Controller
@RequestMapping(path="/")
public class DBSinController {

    @GetMapping(path="/")
	public @ResponseBody String home() {
		return "LN48515275 - Chavez Riva Johan Sam";
	}


    @GetMapping(path="/idat/codigo")
	public @ResponseBody String codigo() {
		return "LN48515275";
	}


    @GetMapping(path="/idat/nombre-completo")
	public @ResponseBody String nombre() {
		return "Chavez Riva Johan Sam";
	}
    
}
