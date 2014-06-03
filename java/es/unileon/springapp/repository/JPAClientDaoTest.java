package es.unileon.springapp.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.unileon.springapp.domain.Client;

public class JPAClientDaoTest {
	
	 private ApplicationContext context;
	 private ClientDao clientDao;

	 @Before
	 public void setUp() throws Exception {
	     context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
	     clientDao = (ClientDao) context.getBean("clientDao");
	 }

	@Test
	public void testGetClientList() {
		 List<Client> clients = clientDao.getClientList();
	        assertEquals(clients.size(), 4, 0);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSaveClient() {
		 List<Client> clients = clientDao.getClientList();

	        Client c = clients.get(0);
	        String CompleteName = c.getCompleteName();
	        
	        c.setCompleteName("Paula San Ramón Zapatero");
	        c.setAddress("Avenida Reyes Leoneses, 14, 3º A");
	        c.setEntity("Inditex");
	        c.setInversion(20000.00);
	        
	        clientDao.saveClient(c);

	        List<Client> updatedClients = clientDao.getClientList();
	        Client c2 = updatedClients.get(0);
	        assertEquals(c2.getCompleteName(),  "Paula San Ramón Zapatero");
	        assertEquals(c2.getAddress(), "Avenida Reyes Leoneses, 14, 3º A");
	        assertEquals(c2.getEntity(), "Inditex");
	        assertEquals(20000.00,c2.getInversion(),0);

	        
	        clientDao.saveClient(c2);
	}

}
