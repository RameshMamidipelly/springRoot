package bean;

import java.util.Vector;

public class Car {
	private Vector<String> name;
	private Engine engine;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(Vector<String> name, Engine engine) {
		super();
		this.name = name;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + "]";
	}
	public Vector<String> getName() {
		return name;
	}
	public void setName(Vector<String> name) {
		this.name = name;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
		
	
	

}
