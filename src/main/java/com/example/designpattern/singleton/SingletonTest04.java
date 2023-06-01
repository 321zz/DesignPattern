package main.java.com.example.designpattern.singleton;

/**
 * @author 储晓波
 * @date 2023/5/31 15:25
 * @desc 单例模式 --同步方法
 */
public class SingletonTest04 {

    public static void main(String[] args) {
        Singleton04 singleton1 = Singleton04.getInstance();
        Singleton04 singleton2 = Singleton04.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

}

class Singleton04{

    private static Singleton04 instance;

    private Singleton04(){ }


    public static synchronized Singleton04 getInstance(){
      if(instance == null){
          instance =  new Singleton04();
      }
      return instance;
    }
}

