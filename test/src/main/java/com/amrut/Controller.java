package com.amrut;

import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class Controller {
	
	
	HashMap<String,String>names=new HashMap<String,String>();	

	//method to change name
	public void changeName(){
		names.put("1", "amrut");
		names.put("2", "rohit");
		names.put("3", "rohan");
		names.put("4", "rahul");
		Set<String> keys=names.keySet();
		for(String name:keys)
			System.out.println(name+ "  "+names.get(name) );
	}
}
