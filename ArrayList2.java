package com;

import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(101,"Harry");
		Employee e2 = new Employee(102,"Santhosh");
		Employee e3 = new Employee(103,"Johnson");
		
		
		
		
		java.util.ArrayList<Object> list = new java.util.ArrayList<Object>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		

		Iterator<Object> itr=list.iterator();
		while(itr.hasNext()){
			Employee emp = (Employee) itr.next();
			System.out.print("Employee ID: "+emp.empId);
			System.out.print("Employee Name: "+emp.name);
			System.out.println("");
		}
	}
}
