import czs.consumer.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class SpringAnnotationConsumerMain
{
    public static void main (String[] args)
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext ("classpath:spring-annotation-consumer.xml");
        UserController userController = ac.getBean (UserController.class);
        userController.findUser ();
        new Scanner (System.in).next ();
    }
}
