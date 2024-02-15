package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // [詳細]生徒の人数を入力
        System.out.print("生徒の人数を入力してください（2以上）: ");
        int numberOfStudents = scanner.nextInt();

        double[][] grades = new double[numberOfStudents][4];
        double[] subjectAverages = new double[4];
        double totalAverage = 0;

        // [詳細]成績入力
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println((i + 1) + "人目の成績を入力してください");
            for (int j = 0; j < 4; j++) {
                System.out.print("『" + getSubjectName(j) + "』の点数を入力してください :");
                grades[i][j] = scanner.nextDouble();
                subjectAverages[j] += grades[i][j];
            }
        }

        // [詳細]各生徒の平均点と全体の平均点を計算
        System.out.println();
        for (int i = 0; i < grades.length; i++) {
            double sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            double average = sum / grades[i].length;
            totalAverage += average;
            System.out.printf("%d人目の平均点は%.2f点です。\n", i + 1, average);
        }

        // [詳細]各教科の平均点を計算
        System.out.println();
        for (int i = 0; i < subjectAverages.length; i++) {
            subjectAverages[i] /= numberOfStudents;
            System.out.printf("%sの平均点は%.2f点です。\n", getSubjectName(i), subjectAverages[i]);
        }

        // [詳細]全体の平均点を出力
        totalAverage /= numberOfStudents;
        System.out.printf("\n全体の平均点は%.2f点です。\n", totalAverage);

        scanner.close();
    }

    private static String getSubjectName(int index) {
        switch (index) {
            case 0: return "英語";
            case 1: return "数学";
            case 2: return "理科";
            case 3: return "社会";
            default: return "";
        }
    }
}