package com;

import java.util.Iterator;


public class PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.PriorityQueue<Integer> list = new java.util.PriorityQueue<Integer>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(2);
		list.add(8);
		list.add(1);
		
		System.out.println(list.peek());
		System.out.println(list.poll());
		for(Integer data: list) {
			System.out.println("List of data:"+data);
				
			
		}
	
	

	}}
