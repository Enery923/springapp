package es.unileon.springapp.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.unileon.springapp.domain.Client;
import es.unileon.springapp.repository.ClientDao;

@Component
public class SimpleClientManager implements ClientManager {

	private static final long serialVersionUID = 1L;
	
	 @Autowired
	    private ClientDao clientDao;

	    public void setProductDao(ClientDao productDao) {
	        this.clientDao = productDao;
	    }

     List<Client> clients;
    
	       	
    	 /**
    	 * Busca el cliente cuyo DNI coincida con el recibido
    	 * @param dni
    	 * @return
    	 * @throws ClientNotFoundException 
    	 */
    	public Client searchClient(String dni) {
    		  List<Client> clients = clientDao.getClientList();
    		//Creamos un iterador para recorrer la lista
    		Iterator<Client> iterator = clients.iterator();
    		Client client = null;
    		Client result=null;
    		
    		//Comprobamos que la lista no este vacia
    		if (clients.isEmpty()) {
    			throw new NullPointerException("Client list is empty.");
    		}
    		
    		//Mientras haya clientes recorremos la lista
    		while (iterator.hasNext() && result==null) {
    			//Guardamos el cliente actual
    			client = iterator.next();
    			
    			//Si el DNI del cliente actual coincide con el indicado salimos del bucle
    			if (client.getId().compareTo(dni) == 0) {
    				result=client;
    			}
    		}
    		//Lo guardamos en una nueva base de datos
    		clientDao.saveClient(client);
    		//Devolvemos el cliente encontrado
    		
    			return result;
    			
    	}
	
    public List<Client> setClients(List<Client> clients) {
        return this.clients = clients;
    }

	public List<Client> getClients() {
		return clientDao.getClientList();
	}


}
