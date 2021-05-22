package com.webservice.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.webservice.app.HelloService;
@SpringBootApplication
public class CommandLineApplication {
	private static final Logger logger = LoggerFactory.getLogger(CommandLineApplication.class);
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CommandLineApplication.class, args);
		HelloService service =  context.getBean(HelloService.class);
		logger.info(service.getMessage());
        }       
} 
