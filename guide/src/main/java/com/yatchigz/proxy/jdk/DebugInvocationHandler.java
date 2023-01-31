package com.yatchigz.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Create on 2023-01-31
 * Copyright (c) 2023 by XueBang Information Technology Co.Ltd.
 * All Rights Reserved, Designed By XueBangSoft
 * Copyright:  Copyright(C) 2014-2023
 * Company:    XueBang Information Technology Co.Ltd.
 *
 * @author y
 */
public class DebugInvocationHandler implements InvocationHandler {

    private final Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("调用方法前操作");

        Object result = method.invoke(target, args);

        System.out.println("调用方法后操作");
        
        return result;
    }
}
