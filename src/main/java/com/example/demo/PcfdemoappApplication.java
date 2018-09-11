package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PcfdemoappApplication {

	@RequestMapping("/")
	public String hello() {
		String java_ver = System.getProperty("java.vm.version");
		String app_ver = "3";
		String app_index = System.getenv("CF_INSTANCE_INDEX");
		String app_host = System.getenv("CF_INSTANCE_IP");
		return "Mixi"
				+"\r\n"
				+"Current app version = " + app_ver
				+"\r\n"
				+"Current java version = " + java_ver
				+"\r\n"
				+"App index = " + app_index
				+"\r\n"
				+"App host = " + app_host;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(PcfdemoappApplication.class, args);
	}
}
