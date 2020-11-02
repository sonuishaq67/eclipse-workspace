package com.ishaq.repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.collegemodel.Branch;
import com.ishaq.utility.DatabaseConnectionUtility;

public class BranchRepo {
	public ArrayList<Branch> getAllBranch() {
		ArrayList<Branch> list = new ArrayList();
		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "Select * from Branches";
			System.out.println(sql);

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Branch br = new Branch();
				br.setCourse(rs.getString("Course"));
				br.setCourse_Id(rs.getString("Course_Id"));
				list.add(br);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;

	}

	public void insertBranch(Branch brc) {
		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "INSERT INTO Branches (Course,Course_Id) " + "VALUES ('" + brc.getCourse() + "','"
					+ brc.getCourse_Id() + "')";
			System.out.println(sql);

			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("insert student implemented......." + brc.getCourse() + "\n" + brc.getCourse_Id());
	}

	public void deleteBranch(String string) {
		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "Delete From Branches where Course_Id ='" + string + "';";
			System.out.println(sql);

			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		System.out.println("deleted exam");
	}

	public void updateBranch(Branch brc) {
		Connection conn = DatabaseConnectionUtility.getDBconnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql = "Update Branches set Course='" + brc.getCourse() + "' where Course_Id='" + brc.getCourse_Id()+ "'";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
