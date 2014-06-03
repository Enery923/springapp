package es.unileon.springapp.domain;
/* Application developed for AW subject, belonging to passive operations
group.*/


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clients") 
public class Client {
	
	private static final long serialVersionUID = 1L;

	
	//DNI
	 @Id
	 @Column(name = "id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private String id;

	 /**
		 * Identifier of the client
	 */
	//Name and surname
	private String completeName;
		
	 //Address
	private String address;
	/* InvestmentAccount
	private InvestmentAccount iaccount;
	sus getters and setters
	*/
	private String entity;
	private double inversion;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return id of the client
	 */

	public String getId() {
		return id;
	}
	
	/**
	 * @return CompletName of the client
	 */
	public String getCompleteName() {
		return completeName;
	}

	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	public double getInversion() {
		return inversion;
	}

	public void setInversion(double d) {
		this.inversion = d;
	}


}
