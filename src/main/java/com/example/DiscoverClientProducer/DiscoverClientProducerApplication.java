package com.example.DiscoverClientProducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class DiscoverClientProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverClientProducerApplication.class, args);
	}

}
