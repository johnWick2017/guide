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
public class SmsProxy implements SmsService {

    private SmsService smsService;

    @Override
    public void sendSms(String msg) {
        System.out.println("静态代理");
        smsService.sendSms(msg);
        System.out.println("静态代理完");
    }

    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }
}
