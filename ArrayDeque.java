package com;

import java.util.Iterator;

public class ArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.ArrayDeque<Object> list = new java.util.ArrayDeque<Object>();
		list.add("abc");
		list.add("Santhosh");
		list.add("Harry");
		list.add("Johnson");
		list.add("125");
		
		
	/*
		Iterator<Object> itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		
		*/
		for(Object data: list) {
			System.out.println("List of data:"+data);
				
			
		}
	
	

	}}
