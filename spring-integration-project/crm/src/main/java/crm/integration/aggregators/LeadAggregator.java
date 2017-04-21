package crm.integration.aggregators;

import java.util.List;

import org.springframework.integration.annotation.Aggregator;

import crm.model.Lead;
import crm.model.Product;

public class LeadAggregator{

	@Aggregator
	public Lead prepareLead(List<Product> products){
		Lead lead = new Lead();
		lead.setProducts(products);
		System.out.println("Aggregation done");
		return lead;
	}
}
