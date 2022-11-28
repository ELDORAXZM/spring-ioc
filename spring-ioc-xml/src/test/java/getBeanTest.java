import com.jamie.controller.UserController;
import com.jamie.pojo.Client;
import com.jamie.pojo.Person;
import com.jamie.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
summary:
1)Get bean by bean ID in config xml
2)Get bean by bean Type in config xml
3)Get bean by bean ID & Type in config xml
4)Get bean by interface type in config xml
5)Autowire (by Type or by Name) in config xml
 */


public class getBeanTest {

    //1)Get bean by bean ID in config xml
    @Test
    public void IOCbyXMLTest1(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        User user = (User) ioc.getBean("userOne");
        System.out.println(user);
    }

    //2)Get bean by bean Type in config xml
    @Test
    public void IOCbyXMLTest2(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Client cln = ioc.getBean(Client.class);
        System.out.println(cln);
    }

    //3)Get bean by bean ID & Type in config xml
    @Test
    public void IOCbyXMLTest3(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Client cln = ioc.getBean("clientOne",Client.class);
        System.out.println(cln);
    }

    //4)Get bean by interface type in config xml
    @Test
    public void IOCbyXMLTest4(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Person person = ioc.getBean(Person.class);
        System.out.println(person);
    }
    //5)Autowire (by Type or by Name) in config xml
    @Test
    public void autowireTest(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }



}
