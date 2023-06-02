package main.java.com.example.designpattern.prototype;

/**
 * @author 储晓波
 * @date 2023/6/2 17:16
 * @desc 设计模式-克隆模式
 */
public class Resume implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }


    public void setPersonalInfo(String sex, String age){
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    public void disPlay(){
        System.out.println(this.name + "," + this.sex + "," + this.age);
        System.out.println("工作经历: " + this.timeArea + "," + this.company);
    }


    public Object colone()  {
        Resume clone = null;
        try{
            clone  = (Resume) super.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return clone;
    }


}
