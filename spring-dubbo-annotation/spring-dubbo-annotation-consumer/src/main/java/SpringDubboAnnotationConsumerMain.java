import czs.consumer.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class SpringDubboAnnotationConsumerMain
{
    public static void main (String[] args)
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext ("classpath:dubbo-consumer.xml");
        UserController userController = ac.getBean (UserController.class);
        userController.findUser ();
        new Scanner (System.in).next ();
    }
}
