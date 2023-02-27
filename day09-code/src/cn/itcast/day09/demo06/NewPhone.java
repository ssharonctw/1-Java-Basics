package cn.itcast.day09.demo06;

// 定义一个新手机，使用老手机作为父类
public class NewPhone extends Phone {
    String type = "新手機";
    @Override
    public void show() {
        System.out.println(type+"以super 執行父類show()");
        super.show(); // 把父类的show方法拿过来重复利用
        // 自己子类再来添加更多内容
        System.out.println(type+"執行子類show()");
    }

    public void send(){
        System.out.println(type+"無super 執行子類send()");
    }
}
