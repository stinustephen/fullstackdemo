package com;

import java.util.Iterator;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.ArrayList<Object> list = new java.util.ArrayList<Object>();
		list.add("abc");
		list.add("Santhosh");
		list.add("Harry");
		list.add("Johnson");
		list.add(125);
		list.add("Harry");
		list.add("Johnson");
		list.add(125);
		list.add("Harry");
		list.add("Johnson");
		list.add(125);
		list.size();
		
		
	/*
		Iterator<Object> itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		
		*/
		for(Object data: list) {
			System.out.println("List of data:"+data);
			System.out.println(list.size());	
			
		}
	
	

	}}
