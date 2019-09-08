package com.amrut;

import com.ibm.mq.jms.MQQueueConnectionFactory;

public class AskConstant {

	
	public final static String EMPLOYEE_NAME="Amrut";
	public final static String EMPLOYEE_ID="12345";
	public final static String EMPLOYEE_SALARY="34.34";
	public final static String EMPLOYEE_DOB="24/10/1989";
	
	MQQueueConnectionFactory asdsa=new MQQueueConnectionFactory();
	
	public void show(){
		asdsa.setHostName("");
		
	}
}
