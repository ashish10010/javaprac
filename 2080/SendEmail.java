import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {
 public static void main(String[] args) {
    String to = "abc@example.com";
    String from = "xyz@example.com";
    String host = "localhost";

    Properties properties = System.getProperties();
    properties.put("mail.smtp.host", host);
    Session session  = Session.getDefaultInstance(properties);

    try {
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
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
