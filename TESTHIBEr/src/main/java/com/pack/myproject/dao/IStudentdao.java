package com.pack.myproject.dao;

import java.util.List;

import com.pack.myproject.entities.Etudiant;

public interface IStudentdao {

  public  Long AddEtudient(Etudiant e);
   public List<Etudiant> listEtudiant();
   public Etudiant getEtudiant(Long Id);
}
