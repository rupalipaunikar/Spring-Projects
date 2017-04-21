package crm.integration.transformers;

import java.util.Date;

import org.springframework.integration.annotation.Transformer;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;

import crm.model.Lead;

public class LeadToEmailTransformer {

	private String confFrom;
	private String confSubj;
	private String confText;

	public String getConfFrom() {
		return confFrom;
	}

	public void setConfFrom(String confFrom) {
		this.confFrom = confFrom;
	}

	public String getConfSubject() {
		return confSubj;
	}

	public void setConfSubject(String confSubj) {
		this.confSubj = confSubj;
	}

	public String getConfText() {
		return confText;
	}

	public void setConfText(String confText) {
		this.confText = confText;
	}

	@Transformer
	public MailMessage transform(Lead lead) {
		System.out.println("Transforming lead to confirmation e-mail: " + lead);

		String name = lead.getFirstName();
		String leadEmail = lead.getEmail();
		MailMessage msg = new SimpleMailMessage();

		msg.setTo(name == null ? leadEmail : name + " <" + leadEmail + ">");

		msg.setFrom(confFrom);
		msg.setSubject(confSubj);
		msg.setSentDate(new Date());
		msg.setText(confText);
		

		System.out.println("Transformed lead to confirmation e-mail: " + msg);
		return msg;
	}
}
