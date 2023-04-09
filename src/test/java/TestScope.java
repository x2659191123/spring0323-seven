import com.itheima.Scope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * className: TestScope
 * package: PACKAGE_NAME
 * Description:
 *
 * @Author: Youmu
 * @Create: 2023/3/23 - 22:48
 * @Version: v1.0
 */
public class TestScope {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scope scope1 = (Scope) applicationContext.getBean("scope");
        System.out.println(scope1);
        Scope scope2 = (Scope) applicationContext.getBean("scope");
        System.out.println(scope2);
        System.out.println(scope1==scope2);
    }
}
