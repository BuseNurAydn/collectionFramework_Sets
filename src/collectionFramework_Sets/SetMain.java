package collectionFramework_Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new LinkedHashSet<String>();
		Set<String> s3 = new TreeSet<String>();
		
		//HASHSET
		s1.add("Java");
		s1.add("Python");
		s1.add("C++");
		s1.add("C#");
		
		//LÝNKEDHASHSET
		s2.add("Java");
		s2.add("C++");
		s2.add("Python");
		s2.add("C#");
		
		//TREESET
		s3.add("Java");
		s3.add("C++");
		s3.add("Python");
		s3.add("C#");
		
		//EKRANA YAZDIRMAK ÝÇÝN
		for(String set : s1) {
			System.out.println(set);
		}
		System.out.println("****************************");
		
		for(String set1 : s2) {
			System.out.println(set1);
		}
		System.out.println("*********************************");
		for(String set2 : s3) {
			System.out.println(set2);
		}
		System.out.println("*******************************");
		System.out.println(s1.contains("Go")); // s1 de go vae mý diye kontrol eder.varsa true döndürür
		                                       // yoksa da false döndürür
	
		
		 Set<String> set1 = new HashSet<String>();
		 Set<String> set2 = new HashSet<String>();
		    
		    set1.add("Java");
		    set1.add("C++");
		    set1.add("Python");
		    set1.add("Javascript");
		    set1.add("Php");
		    
		    set2.add("Go");
		    set2.add("Java");
		    set2.add("CSS");
		    
		    
		  /* Set<String> fark = new HashSet<String>(set2);
		    
		        System.out.println(fark.removeAll(set1));
		        System.out.println(fark);*/
		  
		    Set<String> kesisim = new HashSet<String>(set2);
		        System.out.println(kesisim.retainAll(set1));
		        
		        
		        System.out.println(kesisim);
	}
}
