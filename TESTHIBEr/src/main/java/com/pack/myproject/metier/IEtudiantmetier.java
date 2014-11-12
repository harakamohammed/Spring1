package com.pack.myproject.metier;

import java.util.List;

import com.pack.myproject.entities.Etudiant;

public interface IEtudiantmetier {
	 public  Long AddEtudient(Etudiant e);
	   public List<Etudiant> listEtudiant();
	   public Etudiant getEtudiant(Long Id);
}
