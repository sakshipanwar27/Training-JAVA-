package FifteenFeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyfileImpl {
	public static void main(String[] args) {
		FileInputStream input = null;
		FileOutputStream output = null;
		try {
			File inputfile=new File("D:\\Training\\15Feb\\FileOutputStreamDemo.txt");
		    File outputfile=new File("D:\\Training\\15Feb\\New Text Document.txt");
		    input = new FileInputStream(outputfile);
		    output= new FileOutputStream(inputfile);
		    byte[]arr = new byte [1024];
		    int length;
		    while((length=input.read(arr))>0)
		    {
		    	output.write(arr,0,length);
		    }
		    System.out.println("Success copy");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				input.close();
				output.close();
				
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		    	
		}
		
	}

}
