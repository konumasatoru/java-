package curriculum_B;

import java.util.Random;

public class Qes6 {

	public static void main(String[] args) {
        String input = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品";
        String[] products = input.split("、");
        int tvCount = new Random().nextInt(12);
        
        // [詳細]出力を生成
        for (String product : products) {
            int count = new Random().nextInt(12);
            String output;
            
            switch (product) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    output = product + "の残り台数は" + count + "台です";
                    break;
                case "テレビ":
                	output = "テレビの残り台数は" + tvCount + "台です";
                    break;
                case "ディスプレイ":
                    output = "ディスプレイの残りの台数は" + (11 - tvCount ) + "台です";
                    break;
                default:
                    output = "『" + product + "』は指定の商品ではありません";
                    break;
            }
            
            System.out.println(output);
        }

	}

}
