//【概要】ログイン時の入力チェックシステム

package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String userName = "";
        while (true) {
            userName = scanner.nextLine();

//            [詳細]ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力
            if (userName == null || userName.isEmpty()) {
            //[詳細] コンソールにユーザー名を入力
                System.out.println("「名前を入力してください」");
//            	[詳細]ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
            } else if (userName.length() > 10) {
                System.out.println("「名前を10文字以内にしてください」");
//               [詳細]ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
            } else if (!userName.matches("^[a-zA-Z0-9]+$")) {
                System.out.println("「半角英数字のみで名前を入力してください」");
            } else {
//            	[詳細]ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力
                System.out.println("ユーザー名「" + userName + "」を登録しました");
                break;
            }
        }
            
            
                
                
                String[] handOptions = {"グー", "チョキ", "パー"};
                int winCount = 0;
                int roundCount = 0;
                
                while (winCount < 1) {
                    int userHand = random.nextInt(3);
                    int opponentHand = random.nextInt(3);
                    
                    System.out.println(userName + "の手は「" + handOptions[userHand] + "」");
                    System.out.println("相手の手は「" + handOptions[opponentHand] + "」");
                    
                 // [詳細]じゃんけんの勝敗判定
                    if (userHand == opponentHand) {
                        System.out.println("DRAW あいこ もう一回しましょう！");
                    } else if ((userHand == 0 && opponentHand == 1) || 
                               (userHand == 1 && opponentHand == 2) || 
                               (userHand == 2 && opponentHand == 0)) {
                        System.out.println("やるやん。");
                        System.out.println("次は俺にリベンジさせて");
                        winCount++;
                    } else {
                        if (opponentHand == 0) {
                            System.out.println("俺の勝ち！");
                            System.out.println("負けは次につながるチャンスです！");
                            System.out.println("ネバーギブアップ！");
                        } else if (opponentHand == 1) {
                            System.out.println("俺の勝ち！");
                            System.out.println("たかがじゃんけん、そう思ってないですか？");
                            System.out.println("それやったら次も、俺が勝ちますよ");
                        } else if (opponentHand == 2) {
                            System.out.println("俺の勝ち！");
                            System.out.println("なんで負けたか、明日まで考えといてください。");
                            System.out.println("そしたら何かが見えてくるはずです");
                        }
                    }
                    
                    roundCount++;
                }
                
                System.out.println("勝つまでにかかった合計回数は" + roundCount + "回です");
                scanner.close();
            }
            
        }