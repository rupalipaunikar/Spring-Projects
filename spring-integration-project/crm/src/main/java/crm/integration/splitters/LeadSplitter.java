package crm.integration.splitters;

import java.util.List;

import org.springframework.integration.Message;
import org.springframework.integration.annotation.Splitter;

import crm.model.Lead;
import crm.model.Product;

public class LeadSplitter {

	@Splitter
	public List<Product> splitMessage(Message<?> message) {
		Lead lead = (Lead) message.getPayload();
		System.out.println("Splitting done");
		return lead.getProducts();
	}


}
