package main.java.com.example.designpattern.singleton;

/**
 * @author 储晓波
 * @date 2023/5/31 15:25
 * @desc 单例模式 --双重检查
 */
public class SingletonTest06 {

    public static void main(String[] args) {
        Singleton06 singleton1 = Singleton06.getInstance();
        Singleton06 singleton2 = Singleton06.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

}

class Singleton06{

    private static volatile Singleton06 instance;

    private Singleton06(){ }

    public static Singleton06 getInstance(){
      if(instance == null){
          synchronized(Singleton06.class){
              if(instance == null){
                  instance =  new Singleton06();
              }
          }
      }
      return instance;
    }
}

