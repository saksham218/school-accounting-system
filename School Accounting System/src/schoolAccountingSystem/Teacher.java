package schoolAccountingSystem;

public class Teacher extends Member{

	protected double salary;
	protected double salaryDrawn;
	protected double salaryDue;
	protected int level;
	
	
	/**
	 * 
	 * @param id teacher's id
	 * @param Name teacher's name
	 * @param salary teacher's salary
	 */
	public Teacher(String name, int id, int level) {
		super(name,id);
		this.level=level;
		salary=0;
		salaryDrawn=0;
		salaryDue=0;
		setSalary();
	}
	
	public void setSalary() {
		switch(level)
		{
		case 1: salary=100;
		break;
		case 2: salary=200;
		break;
		case 3: salary=300;
		break;
		case 4: salary=400;
		break;
		case 5: salary=500;
		break;
		case 6: salary=600;
		break;
		case 7: salary=700;
		break;
		case 8: salary=800;
		break;
		case 9: salary=900;
		break;
		case 10: salary=1000;
		break;
		case 11: salary=1100;
		break;
		case 12: salary=1200;
		break;
		
		}
		salaryDue+=salary;
	}
/**
 * Used to update the student's grade
 * @param grade new grade of the student
 */
	public void setGrade(int level) {
		this.level=level;
		setSalary();
	}
		
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	/**
	 * teacher draws salary
	 * this amount is removed from school's earnings
	 * @param salary 
	 */
	public void drawSalary(double draw) {
		if(salaryDue==0) {
			System.out.println("No more salary left to draw!");
			return;
		}
		salaryDrawn+=draw;
		salaryDue-=draw;
		School.updateTotalMoneySpent(draw);
	}
	
	@Override
    public String toString() {
        return "Name: " + name+ " Id: "+id
                +" Total salary drawn: $"
                + salaryDrawn+" Salary Due: $"+salaryDue;
    }
	
}
