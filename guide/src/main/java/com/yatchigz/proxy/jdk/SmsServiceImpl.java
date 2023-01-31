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
public class SmsServiceImpl implements SmsService {
    @Override
    public void sendSms(String message) {

        System.out.println("发送短信:" + message);

    }
}
