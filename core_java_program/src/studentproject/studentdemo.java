package studentproject;

public class studentdemo {
 
		public static void main(String[] args) {
			student s1=new student();
			student s2=new student();
			student s3=new student();
			
			
			s1.setSid(100);
			s1.setSname("saravananB");
			s1.setSdept("ECE");
			s1.setSstream("Engineering");
			s1.setSgraduation("2025");
			s1.setSyear("Finalyear");
			s1.setSmobilenumber("9344560741");
			
			s2.setSid(99);
			s2.setSname("santhoshR");
			s2.setSdept("ECE");
			s2.setSstream("Engineering");
			s2.setSyear("Final year");
			s2.setSgraduation("2025");
			s2.setSmobilenumber("9952226537");
			
			s3.setSid(104);
			s3.setSname("seenuvasanS");
			s3.setSdept("ECE");
			s3.setSstream("Engineering");
			s3.setSyear("Final year");
			s3.setSgraduation("2025");
			s3.setSmobilenumber("9342238388");
			
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			
			

		}
}
