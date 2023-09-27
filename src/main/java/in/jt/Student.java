package in.jt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int sid = 101;
	private String sname = "ramchandra";
	
	
	/*
	 * @Autowired private Address address; //null
	 */
	
	public Student() {
		System.out.println("Student :: Zero :: Constructor");
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	
	
}
