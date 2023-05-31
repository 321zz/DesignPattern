package main.java.com.example.designpattern.singleton;

/**
 * @author 储晓波
 * @date 2023/5/31 15:25
 * @desc 饿汉式静态常量
 */
public class SingletonTest02 {

    public static void main(String[] args) {
        Singleton02 singleton1 = Singleton02.getInstance();
        Singleton02 singleton2 = Singleton02.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

}

class Singleton02{
    private Singleton02(){

    };

    private static Singleton02 instance;

    static {
        instance = new Singleton02();
    }

    public static Singleton02 getInstance(){
        return instance;
    }
}

