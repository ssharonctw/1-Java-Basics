package cn.itcast.day09.demo05;

public class Fu {

    //因為子類return String (屬於Object) 小於等於父類return Object 所以可以
    //因為子類是public 所以父類只可以是public, protected, default (不可以是private)
    Object method() {
        return null;
    }

}
