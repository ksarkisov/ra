/*Katherine Sarkisov Period 6 2/4/20
 * Client Class - test out ra, collegeStudent, and hra classes
 */

public class Client {

	public static void main(String[] args) {
		
		CollegeStudent one = new CollegeStudent("ed", "science", "peacock", 100);
		CollegeStudent two = new CollegeStudent("lily", "cs", "peacock", 200);
		CollegeStudent three = new CollegeStudent("essie", "math", "butterfly", 120);
		ResidentAssistant four = new ResidentAssistant("katie", "english", "peacock", 100);
		four.addStudent(one);
		four.addStudent(two);
		System.out.println(four.getBoard());
	}
}
