package com.gigablog.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// try {
        //     Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        //     dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
        // } catch (Exception e) {
        //     System.out.println("No .env file found or error loading it. Relying on system environment variables.");
        // }
		SpringApplication.run(Application.class, args);
	}
	
}
