package com.tinnova.prova;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FatorialController {
	
	@RequestMapping("/fatorial")
	public String fatorial(){
		return Fatorial.result(10);
	}

}