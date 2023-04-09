import com.itheima.Bean1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * className: Test
 * package: PACKAGE_NAME
 * Description:
 *
 * @Author: Youmu
 * @Create: 2023/3/23 - 16:55
 * @Version: v1.0
 */
public class TestBean1 {
    public static void main(String[] args) {
        //加载spring配置文件，创建对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext1.xml");
        //获取创建对象
        Bean1 bean = (Bean1) applicationContext.getBean("bean1");
        //测试
        System.out.println(bean);
        bean.add();
    }
}
