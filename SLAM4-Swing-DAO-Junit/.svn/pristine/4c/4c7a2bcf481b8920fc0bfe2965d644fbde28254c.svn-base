package edu.lev.ymf.slam4.bo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.text.DateFormat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.lev.ymf.slam4.dao.PersonneDAO;

class PersonneDAOTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDaoFind1() {
		PersonneDAO tempo = new PersonneDAO();
		Personne unePersonne = tempo.find(1);
		assertEquals(1, unePersonne.getId());
		assertEquals("FONTENOY", unePersonne.getNom());
		assertEquals("Yann", unePersonne.getPrenom());
		assertEquals("1995-05-23", unePersonne.getNaissance().toString()); 
		assertEquals(1, unePersonne.getAdresse().getId());
	}

	@Test
	void testDaoFind999999() {
		PersonneDAO tempo = new PersonneDAO();
		Personne unePersonne = tempo.find(999999);
		assertEquals(null, unePersonne);
	}
	
	@Test
	void testSearch() {
		fail("Not yet implemented"); // TODO
	}

}
