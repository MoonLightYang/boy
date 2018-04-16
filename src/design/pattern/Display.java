package design.pattern;

public class Display implements Observer {
	
	public static void main(String[] args) {
		System.out.println("fdafda");
		System.out.println("f1");
		System.out.println("fda");
	}

	WeatherData data;

	public Display(WeatherData data) {
		this.data = data;
		data.regist(this);
	}

	@Override
	public void refresh() {
		System.out.println("我收到了你们的通知");
	}
}
