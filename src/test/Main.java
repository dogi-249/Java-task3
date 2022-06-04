package test;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> albumMap = new HashMap<>();
        albumMap.put(Integer.valueOf(1), "ラブとピースは君の中");
        albumMap.put(Integer.valueOf(2), "MAN IN THE MIRROR");
        albumMap.put(Integer.valueOf(3), "REPORT");
        albumMap.put(Integer.valueOf(4), "ESCAPARADE");
        albumMap.put(Integer.valueOf(5), "Traveler");
        albumMap.put(Integer.valueOf(6), "Editorial");

        System.out.println("---------Official髭男dism アルバム一覧---------");
        for (Map.Entry<Integer, String> entry : albumMap.entrySet()) {
            System.out.println(entry.getKey() + "枚目：" + entry.getValue());
        }

        System.out.println("---------例外処理---------");
        try {
            for (int i = 1; i < 10; i++) {
                if (i > 0) {
                    throw new NullPointerException();
                }
                System.out.println(albumMap.get(i));
            }
        } catch (NullPointerException e) {
            System.out.println("配列の範囲を超えています。");
        }
    }
}