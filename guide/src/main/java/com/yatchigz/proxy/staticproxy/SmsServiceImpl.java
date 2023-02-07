package com.yatchigz.proxy.staticproxy;

/**
 * Create on 2023-02-07
 * Copyright (c) 2023 by XueBang Information Technology Co.Ltd.
 * All Rights Reserved, Designed By XueBangSoft
 * Copyright:  Copyright(C) 2014-2023
 * Company:    XueBang Information Technology Co.Ltd.
 *
 * @author y
 */
public class SmsServiceImpl implements SmsService {
    @Override
    public void sendSms(String msg) {
        System.out.println("static proxy 发送短信：" + msg);
    }
}
