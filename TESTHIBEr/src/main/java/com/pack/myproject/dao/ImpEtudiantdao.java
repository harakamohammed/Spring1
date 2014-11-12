package com.pack.myproject.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.pack.myproject.entities.Etudiant;

@Transactional
public class ImpEtudiantdao implements IStudentdao {
   
	@PersistenceContext
	EntityManager em;
	
	@Override
	public Long AddEtudient(Etudiant e) {

       em.persist(e);
		return e.getId();
	}

	@Override
	public List<Etudiant> listEtudiant() {
		
		return em.createQuery("select e from Etudiant e").getResultList();
	}

	@Override
	public Etudiant getEtudiant(Long Id) {
		 
		return em.find(Etudiant.class,Id);
	}

}
