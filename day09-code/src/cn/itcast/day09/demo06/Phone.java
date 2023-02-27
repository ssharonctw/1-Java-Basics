package cn.itcast.day09.demo06;

// 本来的老款手机
public class Phone {
    String type = "舊手機";
    public void call() {
        System.out.println("執行父類call()");
    }

    public void send() {
        System.out.println("執行父類send()");
    }

    public void show() {
        System.out.println(type+"執行父類show()");
    }

}
