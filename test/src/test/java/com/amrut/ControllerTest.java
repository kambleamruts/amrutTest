package com.amrut;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;



@RunWith(JUnit4.class)
public class ControllerTest {

	@Test
	public void test() {
		Controller service=new Controller();
		service.changeName();
		HashMap<String,String>names=service.getNames();
		assertEquals(4, names.size());
	}

	
	
	

}
