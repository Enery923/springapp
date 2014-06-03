package es.unileon.springapp.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import es.unileon.springapp.domain.Client;

public interface ClientManager extends Serializable {

	public Client searchClient(String dni);
    
    public List<Client> setClients(List<Client> clients);
    
    public List<Client> getClients();

}