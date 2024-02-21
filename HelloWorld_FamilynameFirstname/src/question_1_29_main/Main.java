package question_1_29_main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import question_1_29_Prefecture.Prefecture;

public class Main {
    public static void main(String[] args) {
        Prefecture[] prefectures = {
            new Prefecture("北海道", "札幌市", 83424),
            new Prefecture("青森県", "青森市", 9646),
            new Prefecture("岩手県", "盛岡市", 15275),
            new Prefecture("宮城県", "仙台市", 7282),
            new Prefecture("秋田県", "秋田市", 11638),
            new Prefecture("山形県", "山形市", 9323),
            new Prefecture("福島県", "福島市", 13784),
            new Prefecture("茨城県", "水戸市", 6097),
            new Prefecture("栃木県", "宇都宮市", 6408),
            new Prefecture("群馬県", "前橋市", 6362),
            new Prefecture("埼玉県", "さいたま市", 3798)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("例：8,5,9,昇順or降順");
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        String sortOrder = parts[parts.length - 1];
        Prefecture[] selectedPrefectures = new Prefecture[parts.length - 1];
        
        for (int i = 0; i < parts.length - 1; i++) {
            int index = Integer.parseInt(parts[i].trim());
            selectedPrefectures[i] = prefectures[index];
        }

        Comparator<Prefecture> comparator = new Comparator<Prefecture>() {
            public int compare(Prefecture p1, Prefecture p2) {
                if ("昇順".equals(sortOrder)) {
                    return Integer.compare(p2.getArea(), p1.getArea());
                } else {
                    return Integer.compare(p1.getArea(), p2.getArea());
                }
            }
        };

        Arrays.sort(selectedPrefectures, comparator);

        for (Prefecture p : selectedPrefectures) {
            System.out.println(p);
            System.out.println();
        }
    }
}
