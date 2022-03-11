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
		// 「合計◯◯人です」と出力してください
		System.out.println("合計" + Person.count + "人です");

		// printCountメソッドを呼び出してください
		// クラス名.メソッド名で呼び出し
		Person.printCount();
	}
}

//Personクラスを定義してください
class Person {
	// int型のクラスフィールドcountを定義し、0を代入してください
	// クラスフィールドはstaticをつける。
	public static int count = 0;
	// 「private」にすると他のフォールドから参照できなくなる。クラス内からは参照可能
	private static int count = 0;
	private String firstName;
	private String middleName;

	// 他フィールドから安全にprivateフィールドを参照するため、middleNameフィールドのゲッターを定義
	// 「getメソッド名」で命名する。
	public String getMiddleName() {
		return this.middleName;
	}

	// 他フィールドから安全にprivateフィールドを変更するため、middleNameフィールドのセッターを定義
	// 「setメソッド名」で命名する。
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	// コンストラクタを定義。インスタンス生成時に自動実行
	// コンストラクタがString型の引数を受け取るようにしてください
	Person(String name) {
		System.out.println("インスタンスが生成されました");
		// インスタンスフィールドnameに値をセットしてください
		this.name = name;
		// 変数countに1を足してください
		Person.count++;
	}

	// インスタンスメソッドhelloを定義してください
	public void hello() {
		System.out.println("こんにちは、私は" + this.name + "です");
	}

	// インスタンスフィールドnameを定義してください
	public String name;

	// クラスメソッドprintCount()を定義してください
	// クラスメソッドはstaticをつける
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}

	Person(String firstName, String lastName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
		// this()を用いて、他のコンストラクタを呼び出し、被ってる部分を省略できる
		this(firstName, middleName, lastName, age, height, weight);
		this.middleName = middleName;
	}
}