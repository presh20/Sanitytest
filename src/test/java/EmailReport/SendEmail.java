package EmailReport;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class SendEmail {

	public static void main(String[] args) throws EmailException {
		
		
		

		// Configure email server settings
		String host = "smtp.example.com";
		int port = 587;
		String username = "precious.ibeagwa@konga.com";
		String password = "Victor@23";

		// Create the email and set the recipient, subject, and message
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("precious.ibeagwa@konga.com", "Victor@23"));
		email.setFrom("preciou.ibeagwa@konga.com");
		email.addTo("preciousonyinyechukwu21@gmail.com");
		email.setSubject("QA Sanity Report");
		email.setMsg("Please find the attached Test report.");

		// Create the attachment
		/**EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("path/to/testng-report.html");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("TestNG Report");
		attachment.setName("testng-report.html");

		// Add the attachment to the email
		email.attach(attachment);**/

		// Send the email
		email.send();


	}

}
