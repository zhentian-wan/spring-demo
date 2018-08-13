package com.pluralsight;

import com.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main (String[] args) {
       // CustomerService service = new CustomerServiceImpl();

        // Find the applicationContext.xml file
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Using application context to replace hardcodedCustomerServiceImpl
        CustomerService service = appContext.getBean("customerService", CustomerService.class);
        System.out.println(service.findAll().get(0).getFirstname());
    }
}
