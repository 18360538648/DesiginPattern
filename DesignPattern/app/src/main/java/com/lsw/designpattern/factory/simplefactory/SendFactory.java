package com.lsw.designpattern.factory.simplefactory;

/**
 * Created by Luosiwei on 2017/9/25.
 */

public class SendFactory {
    public static Sender produce(String type) {
        if (type.equals("sms")) {
            return new MsgSender();
        } else if (type.equals("email")) {
            return new MailSender();
        } else {
            return null;
        }
    }
}
