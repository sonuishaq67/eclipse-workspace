package com.ishaq.repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.collegemodel.Student;
import com.ishaq.utility.DatabaseConnectionUtility;

public class StudentRepo {
	public ArrayList<Student> getAllStudents() {
		ArrayList<Student> list = new ArrayList();
		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "Select Branch,ID_NO,Section,Roll_no,Name from Student";
			System.out.println(sql);

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Student st = new Student();
				st.setName(rs.getString("Branch"));
				st.setID_NO(rs.getString("ID_NO"));
				st.setSection(rs.getString("Section"));
				st.setRoll_no(rs.getInt("Roll_no"));
				st.setName(rs.getString("Name"));
				list.add(st);
			}

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
		return list;

	}

	public void updateStudent(Student std) {

		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "update Student set Branch='" + std.getBranch() + "',Name='" + std.getName() + "',Section='"
					+ std.getSection() + "',Roll_no='" + std.getRoll_no() + "' where ID_NO='" + std.getID_NO() + "'";
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

		System.out.println("insert student implemented......." + std.getName() + std.getBranch() + std.getID_NO()
				+ std.getSection() + std.getRoll_no());
	}

	public void insertStudent(Student std) {

		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "INSERT INTO Student (Branch,ID_NO,Section,Roll_no,Name) " + "VALUES ('" + std.getBranch()
					+ "','" + std.getID_NO() + "','" + std.getSection() + "'," + std.getRoll_no() + ",'" + std.getName()
					+ "')";
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

		System.out.println("insert student implemented......." + std.getName() + std.getBranch() + std.getID_NO()
				+ std.getSection() + std.getRoll_no());
	}

	public void deleteStudent(String string) {
		Connection conn = DatabaseConnectionUtility.getDBconnection();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "Delete From Student where ID_NO ='" + string + "';";
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

		System.out.println("delete student implemented");
	}
}
