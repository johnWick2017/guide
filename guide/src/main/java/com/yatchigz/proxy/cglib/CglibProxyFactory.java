package com.yatchigz.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Create on 2023-01-31
 * Copyright (c) 2023 by XueBang Information Technology Co.Ltd.
 * All Rights Reserved, Designed By XueBangSoft
 * Copyright:  Copyright(C) 2014-2023
 * Company:    XueBang Information Technology Co.Ltd.
 *
 * @author y
 */
public class CglibProxyFactory {

    public static Object getProxy(Class<?> clazz) {
        //增强器
        Enhancer enhancer = new Enhancer();
        //类加载器
        enhancer.setClassLoader(clazz.getClassLoader());
        //设置代理类
        enhancer.setSuperclass(clazz);
        //设置方法拦截器
        enhancer.setCallback(new DebugMethodInterceptor());

        return enhancer.create();
    }

}
