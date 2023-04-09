import com.itheima.Bean2;
import com.itheima.Bean3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * className: TestBean3
 * package: PACKAGE_NAME
 * Description:
 *
 * @Author: Youmu
 * @Create: 2023/3/23 - 17:26
 * @Version: v1.0
 */
public class TestBean3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        applicationContext.getBean("bean3");
        System.out.println();
    }
}
