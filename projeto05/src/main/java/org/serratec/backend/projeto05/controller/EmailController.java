package org.serratec.backend.projeto05.controller;

import javax.mail.MessagingException;

import org.serratec.backend.projeto05.exception.EmailException;
import org.serratec.backend.projeto05.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {
	
	
	@Autowired 
	EmailService emailService;
	
	@GetMapping("/email")
	public void enviarEmail() throws MessagingException, EmailException {
		emailService.emailTeste();
	}

}
