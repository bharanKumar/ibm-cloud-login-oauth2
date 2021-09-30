package com.cloud.login.cloudlogindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableOAuth2Sso
@Configuration
public class CloudLoginDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudLoginDemoApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplateBean() {
		return new RestTemplate();
	}
	
}
