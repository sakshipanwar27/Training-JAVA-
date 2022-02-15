package FifteenFeb;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	
	public static void main(String[] args) {
		//write ()NewFile.txt
		FileOutputStream f= null;
		File file;
		String content = "Hello I am SAKSHI ";
		try {
			
			//path
			file = new File("D:\\Training\\Day8.txt");
			f= new FileOutputStream(file);
			if(!file.exists()) {
				file.createNewFile();
			}
			byte[] arr =content.getBytes();
			f.write(arr);
			System.out.println("Sucessfulyy written ");
			
		}
			catch(IOException e)
		
		{
				
				e.printStackTrace();
				
		}
		finally {
			try {
				f.close();
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
