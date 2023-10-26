package br.edu.unoesc.springboot.progll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "br.edu.unoesc.springboot.progll.model")
@SpringBootApplication
public class ProgllApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgllApplication.class, args);
	}
}
