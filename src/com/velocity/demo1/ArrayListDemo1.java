package com.velocity.demo1;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("chinku");
		list.add("pinku");
		list.add("dinku");
		
		for(String s:list){
			System.out.println(s);
		}
	}

}
