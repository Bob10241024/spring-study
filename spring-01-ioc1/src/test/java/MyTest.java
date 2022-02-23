import com.xixi.service.UserService;
import com.xixi.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        //获取ApplicationContext,拿到Spring的容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //容器在手，天下我有，需要什么，就直接get什么！
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();
    }
}
