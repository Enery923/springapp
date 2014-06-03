package es.unileon.springapp.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.springapp.domain.Client;
import es.unileon.springapp.service.ClientManager;
import es.unileon.springapp.service.Searcher;

@Controller
public class SearcherController {
	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private ClientManager clientManager;

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView onSubmit(@Valid Searcher searcher, BindingResult result)
			throws ClassNotFoundException {

		if (result.hasErrors()) {
			return new ModelAndView("searcher", "model", null);
		}
		String id = searcher.getId();

		if (id == "" || id == null) {

			return new ModelAndView("hello", "model.clients",
					this.clientManager.getClients());

		} else {
			logger.info("Search client with id " + id + ".");

			Client client = this.clientManager.searchClient(id);

			if (client != null) {

				return new ModelAndView("finalview", "client", client);

			} else {

				return new ModelAndView("clientNotFound", "model.clients",
						this.clientManager.getClients());

			}

		}
	}

	@RequestMapping(method = RequestMethod.GET)
	protected Searcher formBackingObject(HttpServletRequest request)
			throws ServletException {
		Searcher searcher = new Searcher();
		return searcher;
	}

	public void setClientManager(ClientManager clientManager) {
		this.clientManager = clientManager;
	}

	public ClientManager getClientManager() {
		return clientManager;
	}
}