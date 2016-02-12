package adapter;
import model.Automobile;
import model.Fleet;
import util.FileIO;

public abstract class ProxyAutomobile {
	private Automobile a1;
	private static Fleet autoSet= new Fleet();
	
	public void BuildAuto(String fileName){//build an Automobile object through a filename
		FileIO fio= new FileIO();
		a1= fio.buildAutoObject(fileName);
		autoSet.addModel(a1.getModel(), a1);
	}
	public void printAuto(String modelName){//print the values of this object
		Automobile auto= autoSet.readModel(modelName);
		auto.print();
	}
	public void updateOptionSetName(String modelName, String optionSetName, String newName){//update the name of one optionSet
		Automobile auto= autoSet.readModel(modelName);
		auto.updateOptionSetName(optionSetName, newName);
	}
	/*
	 * update the price of one option
	 */
	public void updateOptionPrice(String modelName, String optionName, String option, float newPrice){
		Automobile auto= autoSet.readModel(modelName);
		auto.updateOptionPrice(optionName, option, newPrice);
	}

}
