package question_1_30;

class Person{
	String name;
	int age;
	double height;
	double weight;
	static int count = 0;

	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		count++;
	}
	
	double bmi() {
		return weight / (height * height);
	}
	
	void print() {
		double bmiValue = bmi();
		String formattedBmi = String.format("%.1f", Math.floor(bmiValue));
		System.out.println("名前は" + name + "です");
		System.out.println("年は" + age + "才です");
		System.out.println("BMIは" + formattedBmi + "です");
	}	
	
	static void printCount() {
        System.out.println("合計" + count + "人です");
    }
}