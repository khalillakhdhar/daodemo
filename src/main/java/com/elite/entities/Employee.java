package com.elite.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends AuditModel {

@Column(nullable = false)	
private String nom,prenom;
@Column(nullable = false)
private double salaire;
@Column(nullable = false)
private int recrutement;
@Column(nullable = false)
private String grade;
@Email
@Column(unique = true)
private String email;
private String mdp;
@Column(unique = true)
private String tel;

}
