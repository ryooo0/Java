package progate;

public class progate4 {
	public static void main(String[] args) {
		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		// getOwnerメソッドを用いてbicycleのownerを取得(Person型)
		// PersonクラスのprintDataメソッドを使える
		bicycle.getOwner().printData();
	}
}

//抽象メソッドがあるクラスは必ず抽象クラスになる
//抽象クラスではインスタンスが生成できない
abstract class Vehicle {
	private String name;
	private String color;
	// protectedはクラス内とサブクラス内の参照を許可
	protected int distance = 0;
	// Person型のインスタンスフィールドownerを定義
	private Person owner;

	public String getName() {
		return this.name;
	}

	public String getColor() {
		return this.color;
	}

	public int getDistance() {
		return this.distance;
	}

	// ownerフィールドのゲッターを定義
	// 戻り値はPerson型になる
	public Person getOwner() {
		return this.owner;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// ownerフィールドのセッターを定義
	public void setOwner(Person person) {
		this.owner = person;
	}

	public void printData() {
		System.out.println("名前：" + this.name);
		System.out.println("色：" + this.color);
		System.out.println("走行距離：" + this.distance + "km");
	}

	// 抽象メソッドrunを定義　abstract
	// 抽象メソッドがあるときは、必ずサブクラスでそのメソッドを定義しないといけない
	abstract public void run(int distance);
}

//Vehicleクラス(スーパークラス)を継承
class Car extends Vehicle {
	public void printData() {
		// superを用いて、オーバーライドの中のスーパークラス記載の重複部分を省略できる
		super.printData();
		System.out.println("ガソリン量：" + this.fuel + " L");
	}
}

//Vehicleクラスを継承
class Bicycle extends Vehicle {
	// サブクラスのコンストラクタを設定するときは、スーパークラスのコンストラクタを必ず実行しないとだめ。superで参照できる
	Car(String name, String color) {
		  super(name, color);
	}
}
