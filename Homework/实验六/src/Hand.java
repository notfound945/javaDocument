package debug;

// ���� Hand ��
public class Hand {
	
	// �����Ա����
	private Double length;
	private Double area;
	private Double grip;
	public Hand() {
	}
	
	// �����ʼ�����г�Ա����
	public Hand(Double length, Double area, Double grip) {
		this.length = length;
		this.area = area;
		this.grip = grip;
	}
	
	// ʡ�� setter ��  getter ����
	
	// ���ܷ���
	// catching(String thing) ����ץ���� 
	// getInfo() ����ȡ��Hand��������Ϣ
	public void catching(String thing) {
		System.out.println(thing);
	}
	public void getInfo() {
		System.out.println("��ָ����  " + this.length + "������� " + 
				this.area + "���� " + this.grip);
	}
}
