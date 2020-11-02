package com.ishaq.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.collegemodel.Branch;
import com.collegemodel.Exam;
import com.ishaq.repo.ExamRepo;

public class ExamService {

	public void ShowExamOptions() {
		System.out.println("ENTER A CHOICE  \n1)INSERT exams DETAILS\n2)GET exam DETAILS\n3)update exam\n4)Delete Exam");
		Scanner x = new Scanner(System.in);
		int choice = x.nextInt();
		ExamRepo exRepo = new ExamRepo();
		switch (choice) {
		case 1: {
			System.out.println("enter exam type date and id no");
			Exam ex = new Exam();
			ex.setType(x.next());
			ex.setDate(x.next());
			ex.setID_No(x.next());
			exRepo.createExam(ex);
			break;
		}
		case 2: {
			ArrayList<Exam> lst = exRepo.getAllExams();
			displayAllExams(lst);
			break;
		}
		case 3:{
			Exam ex =new Exam();
			System.out.println("enter pk of the exam you want to update");
			ex.setType(x.next());
			System.out.println("enter exam date and id no");
			ex.setDate(x.next());
			ex.setID_No(x.next());
			exRepo.updateExam(ex);
			break;
		}
		case 4: {
			String x1 = new String();
			System.out.println("enter the primary key of the student you want to delete");
			x1 = x.next();
			exRepo.deleteExam(x1);
			break;
		}
		}

	}

	private static void displayAllExams(ArrayList<Exam> lst) {
		System.out.println("type                Date                ID_no");
		for (Exam ex : lst) {

			System.out.println(ex.getType() + "                " + ex.getDate() + "                " + ex.getID_No());

		}

	}
}
