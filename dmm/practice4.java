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
	}
}
