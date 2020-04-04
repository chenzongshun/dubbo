import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class SpringAnnotationProvideMain
{
    public static void main (String[] args)
    {
        new ClassPathXmlApplicationContext ("classpath:spring-annotation-provide.xml");
        //阻塞线程
        new Scanner (System.in).next ();
    }
}
