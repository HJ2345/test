package kr.co.ch03;

import kr.co.ch03.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * date: 2025.03.10
 * name: HJ
 * cont: ch03 핵심기능 부가기능
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MyService myService = (MyService) context.getBean("myService");

        myService.insert();
        myService.select();
        myService.update();
        myService.delete();

    }
}
