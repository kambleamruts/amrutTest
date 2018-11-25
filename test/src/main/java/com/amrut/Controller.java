package com.amrut;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Controller {
	
	
	HashMap<String,String>names=new HashMap<String,String>();	

	//method to change name
	public void changeName(){
		
		System.out.println("inside method changeName");
		names.put("1", "amrut");
		names.put("2", "rohit");
		names.put("3", "rohan");
		names.put("4", "rahul");
		
		Set<String> keys=names.keySet();
		Iterator<String>it=keys.iterator();
		
		while(it.hasNext()){
			String key=it.next();
			System.out.println(key+ "  "+names.get(key) );
		}
	}
}
