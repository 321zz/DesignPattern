package main.java.com.example.designpattern.prototype;

/**
 * @author 储晓波
 * @date 2023/6/2 17:28
 * @desc
 */
public class Client {

    public static void main(String[] args) {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男","18");
        a.setWorkExperience("1990-09","xx公司");

        Resume b = (Resume) a.colone();
        b.setWorkExperience("1991-07","yy公司");

        Resume c = (Resume) a.colone();
        c.setPersonalInfo("女","55");

        a.disPlay();
        b.disPlay();
        c.disPlay();
    }


}
