package es.unileon.springapp.repository;

import java.util.List;

import es.unileon.springapp.domain.Client;

public class InMemoryClientDao implements ClientDao {
	  private List<Client> clientList;

	    public InMemoryClientDao(List<Client> clientList) {
	        this.clientList = clientList;
	    }

	    public List<Client> getClientList() {
	        return clientList;
	    }

	    public void saveClient(Client cli) {
	    }

}
