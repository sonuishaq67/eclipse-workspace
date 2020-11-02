package com.ishaq.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.collegemodel.Branch;
import com.collegemodel.Student;
import com.ishaq.repo.BranchRepo;

public class BranchService {
	public  void ShowBranchOptions() {
		System.out.println("ENTER A CHOICE  \n1)INSERT Branch DETAILS\n2)GET BRANCH DETAILS\n3)Update Branch\n4)Delete Branch");
		Scanner x = new Scanner(System.in);

		int choice = x.nextInt();
		BranchRepo brcRepo = new BranchRepo();
		switch (choice) {
		case 1: {
			Branch brc = new Branch();
			System.out.println("enter course and course id");
			brc.setCourse(x.next());
			brc.setCourse_Id(x.next());
			brcRepo.insertBranch(brc);

			break;
		}
		case 2: {
			ArrayList<Branch> lst = brcRepo.getAllBranch();
			displayAllBranch(lst);
			break;
		}
		case 3:{
			Branch brc= new Branch();
			System.out.println("enter the primary key of the branch you want to update");
			brc.setCourse_Id(x.next());
			System.out.println("enter the course name you want to update");
			brc.setCourse(x.next());
			brcRepo.updateBranch(brc);
			break;
		}
		case 4:{
			String x1= new String();
			System.out.println("enter the primary key of the student you want to delete");
			x1=x.next();
			brcRepo.deleteBranch(x1);
			break;
		}	

		}

	}

	private static void displayAllBranch(ArrayList<Branch> lst) {
		System.out.println("Course                Course_Id");
		for (Branch br : lst) {

			System.out.println(br.getCourse() + "                " + br.getCourse_Id());

		}
		
	}

}
