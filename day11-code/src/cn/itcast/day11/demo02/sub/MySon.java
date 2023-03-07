package cn.itcast.day11.demo02.sub;

import cn.itcast.day11.demo02.MyClass;

public class MySon extends MyClass {


    public void sonMethod() {
        System.out.println("diff package + child can access: ");
        System.out.println(publicStr);
        System.out.println(protectedStr);
        //錯誤寫法: 必須使用super或直接call才行
        //System.out.println(new MyClass().protectedStr);

        //System.out.println(new MyClass().defaultStr);
        //System.out.println(new MyClass().privateString);
    }

}
