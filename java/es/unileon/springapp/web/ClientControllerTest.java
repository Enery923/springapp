package es.unileon.springapp.web;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.springapp.domain.Client;
import es.unileon.springapp.repository.InMemoryClientDao;
import es.unileon.springapp.service.SimpleClientManager;

public class ClientControllerTest {

	@Test
	public void testHandleRequestView() throws Exception {
		ClientController controller = new ClientController();
		
		 SimpleClientManager scm = new SimpleClientManager();
	        scm.setProductDao(new InMemoryClientDao(new ArrayList<Client>()));
	        controller.setClientManager(scm);
		
		//controller.setClientManager(new SimpleClientManager());
		ModelAndView modelAndView = controller.handleRequest(null, null);
		assertEquals("hello", modelAndView.getViewName());
		assertNotNull(modelAndView.getModel());
	

	}

}
