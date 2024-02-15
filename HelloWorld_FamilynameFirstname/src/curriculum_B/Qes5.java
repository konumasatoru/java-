package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
			System.out.print("課題5\n\n");
			for (int i = 1; i <= 20; i++) {
	            for (int j = 1; j <= 9; j++) {
	                System.out.printf(" %02d * %02d = %03d ", i, j, i * j);
	                if (j != 9) {
	                    System.out.print("||");
	                }
	            }
	            System.out.println();
	        }
		}
	}
