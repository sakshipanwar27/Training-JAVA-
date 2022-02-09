enum Season{
	WINTER , SPRING , SUMMER, FALL
}

public class Day {
	public static void main(String[] args) {
	for(Season s: Season.values())
		System.out.println(s);
	}
	
}
