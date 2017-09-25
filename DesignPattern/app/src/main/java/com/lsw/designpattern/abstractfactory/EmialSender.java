package com.lsw.designpattern.abstractfactory;

import android.util.Log;

/**
 * Created by Luosiwei on 2017/9/25.
 */

public class EmialSender implements Sender {
    @Override
    public void sender() {
        Log.i("lsw", "send email");
    }
}
