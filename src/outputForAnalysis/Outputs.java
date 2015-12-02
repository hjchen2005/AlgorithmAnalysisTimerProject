package outputForAnalysis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Outputs {
	public static boolean OutputToFile(File file, double time){
		try{
			if (!file.exists()){
				System.out.println("File does not exist");	
			}  // end if
			PrintWriter out = new PrintWriter(new FileWriter(file, true));
			out.append(time+"\n");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
				System.out.println("Cannot output to fi");
			}// end catch
		
		return file.exists();
	} // end method
}
