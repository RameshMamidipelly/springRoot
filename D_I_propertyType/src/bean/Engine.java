package bean;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Engine {
	private String etype;
	private String eid;
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(String etype, String eid) {
		super();
		this.etype = etype;
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Engine [etype=" + etype + ", eid=" + eid + "]";
	}
	public String getEtype() {
		return etype;
	}
	public void setEtype(String etype) {
		this.etype = etype;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}

	
	
	
	
	
	

}
