package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Student;

public class Client {
	public static void main(String[] args) {
		String files[] = new String[] { "resources/spring.xml"};
		ApplicationContext bf = new ClassPathXmlApplicationContext(files);
		Student s = (Student) bf.getBean("student");
		String sd = s.toString();
		System.out.println(sd);
	}
}
