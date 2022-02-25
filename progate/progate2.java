package progate;

public class progate2 {
	public static void main(String[] args) {
    // printDataメソッドを呼び出してください
	    printData();
	}
    // printDataメソッドを定義してください
	public static void printData() {
	    System.out.println("私の名前はKate Jonesです");
    }
	
	public static void main(String[] args) {
	    // 引数に「Kate Jones」を渡してください
	    printData("Kate Jones");
	    // 引数に「John Christopher Smith」を渡してください
	    printData("John Christopher Smith");
	}
	  // 引数を受け取るようにしてください
    public static void printData(String name) {
	    // 「私の名前は◯◯です」と出力されるように書き換えてください
	    System.out.println("私の名前は" + name + "です");    
    }
}

class Main {
	  public static void main(String[] args) {
	    // fullNameメソッドの結果を変数nameに代入してください
	    String name = fullName("Kate", "Jones");
	    // printDataの引数を書き換えてください
	    printData(name, 27);
	    // こちらは書き換えないでください
	    printData("John Christopher Smith", 65);
	  }
	  public static void printData(String name, int age) {
	    System.out.println("私の名前は" + name + "です");
	    System.out.println("年齢は" + age + "歳です");
	  }
	  // fullNameメソッドを定義してください
	  public static String fullName(String firstName, String lastName) {
	    return firstName + " " + lastName;
	  } 
}

class Main {
	  public static void main(String[] args) {
	    printData(fullName("Kate", "Jones"), 27);
	    // fullNameメソッドを用いて、printDataの引数を書き換えてください
	    printData(fullName("John", "Christopher", "Smith"), 65);
	  }
	  public static void printData(String name, int age) {
	    System.out.println("私の名前は" + name + "です");
	    System.out.println("年齢は" + age + "歳です");
	  }
	  public static String fullName(String firstName, String lastName) {
	    return firstName + " " + lastName;
	  }
	  // fullNameメソッドを定義してください
	  public static String fullName(String firstName, String middleName, String lastName) {
	    return firstName + " " + middleName + " " + lastName;
	  }
	}


