package crm.integration.routers;

import org.springframework.integration.annotation.Router;

import crm.model.Lead;

public class CountryRouter {

	@Router
	public String route(Lead lead) {
		String destination = (lead.isInternational() ? "internationalChannel" : "domesticChannel");
		System.out.println("Lead country is " + lead.getCountry() + "; routing to " + destination);
		return destination;
	}
}
