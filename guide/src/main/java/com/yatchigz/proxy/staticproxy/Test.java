package com.yatchigz.proxy.staticproxy;

import com.yatchigz.proxy.jdk.JdkProxyFactory;
import com.yatchigz.proxy.jdk.SmsService;

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
     * 静态代理实现步骤:
     * 1.定义一个接口及其实现类；
     * 2.创建一个代理类同样实现这个接口
     * 3.将目标对象注入进代理类，然后在代理类的对应方法调用目标类中的对应方法。
     *
     * 缺点：非常不灵活  比如接口一旦新增加方法，目标对象和代理对象都要进行修改）且麻烦(需要对每个目标类都单独写一个代理类）
     * @param args
     */
    public static void main(String[] args) {
        SmsServiceImpl smsService = new SmsServiceImpl();
        SmsProxy smsProxy = new SmsProxy(smsService);
        smsProxy.sendSms("hello word");
    }

}
