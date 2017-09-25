package com.lsw.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lsw.designpattern.abstractfactory.SmsFactory;
import com.lsw.designpattern.factory.simplefactory.SendFactory;
import com.lsw.designpattern.factory.simplefactory.Sender;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abstractFactoryTest();
    }

    /**
     * 简单工厂模式测试
     */
    private void simpleFactoryTest() {
        Sender sms = SendFactory.produce("email");
        sms.send();
    }

    /**
     * 抽象工厂模式测试
     */
    private void abstractFactoryTest() {
        SmsFactory smsFactory = new SmsFactory();
        smsFactory.produce().sender();
    }

}
