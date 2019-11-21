package com.bhanna.hockeystats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bhanna.hockeystats.team.controller")
@ComponentScan("com.bhanna.hockeystats.player.controller")
public class HockeystatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HockeystatsApplication.class, args);
	}

}
