package com.arik.singleton;

/**
 * 饿汉式单例模式,在程序加载期间就创建了一个实例,保证在调用getInstance方法之前单例就已经存在了.
 */
public class HungrySingleton {

    //类一旦加载,就根据构造方法创建了一个实例.且该实例不可更改引用
    private final static HungrySingleton hungrySingleton = new HungrySingleton();
    //隐藏构造方法,防止外部创建其他实例
    private HungrySingleton(){};
    //对外的实例获取入口,返回已经在类加载时期创建的实例,且永远只为那一个实例
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }


}
