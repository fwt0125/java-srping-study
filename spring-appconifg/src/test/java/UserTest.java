import cn.xiit.config.BeansConfig;
import cn.xiit.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
