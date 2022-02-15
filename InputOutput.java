package FifteenFeb;

import java.io.File;
import java.io.IOException;

public class InputOutput {
	public static void main(String[] args) {
		//createNewFile()---> empty file 
		
		try {
			File file = new File("D:\\Training\\Day8.txt");
			boolean var = file.createNewFile();
			if (var) {
				System.out.println("file created");
			}
			else {
				System.out.println("File already present ");
			}
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
	}

}
}
