class StaticCount{
	 static int sCount;
	 int nCount;
	 public void countMethod() {
		 sCount++;
		nCount++;
		System.out.println("Static count"+sCount);
		System.out.println("Non Static count"+ nCount);
		
		
	 }
	 
}

public class Stas {
	public static void main(String[] args) {
		 StaticCount s1 = new StaticCount();
		   s1.countMethod();
		   StaticCount s2 = new StaticCount();
		   s1.countMethod();
		   StaticCount s3 = new StaticCount();
		   s1.countMethod();
		
		
		
		
	}

}
