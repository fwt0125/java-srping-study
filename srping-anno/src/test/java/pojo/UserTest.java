package pojo;

import cn.xiit.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void User() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplictionContet.xml");
        User user = (User) classPathXmlApplicationContext.getBean("user");
        System.out.println(user.name);
    }
}
