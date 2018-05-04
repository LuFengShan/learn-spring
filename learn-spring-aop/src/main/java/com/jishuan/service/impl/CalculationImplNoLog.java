/**
 * ProjectName:xiaojia-spring-aop<BR>
 * File name: CalculationImpl.java <BR>
 * Author: SGX <BR>
 * Project:xiaojia-spring-aop <BR>
 * Version: v 1.0 <BR>
 * Date: 2018年5月4日 上午8:23:03 <BR>
 * Description: <BR>
 * Function List: <BR>
 */

package com.jishuan.service.impl;

import org.springframework.stereotype.Component;
import com.jishuan.service.Calculation;
/**
 * 用了切面，我们只保证核心的业务逻辑，日志和数据的校验都放到切面中
 * 开发者 : SGX <BR>
 * 时间：2018年5月4日 上午8:37:51 <BR>
 * 变更原因： <BR> 
 * 首次开发时间：2018年5月4日 上午8:37:51 <BR>
 * 描述： <BR>
 * 版本：V1.0
 */
@Component
public class CalculationImplNoLog implements Calculation {

    @Override
    public void add(int i, int j) {
        System.out.println(i + j);
    }

    @Override
    public void sub(int i, int j) {
        System.out.println(i - j);
    }

    @Override
    public void mul(int i, int j) {
        System.out.println(i * j);
    }

    @Override
    public void div(int i, int j) {
        System.out.println(i / j);
    }

}

