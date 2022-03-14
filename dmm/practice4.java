package dmm;

public class practice4 {
	public static void main(String[] args) {
		int number = 7;
		if (number < 5) {
			System.out.println(number + " は5未満です");
		} else if (number < 10) {
			System.out.println(number + " は5以上、10未満です");
		} else if (number < 15) {
			System.out.println(number + " は10以上、15未満です");
		} else {
			System.out.println(number + " は15未満でないです");
		}
		
		
		int val = 2;
        switch (val) {
        case 3:
            System.out.println("よくできました！");
            break;  // break：switch文を終了する
        case 2:
            System.out.println("ふつうでした！");
            break;  // break：switch文を終了する
        default:  // 全てのcaseの値に一致しない場合に実行
            System.out.println("がんばろう！");
        }
        
        
        int number2 = 1;
        while (number2 < 50) {  // while文：ループ開始,numberが50未満の場合繰り返す
            number2 *= 2;
            System.out.println("While01 = " + number2);
        }
        
        int number3 = 1;
        do {  // do-while文：ループ開始
            number3 *= 2;
            System.out.println("DoWhile01 = " + number3);
        } while (number3 < 50);  // numberが50未満の場合繰り返す
        
        
        // for文：
        // 初期化式：number4を1で初期化
        // 条件式：number4が5未満の場合、ブロックの処理を行う
        // 変化式：ブロックの処理後に、number4をインクリメント
        for (int number4 = 1; number4 <= 5; number4++) {
            System.out.println("For01 = " + number4);
        }
        
        // 拡張for文：
        int[] array = { 1, 2, 3, 4, 5 };
        for (int number5 : array) {  // 配列の要素を順番にnumber5に代入し、要素分繰り返す
            System.out.println("For02 = " + number5);
        }
        
        // break文：
        for (int count = 0; count < 5; count++) {
            if (count == 2) {
                break;  // countが2になったら、for文を終了
            }
            System.out.println("Break01 = " + count);
        }
        
        // continue文
        for (int count1 = 0; count1 < 5; count1++) {
            if (count1 == 2) {
                continue;  // countが2の場合、この後の処理をスキップ
            }
            System.out.println("Continue01 = " + count1);
        }
	}
}
