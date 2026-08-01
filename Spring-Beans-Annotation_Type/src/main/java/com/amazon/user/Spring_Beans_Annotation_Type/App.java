package com.amazon.user.Spring_Beans_Annotation_Type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.account.beans.Payment;
import com.amazon.account.config.SpringConfigAnnoatation;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigAnnoatation.class);

		Payment payment = context.getBean(Payment.class);

		payment.showPayment();
	}
}
