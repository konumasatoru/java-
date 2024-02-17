package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {

	    public static void main(String[] args) {
	        
	    	 // Q1の引数
	        printMessage("JavaSE", 11);
	        // Q2の引数
	        multiply(5, 3);
	        // Q3の引数
	        int[] array = {1, 2, 3, 4, 5};
	        printArray(array);
	        // Q4の引数
	        multiply(2.5, 3.5);
	        // Q5用
	        int[] randomNumbers = generateRandomNumbers(10);
	        // Q6用
	        double average = calculateAverage(randomNumbers);
	        // Q7用
	        checkAverage(average);
	    }

	    // Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	    public static void printMessage(String text, int version) {
	        System.out.println("Hello " + text + " " + version);
	    }

	    // Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	    public static void multiply(int num1, int num2) {
	        System.out.println(num1 * num2);
	    }

	    // Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	    public static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.println(num);
	        }
	    }

	    // Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	    public static void multiply(double num1, double num2) {
	        System.out.println(num1 + num2);
	    }

	    // Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。
	    public static int[] generateRandomNumbers(int count) {
	        Random random = new Random();
	        int[] numbers = new int[count];
	        for (int i = 0; i < count; i++) {
	            numbers[i] = 1 + random.nextInt(100);
	            System.out.println(numbers[i]);
	        }
	        return numbers;
	    }

	    // Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
	    public static double calculateAverage(int[] numbers) {
	        double sum = 0;
	        for (int number : numbers) {
	            sum += number;
	        }
	        double average = sum / numbers.length;
	        System.out.println("Average: " + average);
	        return average;
	    }

	    // Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	    public static boolean checkAverage(double average) {
	        boolean result = average >= 50;
	        System.out.println(result);
	        return result;
	    }
	}