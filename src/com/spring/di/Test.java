package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//programmer is creating object..and hardcoding dependecies
		/*Employee emp1=new Employee();
		emp1.setName("Santosh");
		emp1.setEid(12);
		emp1.setEmail("Santosh@gmail.com");
		emp1.setSalary(20000);
		*/
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Employee empobj=context.getBean("e1",Employee.class);
		empobj.Disp_Emp();
		

	}

}
