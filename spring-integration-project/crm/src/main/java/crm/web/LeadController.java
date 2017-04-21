package crm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import crm.integration.gateways.LeadGateway;
import crm.model.Country;
import crm.model.Lead;

@Controller
public class LeadController {
	
	@Autowired
	private LeadGateway leadGateway;
	
	@RequestMapping(value = "/lead/form.html", method = RequestMethod.GET)
	public void getForm(Model model) {
		model.addAttribute(Country.getCountries());
		model.addAttribute("lead", new Lead());
	}
	
	@RequestMapping(value = "/lead/form.html", method = RequestMethod.POST)
	public String postForm(Lead lead) {
		leadGateway.createLead(lead);
		return "redirect:form.html?created=true";
	}
	
	@RequestMapping("/lead/demo")
	public ModelAndView demoService(){
		System.out.println("In demo web service");
		return new ModelAndView("demo");
	}
}
