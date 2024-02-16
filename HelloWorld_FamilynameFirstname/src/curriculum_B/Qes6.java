package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("");
        String input = scanner.nextLine();
        String[] products = input.split("、");
        Random random = new Random();
        int tvCount = random.nextInt(12);
        
        // [詳細]出力を生成
        for (String product : products) {
            int count = random.nextInt(12);
            String output;
            
            switch (product) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    output = product + "の残り台数は" + count + "台です\n";
                    break;
                case "テレビ":
                	output = "テレビの残り台数は" + tvCount + "台です\n";
                    break;
                case "ディスプレイ":
                    output = "ディスプレイの残りの台数は" + (11 - tvCount ) + "台です\n";
                    break;
                default:
                    output = "『" + product + "』は指定の商品ではありません";
                    break;
            }
            
            System.out.println(output);
        }

	}

}
