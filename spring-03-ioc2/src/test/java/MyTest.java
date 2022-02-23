import com.xixi.pojo.User;
import com.xixi.pojo.UserT;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * IDEA测试包中使用@Test报错（Annotation type expected）
 *
 *  1、使用的jar包版本号过低
 *        @Test注解只有junit4以上的版本可以使用，如果使用的是低版本的不能采用注解方式。
 *  2、Test文件夹没有设置为Test Resource Root
 *  3、创建Class类的时候，类名设置为了Test(这次我就犯了这个错误！！！！)
 *        如果类名也为Test的话，也无法使用，但是可以使用完全限定名
 */
public class MyTest {

    /**
     * 四个Test对应xml中四个bean
     */

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //在执行getBean的时候，user就已经创建好了，通过无参构造
        User user = (User) context.getBean("user");
        //调用对象的方法
        user.show();
    }

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //在执行getBean的时候，user就已经创建好了，通过无参构造
        UserT user = (UserT) context.getBean("userT");
        //调用对象的方法
        user.show();
    }

    @Test
    public void test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //在执行getBean的时候，user就已经创建好了，通过无参构造
        UserT user = (UserT) context.getBean("userT1");
        //调用对象的方法
        user.show();
    }

    @Test
    public void test04(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //在执行getBean的时候，user就已经创建好了，通过无参构造
        UserT user = (UserT) context.getBean("userT2");
        //测试别名
        UserT userr = (UserT) context.getBean("userT2New");

        //调用对象的方法
        user.show();
        userr.show();
    }

    // （测试）Spring只创建一个实例
    @Test
    public void testSpring(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Object user =  context.getBean("user");
        Object userT =  context.getBean("userT");
        System.out.println(user == userT);
    }
}
