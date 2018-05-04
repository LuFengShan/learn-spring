/**
 * ProjectName:xiaojia-spring-annotion<BR>
 * File name: LifeCycleTest.java <BR>
 * Author: SGX <BR>
 * Project:xiaojia-spring-annotion <BR>
 * Version: v 1.0 <BR>
 * Date: 2018年5月3日 上午8:30:37 <BR>
 * Description: <BR>
 * Function List: <BR>
 */

package com.guang.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jishuan.proxy.CalculatorProxy;
import com.jishuan.service.Calculation;
import com.jishuan.service.impl.CalculationImpl;
import com.jishuan.service.impl.CalculationImplNoLog;

public class SpringAOPTest {

    ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("bean-annotion.xml");

    @Test
    public void test() {
        Calculation c = new CalculationImpl();
        c.add(3, 5);
        c.sub(3, 5);
        c.mul(3, 5);
        c.div(3, 5);
    }
    @Test
    public void test1() {
        Calculation c = (Calculation) ac.getBean("calculationImpl");
        c.add(3, 5);
        c.sub(3, 5);
        c.mul(3, 5);
        c.div(3, 5);
    }
    @Test
    public void testDongTaiDaiLi() {
        Calculation c1 = new CalculationImplNoLog();
        Calculation c = new CalculatorProxy(c1).getCalculationProxy();
        c.add(3, 5);
        c.sub(3, 5);
        c.mul(3, 5);
        c.div(3, 5);
    }

}

