package dmm;

public class practice3 {
	public static void main(String[] args) {
		int a = 10;
		a++; // インクリメント a = 11
		a = 10;
		a--; // デクリメント a = 9
		
		
		int b;
		int c;
		b = 5;
		c = ++b;  // b をインクリメントした後に、a が c に代入される
		// b =「6」、 c =「6」
		b = 5;
		c = b++;  // b を c に代入した後に、b がインクリメントされる
		// b =「6」、 c =「5」
		
		
		int val = 2 + 5;
        System.out.println(val);

        val++;
        System.out.println(val);

        val *= 5;
        System.out.println(val);

        boolean bool = (val == 50);
        System.out.println(bool);

        bool = (val < 50) && (val % 10 == 0);
        System.out.println(bool);
		
	}
}
