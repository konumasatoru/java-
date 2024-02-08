package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// 【詳細】問１、ローカル変数として宣言
        byte myByte;
        short myShort;
        int myInt;
        long myLong;
        float myFloat;
        double myDouble;
        char myChar;
        String myString;
        boolean myBoolean;
        
        // 【詳細】問２、ローカル変数を初期値を代入して初期化
        myByte = 0;
        myShort = 0;
        myInt = 0;
        myLong = 0L;
        myFloat = 0.0f;
        myDouble = 0.0d;
        myChar = '\u0000';
        myString = "";
        myBoolean = false;
        
        // 【詳細】問３、初期化をしたそれぞれの変数に下記の値を代入
        myByte = 10;
        myShort = 100;
        myInt = 1000;
        myLong = 10000L;
        myFloat = 9.5f;
        myDouble = 10.5d;
        myChar = 'a';
        myString = "ハロー";
        myBoolean = true;
        
        // 【詳細】問４、演算を行う
        int sum_of_numbers = myByte + myShort + myInt + (int)myLong;
        long product_of_integers = myByte * myShort * myInt * myLong;
        double division = myDouble / 100;
        int subtraction = myByte - myShort;
        
        // 【詳細】コンソールに出力
        System.out.println(myInt + "" + myByte + "\t\t" + myInt + "" + myByte);
        System.out.println((myByte * 2) + "\t\t" + (myByte * 2));
        System.out.println(myChar + " " + myString + " " + myBoolean + "\t\t" + myChar + " " + myString + " " + myBoolean);
        System.out.println(sum_of_numbers + "\t\t" + sum_of_numbers + "\t数字を全て足す");
        System.out.println(product_of_integers + "\t\t" + product_of_integers + "\t小数点以外の数字を全てかける");
        System.out.println(division + "\t\t" + division + "\t10.5割る100をする");
        System.out.println(subtraction + "\t\t" + subtraction + "\t10引く100をする");
        
        // 【詳細】問５、修正後コンソールに出力
        String num = "20";
        int num1 = 23;
        System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));
        
        
        // 【詳細】問６、与えられた情報をローカル変数に代入
        String name = "山田太郎";
        int age = 18;
        double height = 170.5;
        double weight = 62.2;
        String favoriteFood = "寿司";
        
        // 【詳細】formatの通りコンソールに出力し
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        
        
        // 【詳細】問７、身長をメートルに変換
        double heightM = height / 100;
        
        // 【詳細】BMIを計算、出力
        double bmi = weight / (heightM * heightM);
        String formattedBMI = String.format("%.1f", bmi);
        System.out.println("BMIは" + formattedBMI + "です");
        
        
     // 【詳細】問８、新しい情報でローカル変数に再代入
        name = "鈴木一郎";
        age = 24;
        height = 168.5;
        weight = 64.2;
        favoriteFood = "オムライス";
        
        heightM = height / 100;
        bmi = weight / (heightM * heightM);
        formattedBMI = String.format("%.1f", bmi);
        
        // 【詳細】問８、コンソールに出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + formattedBMI + "です");
        
        
        // 【詳細】問９、8で使用した変数【年齢・身長・体重】の数値を和算で自己代入
        age += age;  // 年齢は48歳になります
        height += height;  // 身長は337.0cmになります
        weight += weight;  // 体重は128.4kgになります
        
        heightM = height / 100;
        bmi = weight / (heightM * heightM);
        
        formattedBMI = String.format("%.2f", bmi);
        
        // 【詳細】問９、コンソールに出力
        System.out.println("初めまして鈴木一郎です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物はオムライスです");
        System.out.println("BMIは" + formattedBMI + "です");
        
        // 【詳細】問１０、8で使用した年齢が25歳以上ならtrueが出力
        System.out.println(age >= 25);
        
        
        // 【詳細】問１１、整数と浮動小数点数を文字列に変換し、連結して出力
        String result = String.valueOf(age) + String.valueOf(height) + String.valueOf(weight);
        System.out.println(result);
        
        
        // 【詳細】問１２、11で変換した【年齢・身長】を整数型に変換して出力
        age = Integer.parseInt("48");
        height = Integer.parseInt("337");

        // 変換した整数型を出力
        System.out.println("年齢: " + age);
        System.out.println("身長: " + height);
        
        
        // 【詳細】問１３、12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力
        boolean ifbunnhatukawanai = age >= 25 || height >= 160;
        System.out.println(ifbunnhatukawanai);


	}

}
