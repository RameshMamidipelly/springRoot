package bean;

interface Classsd{
}

public class Male {
	private int no_boys;
	private int no_mens;
	public Male() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Male(int no_boys, int no_mens) {
		super();
		this.no_boys = no_boys;
		this.no_mens = no_mens;
	}
	@Override
	public String toString() {
		return "Male [no_boys=" + no_boys + ", no_mens=" + no_mens + "]";
	}
	public int getNo_boys() {
		return no_boys;
	}
	public void setNo_boys(int no_boys) {
		this.no_boys = no_boys;
	}
	public int getNo_mens() {
		return no_mens;
	}
	public void setNo_mens(int no_mens) {
		this.no_mens = no_mens;
	}
	

}
