package com.sist.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sist.controller"}) // xml없이 코딩
public class StringBootGoodsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringBootGoodsProjectApplication.class, args);
	}

}
