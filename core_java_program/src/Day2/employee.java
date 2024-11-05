package Day2;

public class employee {
		
		int eid;
		String ename;
		@Override
		public String toString() {
			return "employee [eid=" + eid + ", ename=" + ename + ", city=" + city + ", address=" + address + "]";
		}
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		String city;
		String address;
}
