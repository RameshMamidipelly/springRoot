package client;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import bean.Car;


public class Client {

	public static void main(String[] args) {
			Car car =(Car)new ClassPathXmlApplicationContext("resource/spring.xml").getBean("c");
			
			System.out.println("SDFASDFAS");
			String sd=car.toString();
			System.out.println(sd);
	}
	
	

}
