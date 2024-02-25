package com.example.etudiant.Interface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.etudiant.Entity.Etudiant;
import com.example.etudiant.repository.EtudiantRep;
@Service
public class EtudiantService implements EtudiantInterface {
	@Autowired
	private EtudiantRep er;

	@Override
	public Etudiant Ajouter(Etudiant etud) {
		if(etud.getId()==0) {
		return er.save(etud);
		}else {
			Etudiant et=er.findById(etud.getId()).get();
			et.setPrenom(etud.getPrenom());
			et.setNom(etud.getNom());
			et.setLogin(etud.getLogin());
			et.setPassword(etud.getPassword());
			return er.save(et);
		}
	}

	@Override
	public Etudiant Rechercher(long id) {
		Optional <Etudiant> Opt=er.findById(id);
		Etudiant etud=null;
		if(Opt.isPresent()) {
			etud=Opt.get();
		}else {
			throw new RuntimeException("login ou password incorrect"+id);
		}
		
		return etud;
		
		
	}

	@Override
	public List<Etudiant> Lister() {
		
		return er.findAll();
	}

	@Override
	public void Supprimer(long id) {
		
		er.deleteById(id);
	}

	@Override
	public Iterable<Etudiant> Connecter(String Login, String Password) {
		Iterable <Etudiant> etud=(Iterable<Etudiant>) er.findByLoginAndPassword(Login, Password);
		if(etud!=null) {
			return etud;
		}else {
			throw new RuntimeException("login ou password incorrect");
		}
	}

	

}
