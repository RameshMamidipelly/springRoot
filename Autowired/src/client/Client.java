package client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import bean.Peoples;

public class Client {

	public static void main(String[] args) {
		Peoples ap=(Peoples) new ClassPathXmlApplicationContext("resources/spring.xml").getBean("p");
		System.out.println(ap);

	}

}
