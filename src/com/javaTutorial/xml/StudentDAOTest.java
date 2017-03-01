package com.javaTutorial.xml;

import java.io.IOException;

import org.dom4j.DocumentException;
import org.junit.Test;

public class StudentDAOTest {
	@Test
	public void testFindStudent() throws DocumentException {
		StudentDAO studentDAO = new StudentDAO();
		studentDAO.findStudent(393);
	}
	
	@Test
	public void testAddStudent() throws DocumentException, IOException{
		StudentDAO studentDAO = new StudentDAO();
		studentDAO.addStudent(101, "James", "Ni", "guangtoutou", 100);
	}
}
