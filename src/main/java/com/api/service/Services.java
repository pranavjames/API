package com.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Services {

	static List<String> list;
	
	public Services() {
		list = new ArrayList<>();
		fillList();
	}
	
	private static void fillList() {
		list.add("String 1");
		list.add("String 2");
		list.add("String 3");
		list.add("String 4");
		list.add("String 5");		
				
	}
	
	public List<String> getAll(){
		
		return list;
	}
	
	
	public Boolean addElement(String element) {
		return list.add(element);
	}
	
	public Boolean removeElement(String element) {
		return list.remove(element);
	}
	
	public Boolean removeAll() {
		return list.removeAll(list);
	}
}
