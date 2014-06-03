package es.unileon.springapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.unileon.springapp.domain.Client;

/* Spring permite creaci�n autom�tica de beans de acceso a datos mediante la anotaci�n @Repository.
 * Asimismo, Spring reconoce las anotaciones del API est�ndar JPA.
 * Por ejemplo, la anotaci�n @Persistence es utilizada en la clase JPAProductDao para inyectar autom�ticamente el EntityManager.
 */

@Repository(value = "clientDao")
public class JPAClientDao implements ClientDao {
	private EntityManager em= null;
	
	/*
	 * Sets the entity manager 
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
	/*
	 *ejecuta una consulta usando el EntityManager.
	 *Para ello incluimos en �l una sentencia SQL que obtiene los objetos persistentes de la clase Cliente
	 */
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Client> getClientList() {
		return em.createQuery("select c from Client c order by c.id").getResultList();
	}

	@Transactional(readOnly = false)
	public void saveClient(Client client) {
		em.merge(client);

	}

}
