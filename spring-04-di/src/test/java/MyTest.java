import com.xixi.pojo.Address;
import com.xixi.pojo.Student;
import com.xixi.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /**
         *
         * Student{name='Estela',
         * address=Address{address='北京'},
         * books=[三国演义, 水浒传, 西游记, 红楼梦],
         * hobbies=[play basketball, programmed learning, earn good money],
         * card={身份证=210114123409876666, 银行卡=13456787654234234},
         * games=[LOL, LLYL, LML],
         * wife='null',
         * info={
         *       password=123,
         *       url=jdbc:mysql://localhost:3306/mybatis_plus?serverTimezone=UTC,
         *       driver=com.mysql.cj.jdbc.Driver,
         *       username=root}
         *}
         */
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user);
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user1 = context.getBean("user1",User.class);
        System.out.println(user1);
    }

    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user1 = context.getBean("user1",User.class);
        User user2 = context.getBean("user1",User.class);
        System.out.println(user1==user2);
    }
}
