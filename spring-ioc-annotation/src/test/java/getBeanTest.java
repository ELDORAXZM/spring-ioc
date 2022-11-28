import com.jamie.controller.UserController;
import com.jamie.dao.UserDao;

import com.jamie.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
summary:
1)Annotation + scan in config xml

 */


public class getBeanTest {

    //1)Annotation + scan in config xml
    @Test
    public void IOCbyAnnotationTest1(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-annotation.xml");
        UserController userController = ioc.getBean("userController",UserController.class);
        System.out.println(userController);
        UserService userService = ioc.getBean("userServiceImpl",UserService.class);
        System.out.println(userService);
        UserDao userDao = ioc.getBean("userDaoImpl",UserDao.class);
        System.out.println(userDao);
    }

    //2)Annotation: Autowried
    @Test
    public void IOCbyAnnotationTest2(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-annotation.xml");
        UserController userController = ioc.getBean("userController",UserController.class);
       userController.saveUser();
    }



}
