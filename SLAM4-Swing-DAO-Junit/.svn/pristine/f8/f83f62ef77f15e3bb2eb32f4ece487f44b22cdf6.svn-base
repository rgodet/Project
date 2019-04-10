/**
 * 
 */
package edu.lev.ymf.slam4.bo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author ymf
 *
 */
class AdresseTests {

	private Adresse valTest1;
	private Adresse valTest2;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		valTest1 = new Adresse(6, "rue", "ville", "75000");
		valTest2 = new Adresse(33, 5, "rue2", "ville2", "75001");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link edu.lev.ymf.slam4.bo.Adresse#Adresse(int, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	void testAdresseConstructeur1() {
		assertEquals(-1, valTest1.getId());
		assertEquals(6, valTest1.getNum());
		assertEquals("rue", valTest1.getRue());
		assertEquals("ville", valTest1.getVille());
		assertEquals("75000", valTest1.getCp());
	}

	/**
	 * Test method for {@link edu.lev.ymf.slam4.bo.Adresse#Adresse(int, int, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	void testAdresseConstructeur2() {
		assertEquals(33, valTest2.getId());
		assertEquals(5, valTest2.getNum());
		assertEquals("rue2", valTest2.getRue());
		assertEquals("ville2", valTest2.getVille());
		assertEquals("75001", valTest2.getCp());
	}

	/**
	 * Test method for {@link edu.lev.ymf.slam4.bo.Adresse#toString()}.
	 */
	@Test
	void testToString() {
		assertEquals("([33] - 5 - rue2 - 75001 - ville2)", valTest2.toString());
	}

}
