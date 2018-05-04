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

import com.jishuan.service.Calculation;
// 没有用切面的时候
public class CalculationImpl implements Calculation {

    @Override
    public void add(int i, int j) {
        System.out.println("add start 【i : " + i + ", j : " + j + " 】");
        System.out.println(i + j);
        System.out.println("add end 【i : " + i + ", j : " + j + " 】");
    }

    @Override
    public void sub(int i, int j) {
        System.out.println("sub start 【i : " + i + ", j : " + j + " 】");
        System.out.println(i - j);
        System.out.println("sub end 【i : " + i + ", j : " + j + " 】");
    }

    @Override
    public void mul(int i, int j) {
        System.out.println("mul start 【i : " + i + ", j : " + j + " 】");
        System.out.println(i * j);
        System.out.println("mul end 【i : " + i + ", j : " + j + " 】");
    }

    @Override
    public void div(int i, int j) {
        System.out.println("div start 【i : " + i + ", j : " + j + " 】");
        System.out.println(i / j);
        System.out.println("div end 【i : " + i + ", j : " + j + " 】");
    }

}

