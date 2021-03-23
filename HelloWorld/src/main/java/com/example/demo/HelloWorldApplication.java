package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.component.DemoBean;
import com.example.demo.component.EmployeeBean;
import com.example.demo.controller.HelloRestController;


@SpringBootApplication
public class HelloWorldApplication {
	public static final Logger logger = LoggerFactory.getLogger(HelloWorldApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.debug("Demo Bean = "+demoBean.toString());
		logger.debug("Checking Context:"+context.getBean(HelloRestController.class));
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
	}

}

