/*Katherine Sarkisov Period 6 2/5/20
 * HeadRA - subclass of RA
 */

public class HeadRA extends ResidentAssistant{
	
	private int bonus;
	
	public HeadRA(String name, String major, String dorm, double board, int stipendBonus) {
		super(name, major, dorm, board);
		bonus = stipendBonus;
	}
	
	public double getBoard() {//finish
		
		ResidentAssistant headra = this;
		double stipend = headra.getBoard() + bonus;
		return super.getBoard() - stipend;
	}
}
