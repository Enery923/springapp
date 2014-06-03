package es.unileon.springapp.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//
public class Searcher {
	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	@NotNull
	@Size(min=9,max=9)
	private String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		logger.info("Id set to " + id);
	}
}
