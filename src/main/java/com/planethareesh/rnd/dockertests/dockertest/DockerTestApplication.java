package com.planethareesh.rnd.dockertests.dockertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerTestApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home() {
		return "Hello World!!";
	}
	
	@RequestMapping("/feature01")
	public String testFeature01() {
		return "This is a test feature!!";
	}

}
