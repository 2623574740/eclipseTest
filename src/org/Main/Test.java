package org.Main;

import org.Utils.StudentAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String arg[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		StudentAction S = (StudentAction) context.getBean("StudentAction");
		S.showStu();
		System.out.println("good idea");
	}
	
}
