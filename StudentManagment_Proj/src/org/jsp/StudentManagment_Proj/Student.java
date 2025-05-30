package org.jsp.StudentManagment_Proj;

public class Student {
	    private int id;
	    private String name;
	    private int age;

	    public Student(int id, String name, int age) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	    }

	    public void setId(int id) {
	    	this.id=id;
	    }
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    @Override
	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Age: " + age;
	    }
}
