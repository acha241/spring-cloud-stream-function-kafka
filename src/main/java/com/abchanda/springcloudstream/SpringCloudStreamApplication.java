package com.abchanda.springcloudstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;

@SpringBootApplication
public class SpringCloudStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamApplication.class, args);
	}

}
