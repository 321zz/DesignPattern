package main.java.com.example.designpattern.singleton;

/**
 * @author 储晓波
 * @date 2023/5/31 15:25
 * @desc 单例模式 --枚举
 */
public class SingletonTest08 {

    public static void main(String[] args) {
        Singleton08 singleton1 = Singleton08.INSTANCE;
        Singleton08 singleton2 = Singleton08.INSTANCE;

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

}

enum Singleton08{
    INSTANCE
}

