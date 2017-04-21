package crm.service;

import org.springframework.mail.MailMessage;

public interface EmailService {

	MailMessage sendEmail(MailMessage msg);
	MailMessage display(MailMessage msg);
}
