package com.niit.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "assignments")
public class Assignment {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "studentCourseEnroll")
	private String studentCourseEnroll;

	@Column(name = "assignment")
	private  byte[]  assignment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentCourseEnroll() {
		return studentCourseEnroll;
	}

	public void setStudentCourseEnroll(String studentCourseEnroll) {
		this.studentCourseEnroll = studentCourseEnroll;
	}

	public byte[] getAssignment() {
		return assignment;
	}

	public void setAssignment(byte[] assignment) {
		this.assignment = assignment;
	}
}
