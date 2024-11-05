package Day2;

public class customerdemo {

	public static void main(String[] args) {
		customer c1=new customer();
		customer c2=new customer();
		customer c3=new customer();
		customer c4=new customer();
		customer c5=new customer();
		
		c1.setCid(100);
		c1.setCname("saravanan");
		c1.setCdept("ece");
		c1.setCaddress("Nellikuppam");
		c1.setCcity("cuddalore");
		
		c2.setCid(99);
		c2.setCname("santhosh");
		c2.setCdept("ece");
		c2.setCaddress("Melvazhai");
		c2.setCcity("tiruvannamalai");
		
		c3.setCid(49);
		c3.setCname("surya");
		c3.setCdept("Bcom");
		c3.setCaddress("tnagar");
		c3.setCcity("chennai");
		
		c4.setCid(38);
		c4.setCname("karthi");
		c4.setCdept("visualcommunication");
		c4.setCaddress("tnagar");
		c4.setCcity("chennai");
		
		c5.setCid(104);
		c5.setCname("seenuvasan");
		c5.setCdept("ece");
		c5.setCaddress("Nellikuppam");
		c5.setCcity("cuddalore");
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
        System.out.println(c4);
		System.out.println(c5);

	}

}
