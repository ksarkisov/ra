/*Katherine Sarkisov Period 6 2/4/20
 * CollegeStudent - maintains name, id, and major
 */

public class CollegeStudent {
	
	private String name;
	private int id;
	private String major;
	private String dorm;
	private double board;
	
	public CollegeStudent(String n, String m, String d, double b) {
		
		name = n;
		major = m;
		dorm = d;
		board = b;
	}
	
	
	public void yearPassed() {	
		board = board * 1.015;
	}
	
	
	public double getBoard() {
		return board;
	}
	
	public String getDorm() {
		return dorm;
	}
	
	public int getID() {
		return id;
	}
	
	public String toString() {
		
		String toReturn = "Name: " + name + "\nID: " + id + "\nMajor: " + major + "\nDorm: ";
		toReturn += "\nBoard: " + board;
		return toReturn;
	}
}
