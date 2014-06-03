package es.unileon.springapp.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import es.unileon.springapp.domain.Client;
import es.unileon.springapp.repository.ClientDao;
import es.unileon.springapp.repository.InMemoryClientDao;

public class SimpleClientManagerTest {

	private static int CLIENTS_COUNT = 2; 
	ArrayList<Client> clients;
	SimpleClientManager scm;
	
	
	@Before
	public void setUp() throws Exception {
		
		scm = new SimpleClientManager();
		
		clients = new ArrayList<Client>();
		

		// stub up a list of products
		Client client1 = new Client();
		client1.setAddress("Calle Ancha");
		client1.setId("87456321H");
		client1.setEntity("Caja España");
		client1.setInversion(13000.00);
		client1.setCompleteName("Paco Meireles Sánchez");
		clients.add(client1);
		
		Client client2 = new Client();
		client2.setAddress("Calle Ancha");
		client2.setId("87456321D");
		client1.setEntity("Ing Direct");
		client1.setInversion(31000.00);
		client2.setCompleteName("Sergio Villa Gómez");
		clients.add(client2);

		ClientDao clientDao = new InMemoryClientDao(clients);
	    scm.setProductDao(clientDao);
		//scm.setClients(clients);
		
		
	    
	}
	
	@Test(expected = AssertionError.class)
	public void testGetClientWithNoClient() {
		try{
			SimpleClientManager scm2 = new SimpleClientManager();
			scm.setProductDao(new InMemoryClientDao(new ArrayList<Client>()));
			assertNull(scm2.getClients());
		}catch(Exception ex){
			fail("Clients list is empty.");
		}
	}
	
	


}
