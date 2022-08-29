package cn.xiit.log;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {

    @Before("execution(* cn.xiit.service.UserServiceImpl.*(..))")
    public void before()  {
        System.out.println("方法执行前");
    }

    public void after()  {
        System.out.println("之前增加了");
    }
}
