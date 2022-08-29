package cn.xiit.pojo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PeopleTest {

    @Test
    public void people(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        People people = classPathXmlApplicationContext.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();
    }
}
