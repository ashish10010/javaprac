import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {
 public static void main(String[] args) {
    String to = "abc@example.com";
    String from = "xyz@example.com";
    String host = "smtp.example.com";

    Properties properties = System.getProperties();
    properties.put(host, "mail.smtp.host");
    properties.put("587", "mail.smtp.port");
    properties.put("true", "mail.smtp.auth");
    properties.put("true", "mail.smtp.starttls.enable");

    Session session = Session.getDefaultInstance(properties, new Authenticator() {
        protected PasswordAuthentication getpPasswordAuthentication () {
            return new PasswordAuthentication("xyz@example.com", "password")
        }
    });

    try {
        MimeMessage message = new MimeMessage(session);
        message.sentFrom(new InternetAddress(from));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject("Test Email");
        message.setText("this is test email sent from java!");
        Transport.send(message);
        System.out.println("Email sent Successfully!");

    } catch(MessagingException ex) 
    {
        ex.printStackTrace();
    }
 }   
}
