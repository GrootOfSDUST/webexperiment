import com.groot.dao.Hello;
import com.groot.service.UserService;
import com.groot.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class
myTest
{
    public static void main(String[] args)
    {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在Spring中管理，我们要使用直接去里面取出来就可以
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
//        Hello hello = (Hello)context.getBean("hello");
//        hello.toString();
    }
}
