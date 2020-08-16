package org.Utils;

import org.POJO.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "StudentAction")
public class StudentAction {
	@Autowired
	private Student student;
	
	public void showStu() {
		this.student.show();
	} 
}
