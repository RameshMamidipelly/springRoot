package bean;

public class Car {
	private String name;
	private Engine engine;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Car(String name, Engine engine) {
		super();
		this.name = name;
		this.engine = engine;
	}
	
	public String display() {
		System.out.println("dfasdfss");
		return "Car [name=" + name + ", engine=" + engine.display() + "]";
	}
	

}
