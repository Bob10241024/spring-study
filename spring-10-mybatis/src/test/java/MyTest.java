import com.xixi.mapper.UserMapper;
import com.xixi.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void test() throws IOException {
        //正常下面四行代码应该是工具类
        String resources = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resources);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }

    }

    @Test
    public void test2() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserMapper mapper = (UserMapper) context.getBean("userMapper");
        for (User user : mapper.selectUser()) {
            System.out.println(user);
        }
    }

    @Test
    public void test3() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserMapper mapper = (UserMapper) context.getBean("userMapper2");
        for (User user : mapper.selectUser()) {
            System.out.println(user);
        }
    }
}
