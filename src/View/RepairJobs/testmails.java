package View.RepairJobs;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

import javax.mail.Session;

import javax.mail.PasswordAuthentication;

/**
 *
 * @author raaed
 */
public class testmails {

    private String User = "sliitdemo22@gmail.com";
    private String password = "kgxp rbzl ytyc fbzw";

    public testmails(String to, String sub, String msg) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(User, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("sliitdemo22@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(User));
            message.setSubject("fishin supplies");
            message.setText("yooooo");
            Transport.send(message);
            System.out.println("message sent successfully");
        } catch (Exception e) {
            System.out.println("please try again");
        }

    }

}
