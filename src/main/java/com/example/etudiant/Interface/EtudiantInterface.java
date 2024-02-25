package com.example.etudiant.Interface;

import java.util.List;

import com.example.etudiant.Entity.Etudiant;

public interface EtudiantInterface {
	// methode pour ajouter
public Etudiant Ajouter(Etudiant etud);
//methode pour rechercher
public Etudiant Rechercher(long id);

//methode pour lister
public List<Etudiant> Lister();

//methode pour supprimer
public void Supprimer(long id);

//methode de connexion
public Iterable<Etudiant> Connecter(String Login,String Password);

}
