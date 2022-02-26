package progate;

public class progate3 {
	public static void main(String[] args) {
	    // Personクラスのインスタンスを生成し、変数person1に代入してください
	    Person person1 = new Person();
	    // person1に対して、helloメソッドを呼び出してください
	    // インスタンスメソッドを使用
	    person1.hello();
	    
	}
}

//Personクラスを定義してください
class Person {
	// インスタンスメソッドhelloを定義してください
	public void hello() {
	  System.out.println("こんにちは");
	}
}