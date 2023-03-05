package cn.itcast.day10.demo04;

public class Fu {
    public char ch = '父';
    public void method() {
        System.out.println("父类方法");
    }

    public void methodFu() {
        System.out.println("父类特有方法");
    }

    public void methodChar(){
        System.out.println(ch);
    }
}
