package Changhenge;

public class Test {
	public static void main(String args[]) throws A{ 
		 Poetry changhege; 
		 String b; 
		 b=""; 
		 try { 
		 changhege=new Poetry(b); 
		 if (b=="") { 
		 throw new A("����������ַ�"); 
		 } 
		 else { 
		 System.out.print(changhege); 
		 } 
		 } 
		 catch(A r) { 
		 r.printStackTrace(); 
		 } 
		 finally { 
		 System.out.print("�������н���"); 
		 } 
		   } 
}