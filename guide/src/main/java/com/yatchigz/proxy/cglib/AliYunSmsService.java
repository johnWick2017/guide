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
public class AliYunSmsService {

    private final String str = "xxxx";

    public void sendSms(String message) {
        System.out.println("阿里云发送短信：" + message + str);
    }

}
