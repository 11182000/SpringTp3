package com.example.etudiant.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.etudiant.Entity.Etudiant;
import com.example.etudiant.Interface.EtudiantService;
import com.example.springtp1.entity.utilisateur;

@Controller
public class EtudiantController {
@Autowired
EtudiantService es;
@GetMapping("/")
public String Homepage(Model model) {
	model.addAttribute("utilisateur",new utilisateur());
	return "admin/auth/welcome";
}
@GetMapping("/newUser")
public String ShowPageAjout(Model model) {
	Etudiant etudiant=new Etudiant();
	model.addAttribute("Etudiant",etudiant);
	return "admin/auth/newUser";
	
}

}
