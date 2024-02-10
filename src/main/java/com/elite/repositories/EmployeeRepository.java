package com.elite.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elite.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
List<Employee> findByNom(String nom);
List<Employee> findByNomAndPrenom(String nom,String prenom);
List<Employee> findBySalaireLessThanEqual(double salaire);
}
