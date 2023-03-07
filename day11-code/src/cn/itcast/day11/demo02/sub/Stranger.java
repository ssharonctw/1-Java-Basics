package cn.itcast.day11.demo02.sub;

import cn.itcast.day11.demo02.MyClass;

public class Stranger {

    public void strangerMethod() {
        System.out.println("diff package + non child can access: ");
        System.out.println(new MyClass().publicStr);
        //System.out.println(new MyClass().protectedStr);
        //System.out.println(new MyClass().defaultStr);
        //System.out.println(new MyClass().privateString);
    }

}
