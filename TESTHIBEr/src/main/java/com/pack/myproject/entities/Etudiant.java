package com.pack.myproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Etudiant {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
	@NotEmpty
 private String nom;
	@NotEmpty
	@Size(min=4,max=10)
 private String prenom;
 
public Etudiant() {
	super();
}
public Etudiant( String nom, String prenom) {
	super();
 
	this.nom = nom;
	this.prenom = prenom;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
}
