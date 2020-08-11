package com.crackingcodinginterview;

import java.util.HashMap;

public class Simpe {

	class Student {
		int id;
		String name;
		Student(int id,String name){
			id=id;
			name=name;
		}
	}
	public static void main(String[] args) {
		Student s[] = new Student[5];
		
		HashMap<Integer,Student> map = buildMap(s);
	}
	private static HashMap<Integer, Student> buildMap(Student[] s) {
		for(Student stu :s) {
			
		}
		return null;
	}

}
