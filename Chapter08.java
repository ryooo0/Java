
public class Chapter08 {
	public static void main(String[] args) {
        int num = 1;
        while (num < 5) {
            System.out.println(num * num);
            num++;
        }
        
        int array[] = { 1, 3, 12, 55 };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        for (int a : array) {
            if (a % 2 == 0) {
                continue;
            }
            System.out.println(a);
        }
    }
}
