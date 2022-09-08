package com.itzsrv.demofirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemofirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemofirstApplication.class, args);
	}

}

@RestController
class MyController{

	@GetMapping("/api/greeting")
	public String offerGreeting(){
		return "Howdy!";
	}
}
