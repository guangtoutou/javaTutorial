package com.javaTutorial.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.SAXWriter;
import org.dom4j.io.XMLWriter;

public class StudentDAO {

	public Student findStudent(long id) throws DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read("resources/com/javaTutorial/resources/students.xml");

		List element = document.selectNodes("//class/student[@rollno=" + id + "]");
		if (!element.isEmpty()) {
			String firstName = document.valueOf("//class/student[@rollno=393]/firstname");
			String lastName = document.valueOf("//class/student[@rollno=393]/lastname");
			String nickName = document.valueOf("//class/student[@rollno=393]/nickname");
			float marks = Float.parseFloat(document.valueOf("//class/student[@rollno=393]/marks"));

			Student student = new Student(id, firstName, lastName, nickName, marks);
			return student;
		} else {
			return null;
		}

	}

	public void addStudent(long id, String firstNames, String lastName, String nickNames, float marks) throws DocumentException, IOException {
		SAXReader reader = new SAXReader();

		Document document = reader.read("resources/com/javaTutorial/resources/students.xml");
		Element root = document.getRootElement();
		Element student = root.addElement("student").addAttribute("rollno", "101");
		student.addElement("firstname").setText("James");
		student.addElement("lastname").setText("Ni");
		student.addElement("nickname").setText("guangtoutou");
		student.addElement("marks").setText("100");
		// Element element =
		// element.setName("student");
		// document.
		FileOutputStream fos = new FileOutputStream("student.xml");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		OutputFormat of = new OutputFormat();
		of.setEncoding("UTF-8");
		of.setIndent(true);
		of.setIndent("    ");
		of.setNewlines(true);
		XMLWriter writer = new XMLWriter(osw, of);
		writer.write(document);
		writer.close();
	}

	public StudentDAO() {

	}
}
