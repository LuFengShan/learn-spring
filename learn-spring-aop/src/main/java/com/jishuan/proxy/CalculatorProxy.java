/**
 * ProjectName:xiaojia-spring-aop<BR>
 * File name: ArithmeticCalculatorLoggingProxy.java <BR>
 * Author: SGX <BR>
 * Project:xiaojia-spring-aop <BR>
 * Version: v 1.0 <BR>
 * Date: 2018年5月4日 上午8:39:12 <BR>
 * Description: <BR>
 * Function List: <BR>
 */

package com.jishuan.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import com.jishuan.service.Calculation;

public class CalculatorProxy {

    private Calculation c;

    public CalculatorProxy(Calculation c) {
        this.c = c;
    }

    public Calculation getCalculationProxy() {
        Calculation cal = null;

        ClassLoader loader = c.getClass().getClassLoader();
        Class[] interfaces = new Class[] {Calculation.class};
        InvocationHandler ih = new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                System.out.println("method:" + methodName);
                // 打印日志
                System.out.println("[before] The method " + methodName + " begins with "
                        + Arrays.asList(args));
                Object invoke = method.invoke(c, args);
                // 打印日志
                System.out.println("[after] The method ends with " + invoke);
                return invoke;
            }
        };
        cal = (Calculation) Proxy.newProxyInstance(loader, interfaces, ih);
        return cal;
    }

}

