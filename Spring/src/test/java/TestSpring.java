import cn.kgc.bean.User;
import cn.kgc.spring.HelloSpring;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void test01(){
        ApplicationContext app = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        HelloSpring spring = (HelloSpring)app.getBean("spring");
        System.out.println(spring);
    }

    @Test
    public void test02(){
        ApplicationContext app = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        User user = (User)app.getBean("user");
        System.out.println(user);
    }

}
