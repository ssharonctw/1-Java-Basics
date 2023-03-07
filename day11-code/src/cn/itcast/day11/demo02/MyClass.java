package cn.itcast.day11.demo02;

public class MyClass {

    public String publicStr = "public str";

    protected String protectedStr = "protected str";

    String defaultStr = "default str";

    private String privateString = "private str";

    public void method() {
        System.out.println("same class can access ");
        System.out.println(publicStr);
        System.out.println(protectedStr);
        System.out.println(defaultStr);
        System.out.println(privateString);
    }

}
