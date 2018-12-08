package debug;

//定义汽车类 Car 
public class Car {
	
	// 定义成员变量
	private String brand;
	private Double emission;
	private Double price;
	
	// 定义构造方法初始化所有成员变量
	public Car(String brand, Double emission, Double price) {
		this.brand = brand;
		this.emission = emission;
		this.price = price;
	}
	public String getBrand() {
		return this.brand;
	}
	public void starting() {
		System.out.println("启动发动机");
	}
}