package outputForAnalysis;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.*;

public class ChartVisual {
	public static void chartCreation(File file, String title){
		DefaultCategoryDataset dataBar = new DefaultCategoryDataset();
		ArrayList<Double> list = new ArrayList<>();
		Scanner scanner;
		int dataCount=0;
		try{
			scanner = new Scanner(file);
			while (scanner.hasNext()){
				list.add(scanner.nextDouble());
				dataBar.setValue(list.get(dataCount), "Test "+(dataCount+1), "");
				dataCount++;
			}
			scanner.close();
		}catch (FileNotFoundException ex) {
			Logger.getLogger(ChartVisual.class.getName()).log(Level.SEVERE, null, ex);
		} // end catch
	
	 JFreeChart chart = ChartFactory.createBarChart(title, "Test results","Milliseconds",dataBar);
     ChartFrame frame = new ChartFrame(title,chart);
     frame.setSize(400, 500);
     frame.setVisible(true);
	} // end method
}
