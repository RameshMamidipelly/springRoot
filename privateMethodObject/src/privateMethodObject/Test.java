package privateMethodObject;

import java.lang.reflect.Constructor;

public class Test {

	public static void main(String[] args) throws Exception {
		Class c=Class.forName("privateMethodObject.Student");
		Constructor []cc=c.getDeclaredConstructors();
		cc[0].setAccessible(true);
		cc[0].newInstance(null);	
	}

}
