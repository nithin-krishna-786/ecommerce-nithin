package com.nithin.bootifyecommerce2;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootifyEcommerce2Application {

	public static void main(String[] args) {
		SpringApplication.run(BootifyEcommerce2Application.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
