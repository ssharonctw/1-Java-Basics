package cn.itcast.day10.demo04;

public class Zi extends Fu {
    public char ch = '子';
    @Override
    public void method() {
        System.out.println("子类方法");
    }

    public void methodChar() {
        System.out.println(ch);
    }
}
