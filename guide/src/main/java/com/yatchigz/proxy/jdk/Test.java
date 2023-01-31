package com.yatchigz.proxy.jdk;

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

    public static void main(String[] args) {
        SmsService proxy = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        proxy.sendSms("hello word");
    }

}
