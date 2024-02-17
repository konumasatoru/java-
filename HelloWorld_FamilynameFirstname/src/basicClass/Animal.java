package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

    public static void main(String[] args) {
    	// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
        Dog dog = new Dog();
        System.out.println("動物の名前: " + dog.getName());

        // Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
        Dog dogNumber = new Dog(5);
        System.out.println("動物の数: " + dogNumber.getNumber());

        // 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        String currentTime = sdf.format(new Date());
        System.out.println("現在の日時: " + currentTime);
    }
}
