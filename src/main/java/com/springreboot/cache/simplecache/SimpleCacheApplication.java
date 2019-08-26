package com.springreboot.cache.simplecache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableCaching
@EnableScheduling
@SpringBootApplication
public class SimpleCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleCacheApplication.class, args);
	}

}
