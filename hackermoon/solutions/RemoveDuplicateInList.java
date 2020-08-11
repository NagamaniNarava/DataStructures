package com.hackermoon.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class RemoveDuplicateInList {

	static class Person{
		String firstname;
		String lastName;
		
		Person(String n1,String n2){
			firstname = n1;
			lastName = n2;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		@Override
		public String toString() {
			return "Person [firstname=" + firstname + ", lastName=" + lastName + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
			result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (firstname == null) {
				if (other.firstname != null)
					return false;
			} else if (!firstname.equals(other.firstname))
				return false;
			if (lastName == null) {
				if (other.lastName != null)
					return false;
			} else if (!lastName.equals(other.lastName))
				return false;
			return true;
		}
	}
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("naga","mani"));
		persons.add(new Person("avi","molleti"));
		persons.add(new Person("ruhi","tanvi"));
		persons.add(new Person("naga","mani"));
		List<Person> parents = new ArrayList<>();
		parents.add(new Person("naga","mani"));
		parents.add(new Person("avi","molleti"));
		parents.add(new Person("ruhi","tanvi"));
		parents.add(new Person("naga","mani"));
		HashMap<String, List<Person>> map = new HashMap<>();
		map.put("kids",persons);
		map.put("parents",persons);
		removeDupicatesInMapKeys(map);
	}
	private static void removeDupicatesInMapKeys(HashMap<String, List<Person>> map) {
		System.out.println(map);
		for(Map.Entry<String, List<Person>> entry :  map.entrySet()) {
			List<Person> persons = entry.getValue();
//			for(int i=0;i<persons.size();i++) {
//				Person tempP= persons.get(i);
//				persons = persons.stream().filter(person->(tempP.firstname!=person.getFirstname())).collect(Collectors.toList());
//				persons.add(i, tempP);
//			}
			
			persons = persons.stream().distinct().collect(Collectors.toList());
			System.out.println(persons);
			map.put(entry.getKey(), persons);
			
		}
		System.out.println(map);
	}
}
