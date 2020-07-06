package pl.teessoft.addingnumbers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableCircuitBreaker
@SpringBootApplication
public class AddingNumbersApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddingNumbersApplication.class, args);
	}

}
