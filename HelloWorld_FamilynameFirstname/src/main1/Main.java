package main1;

import java.util.Scanner;

import character.Adventurer;


public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("名前を入力: ");
        String name = scanner.nextLine();

        
        Adventurer adventurer = new Adventurer(name);
        
        System.out.println("こんにちは「　" + adventurer.getName() + "　」さん");
        System.out.println("ステータス");
        System.out.println("HP：" + adventurer.getHp());
        System.out.println("MP：" + adventurer.getMp());
        System.out.println("攻撃力：" + adventurer.getAttack());
        System.out.println("素早さ：" + adventurer.getSpeed());
        System.out.println("防御力：" + adventurer.getDefense());
        System.out.println("さあ冒険に出かけよう！");
        
        scanner.close();
    }
}
