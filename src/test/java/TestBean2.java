import com.itheima.Bean1;
import com.itheima.Bean2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * className: TestBean2
 * package: PACKAGE_NAME
 * Description:
 *
 * @Author: Youmu
 * @Create: 2023/3/23 - 17:14
 * @Version: v1.0
 */
public class TestBean2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Bean2 bean = (Bean2) applicationContext.getBean("bean2");
        System.out.println(bean);
    }
}
