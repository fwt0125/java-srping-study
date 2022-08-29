package cn.xiit.pojo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) classPathXmlApplicationContext.getBean("student");
        System.out.println(student.toString());
    }


    @Test
    public void user(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans-user.xml");
        User user = classPathXmlApplicationContext.getBean("user", User.class);
        System.out.println(user);
    }
}
