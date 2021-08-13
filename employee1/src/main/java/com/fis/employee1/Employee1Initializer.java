package com.fis.employee1;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
class ItemInitiallizer implements CommandLineRunner {

    private final Employee1Repository employee1Repository;

    ItemInitiallizer(Employee1Repository employee1Repository) {
        this.employee1Repository = employee1Repository;
    }

	@Override
	public void run(String... args) throws Exception {
		Stream.of("tester", "devloper", "FSD", "data analyst", "maneger")
                .forEach(employee1 -> employee1Repository.save(new Employee1(employee1)));

        employee1Repository.findAll().forEach(System.out::println);
    }
}	