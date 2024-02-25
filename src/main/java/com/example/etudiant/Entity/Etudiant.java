package com.example.etudiant.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
private long id;
private String prenom;
private String nom;
private String login;
private String password;
}
