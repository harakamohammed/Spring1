package com.pack.myproject.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.pack.myproject.dao.IStudentdao;
import com.pack.myproject.dao.ImpEtudiantdao;
import com.pack.myproject.entities.Etudiant;
@Transactional
public class ImpEtudiantmetier implements IEtudiantmetier {
   
	private IStudentdao dao;
	@Override
	public Long AddEtudient(Etudiant e) {
		// TODO Auto-generated method stub
		return dao.AddEtudient(e);
	}

	@Override
	public List<Etudiant> listEtudiant() {
		// TODO Auto-generated method stub
		return dao.listEtudiant();
	}

	@Override
	public Etudiant getEtudiant(Long Id) {
		// TODO Auto-generated method stub
		return dao.getEtudiant(Id);
	}

	public void setDao(IStudentdao dao) {
		this.dao = dao;
	}

}
