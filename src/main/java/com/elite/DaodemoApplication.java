package com.elite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.elite.entities.Employee;
import com.elite.repositories.EmployeeRepository;

import lombok.NoArgsConstructor;

@SpringBootApplication

public class DaodemoApplication implements CommandLineRunner {

	// injection de dépendance DI
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(DaodemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("hello from your console");
		Employee em=new Employee("user", "my user", 3000, 2020, "chef", "user@gmail.com", "azerty", "22345122");
		Employee em2=new Employee("user4", "my user4", 1500, 2020, "dev", "user4@gmail.com", "azerty2", "91345122");
		//employeeRepository.save(em2);
		Employee em3=new Employee("user3", "my user3", 4500, 2020, "admin", "admin@gmail.com", "azerty22", "92345144");

		//employeeRepository.save(em3);
		System.out.println("affichage complet");
		employeeRepository.findAll().forEach(emp->{
System.out.println(emp.toString());
});
		System.out.println("filtrage par nom");
		employeeRepository.findByNom("user4").forEach(emp2->{
			System.out.println(emp2);
		});;
		System.out.println("filtrage par salaire");
		employeeRepository.findBySalaireLessThanEqual(3300).forEach(emp2->{
			System.out.println(emp2);
		});;
		//employeeRepository.deleteById(1);
	}

}
