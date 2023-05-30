package main.java.com.example.designpattern.observer;

/**
 * @author 储晓波
 * @date 2023/5/30 9:45
 * @desc 抽象观察者模式
 */
public interface Observer {
    /**
     * 获取名称方法
     * @return
     */
    public String getName();

    /**
     * 设置名称方法
     */
    public void setName(String name);

    /**
     * 支援盟友方法
     */
    public void help();

    /**
     * 遭受攻击方法
     */
    public void beAttacked(AllyControlCenter allyControlCenter);
}
