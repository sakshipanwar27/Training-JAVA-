package FifteenFeb;

import java.io.File;
import java.text.SimpleDateFormat;

public class RenameFileDemo {
	

	public static void main(String[] args) {
		File oldfile = new File("D:\\Training\\oldfile.txt");
		File newfile= new File("D:\\Training\\newfile.txt");
		
		SimpleDateFormat sf= new SimpleDateFormat("MM/dd/yyyy HH:mm:ss ");
		
		boolean var = oldfile.renameTo(newfile);
		System.out.println("last modidfied " + " "+sf.format(newfile.lastModified()));
		
		if(var) {
			System.out.println(" file renamed succes");
		}
		else {
			System.out.println(" error");
		}
		
	}

}
