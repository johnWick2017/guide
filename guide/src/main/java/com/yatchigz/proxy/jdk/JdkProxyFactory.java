package com.yatchigz.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * Create on 2023-01-31
 * Copyright (c) 2023 by XueBang Information Technology Co.Ltd.
 * All Rights Reserved, Designed By XueBangSoft
 * Copyright:  Copyright(C) 2014-2023
 * Company:    XueBang Information Technology Co.Ltd.
 *
 * @author y
 */
public class JdkProxyFactory {

    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new DebugInvocationHandler(target));
    }

}
