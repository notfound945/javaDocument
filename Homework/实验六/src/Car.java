package debug;

//���������� Car 
public class Car {
	
	// �����Ա����
	private String brand;
	private Double emission;
	private Double price;
	
	// ���幹�췽����ʼ�����г�Ա����
	public Car(String brand, Double emission, Double price) {
		this.brand = brand;
		this.emission = emission;
		this.price = price;
	}
	public String getBrand() {
		return this.brand;
	}
	public void starting() {
		System.out.println("����������");
	}
}