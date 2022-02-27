package progate;

public class progate3 {
	public static void main(String[] args) {
	    // Personクラスのインスタンスを生成し、変数person1に代入してください
	    Person person1 = new Person("Kate Jones");
	    // person1に対して、helloメソッドを呼び出してください
	    // インスタンスメソッドを使用
	    person1.hello();
	     
	    // person1のインスタンスフィールドnameに「Kate Jones」をセットしてください
	    person1.name = "Kate Jones";
	    // person1のインスタンスフィールドnameの値を出力してください
	    System.out.println(person1.name);
	    
	}
}

//Personクラスを定義してください
class Person {
	// int型のクラスフィールドcountを定義し、0を代入してください
    // クラスフィールドはstaticをつける。
	public static int count = 0;
	// コンストラクタを定義。インスタンス生成時に自動実行
	// コンストラクタがString型の引数を受け取るようにしてください
    Person(String name) {
	  System.out.println("インスタンスが生成されました");
	  // インスタンスフィールドnameに値をセットしてください
	  this.name = name;
	}
	  
	// インスタンスメソッドhelloを定義してください
	public void hello() {
		System.out.println("こんにちは、私は" + this.name + "です");
	}
	// インスタンスフィールドnameを定義してください
	public String name;
}