package progate;
//この文章をコメントにしてください
public class progate1 {
	public static void main(String[] args) {
	    System.out.println("Hello Java");
	    System.out.println(17);
	    System.out.println(5 + 3);
	    // 「5 + 3」を文字列として出力してください
	    System.out.println("5 + 3");
	    System.out.println(12 / 3);
	    System.out.println(3 * 6);
	    System.out.println(8 % 3);
	    
	    int number;
	    number = 3;
	    System.out.println(number);
	    
	    String name;
	    name = "Wanko";
	    System.out.println(name);
	    
	    int number1 = 3;
	    int number2 = 7;
	    System.out.println(number1 * number2);
	    
	    String text = "プログラミングを勉強しよう";
	    System.out.println("Progateで" + text);
	    
	    number = 3;
	    System.out.println(number);
	    // 変数numberの値に7を足して、変数numberを上書きしてください
	    number = number + 7;
	    System.out.println(number);
	    
	    int length = 6;
	    int height = 8;
	    // 変数rectangleAreaに、四角形の面積を代入してください
	    int rectangleArea = length * height;
	    System.out.println(rectangleArea);
	    // 変数triangleAreaに、三角形の面積を代入してください
	    int triangleArea = length * height / 2;
	    System.out.println(triangleArea);
	    
	    double number3 = 8.5;
	    double number4 = 3.4;
	    System.out.println(number3 + number4);
	    System.out.println(number3 - number4);
	    
	    int month = 12;
	    int date = 31;
	    System.out.println(month + "月" + date + "日");
	    System.out.println(7 / 2);
	    System.out.println(7.0 / 2.0);
	    System.out.println(7 / 2.0);
	    
	    int number5 = 7;
	    int number6 = 2;
	    System.out.println(number5 / number6);
	    // number1をdouble型にキャストし、number6で割った値を出力してください
	    System.out.println((double)number5 / number6);
	    
	    System.out.println(true);
	    System.out.println(false);
	    System.out.println(12 / 4 == 3);
	    System.out.println(12 / 4 != 3);
	    boolean bool = 3 * 9 == 27;
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
	    
	    int number7 = 12;
	    if (number7 < 10) {
	      System.out.println("10より小さい");
	    } else if (number7 < 20) {
	      System.out.println("10以上、20より小さい");
	    } else {
	      System.out.println("20以上"); 
	    }
	    
	    int n = 1;
	    switch (n) {
	      case 1:
	        System.out.println("大吉です");
	        break;
	      case 2:
	        System.out.println("吉です");
	        break;
	      default:
	        System.out.println("凶です");
	        break;
	    }
	    
	    int number8 = 10;
	    // while文を用いて、numberが0より大きい場合に繰り返す、繰り返し処理を作ってください
	    while (number8 > 0) {
	      System.out.println(number8);
	      number8--;
	    }
	    
	    // for文を用いて、繰り返し処理をつくってください
	    for(int i = 1; i <= 10; i++) {
	      System.out.println(i + "回目のループです");
	    }
	    
	    int i = 1;
	    while (i < 10) {
	      // iが5の倍数のとき、繰り返し処理を終了してください
	      if (i % 5 == 0) {
	        break;
	      }
	      System.out.println(i);
	      i++;
	    }
	    
	    for (int j = 1; j < 10; j++) {
	      // jが3の倍数のとき、処理をスキップしてください
	      if (j % 3 == 0) {
	        continue;
	      }
	      System.out.println(j);
	    }
	    
	    // 変数namesに、配列を代入してください
	    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
	    // インデックス番号が0の要素を出力してください
	    System.out.println(names[0]);
	    // インデックス番号が0を更新
	    names[0] = "わんこ";
	    
	    // 配列を繰り返し表示
	    for (int k = 0; k < names.length; k++) {
	      System.out.println("私の名前は" + names[k] + "です");
	    }
	    
	    // 拡張for文
	    for (String nam: names) {
	      System.out.println("私の名前は" + nam + "です");
	    }
	}
}
