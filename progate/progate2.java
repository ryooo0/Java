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

class Main {
	  public static void main(String[] args) {
	    printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
	    printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
	  }
	  public static void printData(String name, int age, double height, double weight) {
	    System.out.println("私の名前は" + name + "です");
	    System.out.println("年齢は" + age + "歳です");
	    System.out.println("身長は" + height + "mです");
	    System.out.println("体重は" + weight + "kgです");
	    // 変数bmiに、bmiメソッドを用いてBMIを代入してください
	    double bmi = bmi(height, weight);
	    // 変数bmiを用いて、「BMIは◯◯です」と出力してください
	    System.out.println("BMIは" + bmi + "です");
	  }
	  public static String fullName(String firstName, String lastName) {
	    return firstName + " " + lastName;
	  }
	  public static String fullName(String firstName, String middleName, String lastName) {
	    return firstName + " " + middleName + " " + lastName;
	  }
	  // bmiメソッドを定義してください
	  public static double bmi(double height, double weight) {
	    return weight / height / height;
	  }
}

class Main {
	  public static void main(String[] args) {
	    printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
	    printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
	  }
	  public static void printData(String name, int age, double height, double weight) {
	    System.out.println("私の名前は" + name + "です");
	    System.out.println("年齢は" + age + "歳です");
	    System.out.println("身長は" + height + "mです");
	    System.out.println("体重は" + weight + "kgです");
	    double bmi = bmi(height, weight);
	    System.out.println("BMIは" + bmi + "です"); 
	    // isHealthyメソッドの結果で条件分岐を行ってください
	    if (isHealthy(bmi)) {
	      System.out.println("健康です");
	    } else {
	      System.out.println("健康ではありません");
	    }
	  }
	  public static String fullName(String firstName, String lastName) {
	    return firstName + " " + lastName;
	  }
	  public static String fullName(String firstName, String middleName, String lastName) {
	    return firstName + " " + middleName + " " + lastName;
	  }
	  public static double bmi(double height, double weight) {
	    return weight / height / height;
	  }
	  // isHealthyメソッドを定義してください
	  public static boolean isHealthy(double bmi) {
	    if (bmi >= 18.5 && bmi < 25.0) {
	      return true;
	    } else {
	      return false;
	    }
	  }
}
