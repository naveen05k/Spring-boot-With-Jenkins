package com.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootProjectForJenkinsApplication {
	public static Logger logger = LoggerFactory.getLogger(SpringbootProjectForJenkinsApplication.class);

	@PostConstruct
	public void inti() {
		logger.info("Application Started ...");
	}

	public static void main(String[] args) {
		logger.info("Application excuted..");
		SpringApplication.run(SpringbootProjectForJenkinsApplication.class, args);
	}

}
