package com.itheima;

/**
 * className: Bean3Factory
 * package: com.itheima
 * Description:
 *
 * @Author: Youmu
 * @Create: 2023/3/23 - 17:21
 * @Version: v1.0
 */
public class Bean3Factory {
    public Bean3Factory(){
        System.out.println("bean工厂实例化中ing");
    }

    public Bean3 createBean(){
        return new Bean3();
    }
}
