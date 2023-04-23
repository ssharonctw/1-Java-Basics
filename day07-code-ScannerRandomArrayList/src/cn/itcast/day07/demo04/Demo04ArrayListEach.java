package cn.itcast.day07.demo04;

import java.util.ArrayList;

//Primitive Type v.s. Wrapper Type
//從JDK1.5+ 開始，支持自動裝箱/拆箱(Auto-boxing/unboxing)
//自動裝箱: 基本類型 -> 包裝類型
//自動拆箱: 包裝類型 -> 基本類型
public class Demo04ArrayListEach {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //錯誤: 泛型只能是引用類型(Reference type) 不能是基本類型
        //(因為ArrayList都是存的地址值，可是basic type沒有地址值)
        //ArrayList<int> listint = new ArrayList<>();

        //Workaround: 可以使用basic type對應的包裝類 (wrapper type)
        ArrayList<Integer> listInt = new ArrayList<>();

        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");

        listInt.add(100);
        listInt.add(200);

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
