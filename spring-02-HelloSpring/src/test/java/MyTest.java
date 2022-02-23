import com.xixi.pojo.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
