package main.java.com.example.designpattern.singleton;

/**
 * @author 储晓波
 * @date 2023/5/31 15:25
 * @desc 单例模式 --同步代码块
 */
public class SingletonTest05 {

    public static void main(String[] args) {
        Singleton05 singleton1 = Singleton05.getInstance();
        Singleton05 singleton2 = Singleton05.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

}

class Singleton05{

    private static Singleton05 instance;

    private Singleton05(){ }

    public static  Singleton05 getInstance(){
      if(instance == null){
          synchronized(Singleton05.class){
              instance =  new Singleton05();
          }
      }
      return instance;
    }
}

