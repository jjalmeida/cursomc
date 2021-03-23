package com.estudo.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.estudo.cursomc.domain.Pedido;

public interface EmailService {
	
	void senderOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}