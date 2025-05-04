package org.jsp.StudentManagment_Proj;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
	 private static ArrayList<Student> students = new ArrayList<>();
	    private static Scanner scanner = new Scanner(System.in);
	    private static int num=0;
	    

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("\n===== Student Management System =====");
	            System.out.println("1. Add Student");
	            System.out.println("2. View Students");
	            System.out.println("3. Delete Student");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    addStudent();
	                    break;
	                case 2:
	                    viewStudents();
	                    break;
	                case 3:
	                    deleteStudent();
	                    break;
	                case 4:
	                    System.out.println("Exiting the system. Goodbye!");
	                    return;
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	        }
	    }

	    // Method to add a new student
	    private static void addStudent() {
//	        System.out.print("Enter Student ID: ");
//	        int id = scanner.nextInt();
//	        scanner.nextLine(); // Consume newline

	        System.out.print("Enter Student Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Student Age: ");
	        int age = scanner.nextInt();

	        students.add(new Student(++num, name, age));
	        System.out.println("Student added successfully!");
	    }

	    // Method to view all students
	    private static void viewStudents() {
	        if (students.isEmpty()) {
	            System.out.println("No students found.");
	        } else {
	            System.out.println("\nList of Students:");
	            for (Student student : students) {
	                System.out.println(student);
	            }
	        }
	    }

	    // Method to delete a student by ID
	    private static void deleteStudent() {
	        System.out.print("Enter Student ID to delete: ");
	        int id = scanner.nextInt();
	        boolean found = false;

	        for (int i = 0; i < students.size()+1; i++) {
	            if (students.get(i).getId() == id) {
	                students.remove(i);
	                found = true;
	                System.out.println("Student deleted successfully!");
	               
	                for(int j=i;j<students.size();j++) {
	                	students.get(j).setId(students.get(j).getId()-1);
	                }
	                
	                break;
	            }
	        }
	        
	        num=students.size();

	        if (!found) {
	            System.out.println("Student with ID " + id + " not found.");
	        }
	    }
}
