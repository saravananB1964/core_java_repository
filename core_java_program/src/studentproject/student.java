package studentproject;

public class student {
	private int sid; 
	private String sname;
	private String sdept;
	private String sstream;
	private String sgraduation;
	private String syear;
	private String smobilenumber;
	public int getSid() {
		   
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	public String getSstream() {
		return sstream;
	}
	public void setSstream(String sstream) {
		this.sstream = sstream;
	}
	public String getSgraduation() {
		return sgraduation;
	} 
	public void setSgraduation(String sgraduation) {
		this.sgraduation = sgraduation;
	} 
	public String getSyear() {
		return syear;
	}
	public void setSyear(String syear) {
		this.syear = syear;
	}
	public String getSmobilenumber() {
		return smobilenumber;
	}
	public void setSmobilenumber(String smobilenumber) {
		this.smobilenumber = smobilenumber;
	}
	@Override 
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", sdept=" + sdept + ", sstream=" + sstream
				+ ", sgraduation=" + sgraduation + ", syear=" + syear + ", smobilenumber=" + smobilenumber + "]";
	}
	
}
