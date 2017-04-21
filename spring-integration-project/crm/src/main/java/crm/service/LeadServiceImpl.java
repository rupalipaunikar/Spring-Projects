package crm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import crm.model.Lead;
import crm.model.Product;

@Service("leadService")
public class LeadServiceImpl implements LeadService {
	
	public Lead createLead(Lead lead) {
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("Product 1");
		p1.setType("A");
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("Product 2");
		p2.setType("B");
		
		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		
		lead.setProducts(products);
		System.out.println("Lead created: " + lead);
		return lead;
	}
}
