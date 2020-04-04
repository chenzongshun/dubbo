import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class SpringDubboAnnotationProvideMain
{
    public static void main (String[] args)
    {
        new ClassPathXmlApplicationContext ("classpath:dubbo-provide.xml");
        //阻塞线程
        new Scanner (System.in).next ();
    }
}
