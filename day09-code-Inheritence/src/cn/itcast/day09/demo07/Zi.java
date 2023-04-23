package cn.itcast.day09.demo07;

public class Zi extends Fu {
    public static String type = "子類";

    public Zi() {
        super(); // 在调用父类无参构造方法，必須是第一句
//        super(20); // 在调用父类重载的构造方法
        System.out.println(super.type);
        System.out.println("子类构造方法！");
        method();
    }

    public void method() {
//        super(); // 错误写法！只有子类构造方法，才能调用父类构造方法。
        System.out.println(type + "在子類執行method()");
    }

}
