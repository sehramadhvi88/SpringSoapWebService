package com.ws.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({WebServiceConfig.class})
@ComponentScan(basePackages={"com.ws"}) 
public class WebServiceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceProjectApplication.class, args);
	}
}
