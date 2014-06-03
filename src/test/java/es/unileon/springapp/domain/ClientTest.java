package es.unileon.springapp.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {

	Client c = new Client();
	
	@Test
	public void testGetAddressAndSetAddress() {
		c.setAddress("Calle Buenavista");
		assertEquals("Calle Buenavista", c.getAddress());
	}

	@Test
	public void testGetEntityAndSetEntity() {
		c.setEntity("Acciona");
		assertEquals("Acciona", c.getEntity());
	}

	@Test
	public void testSetCompleteNameAndGetCompleteName() {
		c.setCompleteName("Soraya Saez de Santa María");
		assertEquals("Soraya Saez de Santa María", c.getCompleteName());
	}

	@Test
	public void testSetIdAndGetId() {
		c.setId("12345678");
		assertEquals("12345678",c.getId());
	}


}
