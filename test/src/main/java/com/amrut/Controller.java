package com.amrut;

import java.util.HashMap;
import java.util.Set;


public class Controller {
	
	
	HashMap<String,String>names=new HashMap<String,String>();	

	
	//method to change name, removed iterator using other developer for loop
	public void changeName(){		

		System.out.println("this is master   branch");
		names.put("1", "ashish");
		names.put("2", "rohit");
		names.put("3", "rohan");
		names.put("4", "rahul");
		Set<String> keys=names.keySet();
		for(String name:keys)
			System.out.println(name+ "  "+names.get(name) );

		System.out.println("done with changes");
		
	}


	public HashMap<String, String> getNames() {
		return names;
	}


	public void setNames(HashMap<String, String> names) {
		this.names = names;
	}
	
	
}
