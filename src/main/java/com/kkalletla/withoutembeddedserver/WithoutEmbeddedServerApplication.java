package com.kkalletla.withoutembeddedserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WithoutEmbeddedServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(WithoutEmbeddedServerApplication.class, args);
	}

	@RequestMapping("/hello")
	public String sayHello(){
		return "Hello World";
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WithoutEmbeddedServerApplication.class);
	}
}
