package cn.itcast.day09.demo04;

public class Zi extends Fu {

    int num = 9;

    public void methodZi() {
        System.out.println("子类方法执行！");
    }

    //用來檢驗是否有成功override父類的同名method
    //不寫override他也實際上是override的，這個annotation只是幫忙檢測
    @Override
    public void method() {
        System.out.println("子类重名方法执行！");
    }

}
