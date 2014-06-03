package es.unileon.springapp.repository;

import java.util.List;
import es.unileon.springapp.domain.Client;
/*
 *  Éste será el interface que definirá la funcionalidad de la implementación DAO que vamos a crear 
 *  esto nos permitirá elegir en el futuro otra implementación que se adapte mejor a nuestras necesidades 
 */
public interface ClientDao {
	
	 public List<Client> getClientList();
	 public void saveClient(Client client);

}
