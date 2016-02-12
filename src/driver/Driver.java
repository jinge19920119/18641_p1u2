package driver;

import adapter.BuildAuto;
import util.FileIO;
/*
 * Name: Ge Jin
 * andrew id: gjin
 * date : jun 12, 2015
 */



public class Driver {
	public static void main(String[] args){
		
		BuildAuto ba= new BuildAuto();
//		ba.BuildAuto("readFile.txt");//Exception 1
//		ba.BuildAuto("readFile2.txt");//Exception 2
//		ba.BuildAuto("readFile3.txt");//Exception 3
//		ba.BuildAuto("readFile4.txt");//Exception 4
//		ba.BuildAuto("readFile5.txt");//Exception 5
		ba.BuildAuto("readFile1.txt");
		
		
		/*
		 * test for other functions
		 */
		ba.BuildAuto("readFile1+.txt");
		ba.printAuto("S90");
		ba.updateOptionPrice("S90", "air bags", "none", 200);
		ba.updateOptionSetName("S90", "color", "colorcolor");
		ba.printAuto("S90");
		
	}
	

}
