package main.java.com.example.designpattern.singleton;

/**
 * @author 储晓波
 * @date 2023/5/31 15:25
 * @desc 单例模式 --静态内部类
 */
public class SingletonTest07 {

    public static void main(String[] args) {
        Singleton07 singleton1 = Singleton07.getInstance();
        Singleton07 singleton2 = Singleton07.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

}

class Singleton07{

    private static volatile Singleton07 instance;

    private Singleton07(){ }

    private static class SingletonInstance {
        private static final Singleton07 INSTANCE = new Singleton07();
    }

    public static synchronized Singleton07 getInstance(){
      return SingletonInstance.INSTANCE;
    }
}

