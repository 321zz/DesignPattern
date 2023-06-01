package main.java.com.example.designpattern.observer;

/**
 * @author 储晓波
 * @date 2023/5/30 10:02
 * @desc 充当具体观察者
 */
public class Player implements Observer{

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持住，" + name + "来救你！");
    }

    @Override
    public void beAttacked(AllyControlCenter allyControlCenter) {
        System.out.println(name + "被攻击！");
        allyControlCenter.notifyObserver(name);
        System.out.println("111");
    }
}
