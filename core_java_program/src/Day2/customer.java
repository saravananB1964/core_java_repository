package Day2;

public class customer {

	private int cid; 
	private String cname;
	private String caddress;
	private String cdept;
	private String ccity;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCdept() {
		return cdept;
	}
	public void setCdept(String cdept) {
		this.cdept = cdept;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	@Override
	public String toString() {
		return "customer [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + ", cdept=" + cdept + ", ccity="
				+ ccity + "]";
	}
	
}
	