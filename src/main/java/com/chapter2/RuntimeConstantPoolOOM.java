package com.chapter2;

/**
 * String.intern()返回引用的测试
 * intern()是一个Native方法，如果字符串常量池中已经包括一个等于此String对象的字符串
 * 则返回常量池中这个字符串的String对象；否则，将此String对象包括的字符串添加到常量池中
 * 并且返回此String对象的引用（String对象本身）
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        String str1 = new StringBuffer("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuffer("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}
