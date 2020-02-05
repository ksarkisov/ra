/*Katherine Sarkisov Period 6 2/4/20
 * Resident Assistant - college student responsible for all student in a dorm
 */
import java.util.*;

public class ResidentAssistant extends CollegeStudent{
	
	private CollegeStudent[] students = new CollegeStudent[0];
	private double stipend;
	
	
	//initialize the ra's info
	public ResidentAssistant(String name, String major, String dorm, double board) {
		super(name, major, dorm, board);
	}
	
	
	//add student to array students
	public void addStudent(CollegeStudent toAdd) {
		
		if(!toAdd.getDorm().equals(this.getDorm()))
			throw new IllegalArgumentException("Invalid Dorm");
		
		CollegeStudent[] temp = new CollegeStudent[students.length + 1];
		
		for(int i = 0; i < students.length; i ++) {
			temp[i] = students[i];
		}
		
		temp[students.length] = toAdd;
		students = temp;
	}
	
	
	public void moveOut(int id) {
		
		int loc = students.length;
		
		for(int i = 0; i < students.length; i ++) {
			if(students[i].getID() == id)
				loc = i;
		}
		
		if(loc == students.length)
			throw new NoSuchElementException("Student not found");
		else {
			
			CollegeStudent[] temp = new CollegeStudent[students.length - 1];
			int tempLoc = 0;
			
			for(int i = 0; i < students.length; i ++) {
				
				if(i != loc) {
					temp[tempLoc] = students[i];
					tempLoc ++;
				}
			}
			
			students = temp;
		}
	}
	
	
	public double getBoard() {
		
		double boardDiscount = 0;
		
		for(int i = 0; i < students.length; i ++) {
			
			boardDiscount += students[i].getBoard() * 0.05;
		}
		
		double board = super.getBoard() - boardDiscount;
		
		if(board < 0)
			return 0;
		
		return board;
	}
	
	
	public String toString() {
		String toReturn = "RA " + super.toString();
		
		for(int i = 0; i < students.length; i ++) {
			toReturn += "\n" + students[i].toString();
		}
		return toReturn;
	}
}
