package com.lsw.designpattern.abstractfactory;

/**
 * Created by Luosiwei on 2017/9/25.
 */

public class SmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
