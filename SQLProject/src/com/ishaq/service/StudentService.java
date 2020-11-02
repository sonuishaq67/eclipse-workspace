package com.ishaq.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.collegemodel.Student;
import com.ishaq.repo.StudentRepo;

public class StudentService {

	public void showStudentOptions() {
		System.out.println(
				"ENTER A CHOICE Welcome to msrit college \n1)INSERT STUDENT DETAILS\n2)DELETE STUDENT DETAILS\n3)UPDATE STUDENT DETAILS\n4)GET STUDENT DETAILS");
		Scanner x = new Scanner(System.in);

		int choice = x.nextInt();
		StudentRepo stdRepo = new StudentRepo();

		switch (choice) {
		case 1: {

			Student std = new Student();
			System.out.println("enter Name Branch ID_NO Section Roll_no");
			std.setName(x.next());
			std.setBranch(x.next());
			std.setID_NO(x.next());
			std.setSection(x.next());
			std.setRoll_no(x.nextInt());
			stdRepo.insertStudent(std);
			break;
		}
		case 2: {
			String x1= new String();
			System.out.println("enter the primary key of the student you want to delete");
			x1=x.next();
			stdRepo.deleteStudent(x1);
			break;
		}
		case 3: {
			Student std = new Student();
			System.out.println("enter the primary key of the student you want to update");
			std.setID_NO(x.next());
			System.out.println("enter the name,branch,section and roll no");
			std.setName(x.next());
			std.setBranch(x.next());
			std.setSection(x.next());
			std.setRoll_no(x.nextInt());
			stdRepo.updateStudent(std);
			break;
		}
		case 4: {
			ArrayList<Student> lst = stdRepo.getAllStudents();
			displayAllStudents(lst);
			break;
		}
		default: {
			System.out.println("default");
		}
		}
	}

	private  void displayAllStudents(ArrayList<Student> lst) {
		for (Student st : lst) {

			System.out.println(" Student Name " + st.getName());
			System.out.println(" Student Branch " + st.getBranch());
			System.out.println(" Student Roll No " + st.getRoll_no());
			System.out.println(" Student ID Num " + st.getID_NO());
			System.out.println(" Student Section " + st.getSection());

		}
		// TODO Auto-generated method stub

	}

}
