package bean;

public abstract class Female {

	private int no_girls;
	private Integer no_womans;
	public Female() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Female(int no_girls, int no_womans) {
		super();
		this.no_girls = no_girls;
		this.no_womans = no_womans;
	}
	
	@Override
	public String toString() {
		return "Female [no_girls=" + no_girls + ", no_womans=" + no_womans + "]"+getNo_womans();
	}
	public int getNo_girls() {
		return no_girls;
	}
	public void setNo_girls(int no_girls) {
		this.no_girls = no_girls;
	}
	public abstract Integer getNo_womans();
	public void setNo_womans(Integer no_womans) {
		this.no_womans = no_womans;
	}
	
	
}
