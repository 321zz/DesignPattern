package main.java.com.example.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 储晓波
 * @date 2023/5/30 9:50
 * @desc 抽象目标类
 */
public abstract class AllyControlCenter {
    protected List<Observer> player = new ArrayList<>(16);

    /**
     * 战队名称
     */
    protected String teamName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * 加入战队方法
     * @param obs
     */
    public void join(Observer obs){
        System.out.println(obs.getName() + "加入" + teamName + "战队！");
        player.add(obs);
    }

    /**
     * 退出战队方法
     * @param obs
     */
    public void quit(Observer obs){
        System.out.println(obs.getName() + "退出" + teamName + "战队！");
        player.remove(obs);
    }

    /**
     * 通知观察者方法，name为被攻击的盟友
     * @param teamName
     */
    public abstract void notifyObserver(String teamName);
}
