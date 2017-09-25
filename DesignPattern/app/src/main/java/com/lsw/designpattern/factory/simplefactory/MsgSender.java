package com.lsw.designpattern.factory.simplefactory;

import android.util.Log;

/**
 * Created by Luosiwei on 2017/9/25.
 */

public class MsgSender implements Sender {
    @Override
    public void send() {
        Log.i("lsw", "发送smg");
    }
}
