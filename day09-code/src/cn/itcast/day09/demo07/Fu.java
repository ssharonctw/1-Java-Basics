package cn.itcast.day09.demo07;

public class Fu {
    public static String type = "父類";
    public Fu() {
        System.out.println("父类无参构造");
        System.out.println(this.type);
        this.method();
    }

    public Fu(int num) {
        System.out.println("父类有参构造！");
    }

    public void method() {
        System.out.println(type + "在父類執行method()");
    }
}
