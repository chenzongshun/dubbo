import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class SpringProvideMain
{
    public static void main (String[] args)
    {
        new ClassPathXmlApplicationContext ("classpath:spring-provide.xml");
        //阻塞线程
        new Scanner (System.in).next ();
    }
}
