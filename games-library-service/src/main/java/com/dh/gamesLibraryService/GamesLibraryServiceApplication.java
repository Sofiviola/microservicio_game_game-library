package com.dh.gamesLibraryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"com.dh.gamesLibraryService.client","com.dh.gamesLibraryService.service"})
@SpringBootApplication
@EnableDiscoveryClient
public class GamesLibraryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamesLibraryServiceApplication.class, args);
	}

}
