package cn.itcast.day11.demo03;

public class Demo02InnerClass {

    public static void main(String[] args) {
        //non-static inner class: need the outer object to create the inner object
        //外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();

        //static inner class: no need the outer object to create the inner object
        Outer.InnerStatic obj2 = new Outer.InnerStatic();
    }

}
