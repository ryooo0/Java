package progate;

public class progate4 {
	public static void main(String[] args) {
		  Car car = new Car();
		  Bicycle bicycle = new Bicycle();
	}
}

class Vehicle {
	  private String name;
	  private String color;
	  private int distance = 0;

	  public String getName() {
	    return this.name;
	  }
	  public String getColor() {
	    return this.color;
	  }
	  public int getDistance() {
	    return this.distance;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public void setColor(String color) {
	    this.color = color;
	  }
	  public void printData() {
	    System.out.println("名前：" + this.name);
	    System.out.println("色：" + this.color);
	    System.out.println("走行距離：" + this.distance + "km");
	  }
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
	  
}