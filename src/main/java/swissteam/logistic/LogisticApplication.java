package swissteam.logistic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class LogisticApplication {

	public static void main(String[] args) {

		SpringApplication.run(LogisticApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(PasswordEncoder encoder){
		System.out.println(encoder.encode("password"));
		return args -> {};
	}
}
