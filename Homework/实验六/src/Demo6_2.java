package debug;

// 定义测试类 Demo
class Demo {
	
	// 创建一台汽车
	Car car = new Car("红旗L5", 3.0, 250000D);
	
	// 创建一只手
	Hand hand = new Hand(8D, 42D, 45D);
	
	// 创建 Person 对象孙悟空和猪八戒
	Person sunwukong = new Person("1", "孙悟空", 500, hand);
	Person zhubajie = new Person("2", "猪八戒", 480, hand);
}

public class Demo6_2 { 
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.print("孙悟空对八戒说:");
		demo.sunwukong.saying(demo.zhubajie, "八戒,你个呆子");
		demo.sunwukong.getSomething("拿起了一根金箍棒");
		demo.sunwukong.start(demo.car);
		System.out.println(demo.car.getBrand());
	}
}
