package debug;

// ��������� Demo
class Demo {
	
	// ����һ̨����
	Car car = new Car("����L5", 3.0, 250000D);
	
	// ����һֻ��
	Hand hand = new Hand(8D, 42D, 45D);
	
	// ���� Person ��������պ���˽�
	Person sunwukong = new Person("1", "�����", 500, hand);
	Person zhubajie = new Person("2", "��˽�", 480, hand);
}

public class Demo6_2 { 
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.print("����ն԰˽�˵:");
		demo.sunwukong.saying(demo.zhubajie, "�˽�,�������");
		demo.sunwukong.getSomething("������һ���𹿰�");
		demo.sunwukong.start(demo.car);
		System.out.println(demo.car.getBrand());
	}
}
