package es.unileon.springapp.repository;

import java.util.List;
import es.unileon.springapp.domain.Client;
/*
 *  �ste ser� el interface que definir� la funcionalidad de la implementaci�n DAO que vamos a crear 
 *  esto nos permitir� elegir en el futuro otra implementaci�n que se adapte mejor a nuestras necesidades 
 */
public interface ClientDao {
	
	 public List<Client> getClientList();
	 public void saveClient(Client client);

}
