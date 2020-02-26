package bean;

import java.util.List;
import java.util.Properties;

public class Car {
	private String name;
	private Engine engine;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String name, Engine engine) {
		super();
		this.name = name;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + "]";
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
	
}
