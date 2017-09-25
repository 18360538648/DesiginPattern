package com.lsw.designpattern.singleton;

/**
 * 懒汉单例
 * Created by Luosiwei on 2017/9/25.
 */

public class SingleTonLazy {
    /**
     * 私有构造方法，防止被实例化
     */
    private SingleTonLazy() {
    }

    private static class SingleFactory {
        private static SingleTonLazy singleTon = new SingleTonLazy();
    }

    private SingleTonLazy getInstance() {
        return SingleFactory.singleTon;
    }

}
