package cn.itcast.day10.demo04;

/*
代码当中体现多态性，其实就是一句话：父类引用指向子类对象。

格式：
父类名称 对象名 = new 子类名称();
或者：
接口名称 对象名 = new 实现类名称();
 */
public class Demo01Multi {

    public static void main(String[] args) {
        // 使用多态的写法
        // 左侧父类的引用，指向了右侧子类的对象
        Fu obj = new Zi();

        //直接通過var 訪問member method則看=右邊是誰，沒有則往上找父類的method
        obj.method(); //子類有override ，所以優先用子類method
        obj.methodFu(); //子類無ovveride，所以向上找，用父類的method
        //直接通過var 訪問member variable則看=左邊是誰
        System.out.println(obj.ch); //父
        //間接透過member function訪問member variable則看方法屬於誰，便用誰的Var
        obj.methodChar(); //子
    }
}
