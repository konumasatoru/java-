package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		System.out.print("課題４\n\n");
		for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf(" %02d * %02d = %02d ", i, j, i * j);
                if (j != 9) {
                    System.out.print("||");
                }
            }
            System.out.println();
        }
	}
}
