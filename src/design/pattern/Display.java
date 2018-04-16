package design.pattern;

public class Display implements Observer {

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
