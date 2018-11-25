package com.amrut;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class Controller {
	
	
	HashMap<String,String>names=new HashMap<String,String>();	

	
	//method to change name, removed iterator using other developer for loop
	public void changeName(){		

		System.out.println("this is master branch changes done by developer 2");
		names.put("1", "amrut");
		names.put("2", "rohit");
		names.put("3", "rohan");
		names.put("4", "rahul");
		Set<String> keys=names.keySet();
		for(String name:keys)
			System.out.println(name+ "  "+names.get(name) );

		System.out.println("done with changes");
		
		
		List<String> ids=new ArrayList<String>();
		ids.add("1");
		ids.add("2");
		ids.add("3");
		ids.add("4");
		ids.add("5");
		ids.add("6");
	}
}
