package com.twotrees;

import org.jython.example.interfaces.ExampleType;
import com.twotrees.etl.JythonFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class EtlApplication {
	@PostConstruct
	void try_jython() {
		System.out.println("HERE WE ARE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		JythonFactory factory = new JythonFactory("Example", "Example");
		System.out.println("Factory created");
		ExampleType example  = factory.create();
		System.out.println("Saying hello");
		example.say_hello();
		System.out.println("done");

	}

	public static void main(String[] args) {
		SpringApplication.run(EtlApplication.class, args);
	}
}
