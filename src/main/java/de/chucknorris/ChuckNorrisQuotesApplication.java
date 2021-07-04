package de.chucknorris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ChuckNorrisQuotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisQuotesApplication.class, args);
	}

}
