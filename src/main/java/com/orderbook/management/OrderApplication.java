package com.orderbook.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class OrderApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

}
