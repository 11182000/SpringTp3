package com.example.etudiant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.etudiant.Entity.Etudiant;
@Component
public interface EtudiantRep extends JpaRepository<Etudiant, Long > {
	//creation d'une methode de rep
	public Etudiant findByLoginAndPassword(String login,String password);

}
