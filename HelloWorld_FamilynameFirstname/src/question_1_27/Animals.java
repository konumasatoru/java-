package question_1_27;

import java.util.Scanner;

public class Animals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("コンソールに文字を入力してください");
        String input = scanner.nextLine();
        scanner.close();

        String[] animals = input.split(",");
        for (String animal : animals) {
            String[] details = animal.split(":");
            String name = details[0];
            double length = Double.parseDouble(details[1]);
            int speed = Integer.parseInt(details[2]);

            System.out.println("動物名：" + name);
            System.out.println("体長：" + length + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + getScientificName(name));
            System.out.println();
        }
    }

    private static String getScientificName(String name) {
        switch (name) {
            case "ライオン":
                return "パンテラ レオ";
            case "ゾウ":
                return "ロキソドンタ・サイクロティス";
            case "パンダ":
                return "アイルロポダ・メラノレウカ";
            case "チンパンジー":
                return "パン・トゥログロディテス";
            case "シマウマ":
                return "チャップマンシマウマ";
            case "インコ":
                return "不明";
            default:
                return "不明";
        }
    }
}