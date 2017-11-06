package com.lsw.designpattern.singleton;

/**
 * Double Check Lock实现单例模式
 * Created by Luosiwei on 2017/11/6.
 */

public class SingleTonDCL {
    private static SingleTonDCL singleTonDCL;

    private SingleTonDCL() {
    }

    public static SingleTonDCL getInstance() {
        if (singleTonDCL == null) { // 避免不必要的同步
            synchronized (SingleTonDCL.class) {
                if (singleTonDCL == null) { // 在singleTonDCL为空的时候再创建实例
                    singleTonDCL = new SingleTonDCL();
                }
            }
        }
        return singleTonDCL;
    }
}
