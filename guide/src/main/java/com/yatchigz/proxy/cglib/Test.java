package com.yatchigz.proxy.cglib;

/**
 * Create on 2023-01-31
 * Copyright (c) 2023 by XueBang Information Technology Co.Ltd.
 * All Rights Reserved, Designed By XueBangSoft
 * Copyright:  Copyright(C) 2014-2023
 * Company:    XueBang Information Technology Co.Ltd.
 *
 * @author y
 */
public class Test {

    /**
     *  CGLIB 动态代理是通过生成一个被代理类的子类来拦截被代理类的方法调用，因此不能代理声明为 final 类型的类和方法。
     * @param args
     */
    public static void main(String[] args) {
        AliYunSmsService proxy = (AliYunSmsService) CglibProxyFactory.getProxy(AliYunSmsService.class);
        proxy.sendSms("cglib动态代理");
    }

}
