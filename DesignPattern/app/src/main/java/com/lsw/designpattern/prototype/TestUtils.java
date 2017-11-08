package com.lsw.designpattern.prototype;

/**
 * 测试类
 * Created by Luosiwei on 2017/11/8.
 */

public class TestUtils {
    public static void test() {
        WordDocument wordDocument1 = new WordDocument();
        wordDocument1.setmText("文本");
        wordDocument1.setmImages("1111.png");
        wordDocument1.setmImages("2222.png");
        wordDocument1.setmImages("3333.png");
        wordDocument1.show();
        try {
            // 在wordDocument1的基础上克隆一份
            WordDocument wordDocument2 = wordDocument1.clone();
            wordDocument2.setmText("复制文本");
            wordDocument2.setmImages("4444.png");
            wordDocument1.show();
            wordDocument2.show();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
