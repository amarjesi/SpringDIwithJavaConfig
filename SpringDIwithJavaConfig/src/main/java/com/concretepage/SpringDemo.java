package com.concretepage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.concretepage.bean.Employee;
import com.concretepage.bean.Product;
public class SpringDemo {
   public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
       ctx.register(AppConfig.class);
       ctx.refresh();
       System.out.println("--Result by Setter based Dependency Injection--");
       Product product = (Product)ctx.getBean("product");
       product.print();
       System.out.println("--Result by Constructor based Dependency Injection--");
       Employee employee = ctx.getBean(Employee.class);
       employee.print();
       ctx.close();
   }
} 