package com.google.dearapp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.google.dearapp.entity.User;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
@Service
public class EmailService {
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void  sendFirstEmail(User u) {
		MimeMessage mimeMessage=javaMailSender.createMimeMessage();
		
		try {
			MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true);
			helper.setTo(u.getEmail());
			helper.setSubject("Account Created Successfully for DearApp");
			helper.setText("Dear "+u.getName()+", Your Account has been Created Successfully for DearApp, start your journey with your perfect matches here all the best, Thank You");
			
		} 
		catch (MessagingException e) {
			
			e.printStackTrace();
		}
		
		javaMailSender.send(mimeMessage);
		
	}

}
