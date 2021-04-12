package com.arik.singleton;

/**
 * 懒汉式单例模式
 * 在外部需要实例的时候才创建实例.且判断是否为null,如果为null则创建实例,不为null则返回之前创建的实例.
 */
public class LazySingleton {
    //成员对象,类加载初期为null.外部调用getInstance方法时,才被赋予实例.加volatile保证线程安全
    //volatile保证了不同线程对该变量操作的内存可见性.(当一个线程修改了变量,其他使用次变量的线程可以立即知道这一修改).
    //volatile禁止了指令重排序.
    private static volatile LazySingleton lazySingleton = null;
    //对外隐藏空参构造,避免产生多个实例
    private LazySingleton(){};
    //对外暴露的创建实例的方法,如果当前实例为null,则内部调用构造方法创建实例,否则就直接返回已经存在的实例
    public static synchronized LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
