package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Charger;
import com.model.Laptop;

public class SpringMainClass {

	public static void main(String[] args) {
		// Creating a Container
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("laptopCharger.xml");
		
		Laptop lp = (Laptop) applicationContext.getBean("laptop");
		System.out.println(lp);
		
		Charger ch = (Charger) applicationContext.getBean("charger");
		System.out.println(ch);

	}

}
