package crm.service;

import org.springframework.mail.MailMessage;
import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailServiceImpl implements EmailService {

	public MailMessage sendEmail(MailMessage msg) {
		msg.setBcc("BCC");
		System.out.println("Email sent for - "+msg.toString());
		return msg;
	}

	public MailMessage display(MailMessage msg) {
		System.out.println("Displaying mail message:- "+msg);
		return msg;
	}
}
