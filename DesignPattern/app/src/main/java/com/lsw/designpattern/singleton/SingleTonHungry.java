package com.lsw.designpattern.singleton;

/**
 * 饿汉单例
 * <p>
 * Created by Luosiwei on 2017/9/25.
 */

public class SingleTonHungry {
    // 在类创建的时候就实例化一个对象
    private static SingleTonHungry singleTonHungry = new SingleTonHungry();

    public static SingleTonHungry getInstance() {
        return singleTonHungry;
    }
}
