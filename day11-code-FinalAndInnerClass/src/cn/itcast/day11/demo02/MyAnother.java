package cn.itcast.day11.demo02;

public class MyAnother {

    public void anotherMethod() {
        System.out.println("other class in same package can access ");
        System.out.println(new MyClass().publicStr);
        System.out.println(new MyClass().protectedStr);
        System.out.println(new MyClass().defaultStr);
        //System.out.println(new MyClass().privateString);
    }

}
