package com.rishav.dependencyinjectionobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        Student student = new Student();
        MathCheat cheat = new MathCheat();
        student.setMathCheat(cheat);
        student.cheating();
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/rishav/dependencyinjectionobject/beans.xml");
        System.out.println("beans.xml file loaded");
        Student student = context.getBean("student",Student.class);
        student.cheating();

        AnotherStudent anotherStudent = context.getBean("anotherstudent",AnotherStudent.class);
        anotherStudent.cheating();
    }
}
