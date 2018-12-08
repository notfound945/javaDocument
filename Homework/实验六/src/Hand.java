package debug;

// 定义 Hand 类
public class Hand {
	
	// 定义成员变量
	private Double length;
	private Double area;
	private Double grip;
	public Hand() {
	}
	
	// 定义初始化所有成员变量
	public Hand(Double length, Double area, Double grip) {
		this.length = length;
		this.area = area;
		this.grip = grip;
	}
	
	// 省略 setter 和  getter 方法
	
	// 功能方法
	// catching(String thing) 方法抓东西 
	// getInfo() 方法取得Hand的所有信息
	public void catching(String thing) {
		System.out.println(thing);
	}
	public void getInfo() {
		System.out.println("手指长度  " + this.length + "手掌面积 " + 
				this.area + "握力 " + this.grip);
	}
}
