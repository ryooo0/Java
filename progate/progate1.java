package progate;
//この文章をコメントにしてください
public class progate1 {
	public static void main(String[] args) {
	    System.out.println("Hello Java");
	    // 数値の17を出力してください
	    System.out.println(17);
	    // 5に3を足した値を出力してください
	    System.out.println(5 + 3);
	    // 「5 + 3」を文字列として出力してください
	    System.out.println("5 + 3");
	    // 12を3で割った値を出力してください
	    System.out.println(12 / 3);
	    // 3に6を掛けた値を出力してください
	    System.out.println(3 * 6);
	    // 8を3で割った時の余りを出力してください
	    System.out.println(8 % 3);
	    
	     // int型の変数numberを定義してください
	    int number;
	    // 変数numberに3を代入してください
	    number = 3;
	    // 変数numberを出力してください
	    System.out.println(number);
	    // String型の変数nameを定義してください
	    String name;
	    // 変数nameに"Wanko"を代入してください
	    name = "Wanko";
	    // 変数nameを出力してください
	    System.out.println(name);
	    
	    int number1 = 3;
	    // int型の変数number2を定義し、7を代入してください
	    int number2 = 7;
	    // number1 * number2を出力してください
	    System.out.println(number1 * number2);
	    // 変数textに「プログラミングを勉強しよう」を代入してください
	    String text = "プログラミングを勉強しよう";
	    // 「Progateで」と変数textを連結して出力してください
	    System.out.println("Progateで" + text);
	    
	    number = 3;
	    System.out.println(number);
	    // 変数numberの値に7を足して、変数numberを上書きしてください
	    number = number + 7;
	    // 変数numberを出力してください
	    System.out.println(number);
	    
	    int length = 6;
	    int height = 8;
	    // 変数rectangleAreaに、四角形の面積を代入してください
	    int rectangleArea = length * height;
	    // 変数rectangleAreaを出力してください
	    System.out.println(rectangleArea);
	    // 変数triangleAreaに、三角形の面積を代入してください
	    int triangleArea = length * height / 2;
	    // 変数triangleAreaを出力してください
	    System.out.println(triangleArea);
	    
	     // double型の変数number1を定義し、8.5を代入してください。
	    double number1 = 8.5;
	    // double型の変数number2を定義し、3.4を代入してください。
	    double number2 = 3.4;
	    // number1にnumber2を足した値を出力してください
	    System.out.println(number1 + number2);
	    // number1からnumber2を引いた値を出力してください
	    System.out.println(number1 - number2);
	    
	    int month = 12;
	    int date = 31;
	    // 「12月31日」となるように変数と文字列を連結して出力してください
	    System.out.println(month + "月" + date + "日");
	    // 7を2で割った値を出力してください
	    System.out.println(7 / 2);
	    // 7.0を2.0で割った値を出力してください
	    System.out.println(7.0 / 2.0);
	    // 7を2.0で割った値を出力してください
	    System.out.println(7 / 2.0);
	    
	    int number1 = 7;
	    int number2 = 2;
	    System.out.println(number1 / number2);
	    // number1をdouble型にキャストし、number2で割った値を出力してください
	    System.out.println((double)number1 / number2);
	    
	    // 「true」を用いて、「真」を表す真偽値を出力してください
	    System.out.println(true);
	    // 「false」を用いて、「偽」を表す真偽値を出力してください
	    System.out.println(false);
	    // 「==」を用いて、値を比較した結果を出力してください
	    System.out.println(12 / 4 == 3);
	    // 「!=」を用いて、値を比較した結果を出力してください
	    System.out.println(12 / 4 != 3);
	    // 変数を定義し、値を比較した結果を代入してください
	    boolean bool = 3 * 9 == 27;
	    // 変数boolの値を出力してください
	    System.out.println(bool);
	    
	    // trueと出力されるようにしてください
	    System.out.println(true || false);
	    // falseと出力されるようにしてください
	    System.out.println(false && true);
	    // 「8 < 5」かつ「3 >= 2」の結果を出力してください
	    System.out.println(8 < 5 && 3 >= 2);
	    // 「8 < 5」または「3 >= 2」の結果を出力してください
	    System.out.println(8 < 5 || 3 >= 2);
	    // 「8 < 5」でない、の結果を出力してください
	    System.out.println(!(8 < 5));
	    
	    int number = 12;
	    // numberが20より小さいとき、どちらでもないときの条件分岐を追加してください
	    if (number < 10) {
	      System.out.println("10より小さい");
	    } else if (number < 20) {
	      System.out.println("10以上、20より小さい");
	    } else {
	      System.out.println("20以上"); 
	    }
	}
}
