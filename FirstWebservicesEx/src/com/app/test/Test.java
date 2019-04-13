
package com.app.test;

import org.codehaus.jackson.map.ObjectMapper;

import com.app.model.Employee;

public class Test {

	public static void main1(String[] args) {
		
		Employee emp=new Employee();
		
		emp.setEmpId(10);
		emp.setEmpName("Bala");
		emp.setEmpSal(23.44);
		emp.setEmpPwd("1234");
		
		try {
			ObjectMapper om=new ObjectMapper();
			String json=om.writeValueAsString(emp);
			System.out.println(json);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		}
	
	public static void main(String[] args) {
		try {
		ObjectMapper om=new ObjectMapper();
		String json="{\"empId\":20,\"empName\":\"bala\",\"empSal\":23.45},\"empPwd\":\"1234\")";
		Employee emp=om.readValue(json, Employee.class);
		System.out.println(emp);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
	
	

