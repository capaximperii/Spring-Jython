package com.twotrees;

import org.jython.etl.interfaces.ExampleType;
import com.twotrees.etl.JythonFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class EtlApplication {
	@PostConstruct
	void try_jython() {
		System.out.println("HERE WE ARE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		JythonFactory factory = new JythonFactory("Example", "Example");
		System.out.println("Factory created");
		ExampleType example  = factory.create();
		System.out.println("Saying hello");
		Map<String, String> test = new HashMap<String, String>();
		test.put("Elsa","Anna");
		Map<String, String> result = example.say_hello(test);
		System.out.println("Java says " + result.get("Elsa"));

	}

	public static void main(String[] args) {
		SpringApplication.run(EtlApplication.class, args);
	}
}
