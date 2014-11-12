package com.pack.myproject;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.myproject.entities.Etudiant;
 
import com.pack.myproject.metier.IEtudiantmetier;
import com.pack.myproject.metier.ImpEtudiantmetier;

public class TESTJPA {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test2() {
		
		try {
			
			ClassPathXmlApplicationContext app =
					new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
			IEtudiantmetier metier=(IEtudiantmetier) app.getBean("metier");
			List<Etudiant> Liste1=metier.listEtudiant();
			metier.AddEtudient(new Etudiant("MOHAMMEd","BB564578"));
			metier.AddEtudient(new Etudiant("ZINEB","EMM"));
			List<Etudiant> Liste2=metier.listEtudiant();
			assertTrue(Liste1.size()+2==Liste2.size());
			
		} catch (Exception e) {
			assertTrue(e.getMessage(), false);
		}
		
	 
	
}
	
	@Test
	public void test() {
		 
		try {
			ClassPathXmlApplicationContext app =
					new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(e.getMessage(), false);
		}
	}

}
