package ir.microservices.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class MicroservicesEurekaClientApplication {


	@RequestMapping("/hello")
	public String sayHello(){
		return "Hello";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesEurekaClientApplication.class, args);
	}
	
}
