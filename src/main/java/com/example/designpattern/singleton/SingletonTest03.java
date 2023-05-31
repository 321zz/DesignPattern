package main.java.com.example.designpattern.singleton;

/**
 * @author 储晓波
 * @date 2023/5/31 15:25
 * @desc 饿汉式静态常量
 */
public class SingletonTest03 {

    public static void main(String[] args) {
        Singleton03 singleton1 = Singleton03.getInstance();
        Singleton03 singleton2 = Singleton03.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

}

class Singleton03{

    private static Singleton03 instance;

    private Singleton03(){ }


    public static Singleton03 getInstance(){
      if(instance == null){
          instance =  new Singleton03();
      }
      return instance;
    }
}

