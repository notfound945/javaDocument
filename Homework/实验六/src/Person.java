package debug;
//���� Person ��
public class Person {
	
	// �����Ա����
	private String id;
	private String name;
	private int age;
	private Hand hand;
	
	// ����չ��췽��
	Person() {
		
	}
	Person(String id, String name, int age, Hand hand) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.hand = hand;
	}
	
	// ���� getName() ���������˵�����
	public String getName() {
		return this.name;
	}
	
	// ���ܷ���
	// showPerson() ������ʾĳ���˵���Ϣ
	// saying(Person per, String msg) ������ʾһ���˶���һ����˵��һЩ��Ϣ msg
	// getSomething(String something)��ʾ�����ö���,��Ҫ���� Hand ������÷��� catching()
	// start(Car car) ������ʾĳ��������һ̨����,��Ҫ���� Car �� starting ��������������
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

