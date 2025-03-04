package za.co.digitalplatoon;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}
	
	  @Bean
	    ApplicationRunner BootstrapApplication() {
	        return new BootstrapApplication();
	    }

}
