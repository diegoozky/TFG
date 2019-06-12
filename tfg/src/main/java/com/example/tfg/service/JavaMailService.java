package com.example.tfg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class JavaMailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendEmail(String to, String subject, String body) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		
		mailMessage.setFrom("fivestarstfg@gmail.com");
		mailMessage.setTo(to);
		mailMessage.setSubject(subject);
		mailMessage.setText(body);
		
		javaMailSender.send(mailMessage);
	}
}
