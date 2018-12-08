package debug;
//定义 Person 类
public class Person {
	
	// 定义成员变量
	private String id;
	private String name;
	private int age;
	private Hand hand;
	
	// 定义空构造方法
	Person() {
		
	}
	Person(String id, String name, int age, Hand hand) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.hand = hand;
	}
	
	// 定义 getName() 方法返回人的姓名
	public String getName() {
		return this.name;
	}
	
	// 功能方法
	// showPerson() 方法显示某个人的信息
	// saying(Person per, String msg) 方法表示一个人对另一个人说了一些信息 msg
	// getSomething(String something)表示用手拿东西,需要调用 Hand 对象的拿方法 catching()
	// start(Car car) 方法表示某人启动了一台汽车,需要调用 Car 的 starting 方法启动发动机
	public void showPerson() {
		
	}
	public void saying(Person per, String msg) {
		System.out.println(msg);
	}
	public void getSomething(String something) {
		new Hand().catching(something);
	}
	public void start(Car car) {
		car.starting();
	}
}

