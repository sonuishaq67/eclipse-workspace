package com.ishq.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.collegemodel.Branch;
import com.collegemodel.Exam;
import com.collegemodel.Student;
import com.ishaq.repo.BranchRepo;
import com.ishaq.repo.ExamRepo;
import com.ishaq.repo.StudentRepo;
import com.ishaq.service.BranchService;
import com.ishaq.service.ExamService;
import com.ishaq.service.StudentService;

public class CollegeMain {

	public static void main(String args[]) {

		showCollegeOptions();

	}

	private static void showCollegeOptions() {

		System.out.println(
				"ENTER A CHOICE Welcome to msrit college \n1) Student Information\n2) Branch Information\n3)Exam Information\n");
		Scanner x = new Scanner(System.in);

		int choice = x.nextInt();

		switch (choice) {
		case 1: {
			StudentService studentService = new StudentService();

			studentService.showStudentOptions();
			break;
		}
		case 2: {
			BranchService branchService = new BranchService();
			branchService.ShowBranchOptions();
			break;
		}
		case 3: {
			ExamService examService = new ExamService();
			examService.ShowExamOptions();
			break;
		}
		}

	}

	// TODO Auto-generated method stub

}
