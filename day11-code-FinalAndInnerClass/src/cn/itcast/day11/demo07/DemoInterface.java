package cn.itcast.day11.demo07;

import java.util.ArrayList;
import java.util.List;
/*
* java.util.list正式ArrayList所implement的interface
* */
public class DemoInterface {
    public static void main(String[] args) {
        //左邊interface名稱，右邊是實現類名稱，此為多態寫法
        List<String> list = new ArrayList<>();
        List<String> addList = new ArrayList<>(){
            {
                add("string1");
                add("string2");
                add("string3");
            }
        };

        list = addNames(list, addList);
        System.out.println(list);
    }

    public static List<String> addNames(List<String> list, List<String> addList){
        for (int i = 0; i < addList.size(); i++) {
            list.add(addList.get(i));
        }
        return list;
    }
}
