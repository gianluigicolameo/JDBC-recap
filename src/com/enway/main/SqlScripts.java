package com.enway.main;

public class SqlScripts {
	static final String sqlInsertStudent = "insert into student(first_name, last_name, age) values (?, ?, ?)";
	static final String sqlUpdateStudent = "update student set first_name=?, last_name=?, age=? where id=?";
	static final String sqlDeleteStudent = "delete from student where id=?";
	static final String sqlReadStudent   = "select * from student";
	static final String sqlInsertAcademy = "insert into academy(academy_code, subject, number_of_students) values (?, ?, ?)";
	static final String sqlUpdateAcademy = "update academy set academy_code=?, subject=?, number_of_students=? where id=?";
	static final String sqlDeleteAcademy = "delete from academy where id=?";
	static final String sqlReadAcademy   = "select * from academy";
	
}
