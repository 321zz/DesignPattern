package main.java.com.example.designpattern.observer;

/**
 * @author 储晓波
 * @date 2023/5/30 9:59
 * @desc  充当具体目标类
 */
public class ConcreteAllyControlCenter extends AllyControlCenter{

    public ConcreteAllyControlCenter(String teamName) {
        System.out.println(teamName + "战队组建成功！");
        System.out.println("------------------------------");
        this.teamName = teamName;
    }

    @Override
    public void notifyObserver(String teamName) {
        System.out.println(this.teamName + "战队紧急通知，盟友" + teamName + "遭受敌人攻击");
        // 遍历观察者集合对象，调用每一个盟友（除自己）的支援方法
        for (Observer obs : player) {
            if (!obs.getName().equalsIgnoreCase(teamName)) {
                obs.help();
            }
        }
    }
}
