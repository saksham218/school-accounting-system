package schoolAccountingSystem;

public class Student extends Member{

	protected int grade;
	protected double feesPaid;
	protected double feesTotal;
	protected double dues;
	
	/**
	 * 
	 * @param id initializing id
	 * @param name initializing name
	 * @param grade initializing grade
	 */
	public Student(String name, int id, int grade) {
		super(name,id);
		this.grade=grade;
		feesPaid=0;
		feesTotal=0;
		dues=0;
		setFees();
	}
	//Not going to alter name and id
	
	public void setFees() {
		switch(grade)
		{
		case 1: feesTotal=100;
		break;
		case 2: feesTotal=200;
		break;
		case 3: feesTotal=300;
		break;
		case 4: feesTotal=400;
		break;
		case 5: feesTotal=500;
		break;
		case 6: feesTotal=600;
		break;
		case 7: feesTotal=700;
		break;
		case 8: feesTotal=800;
		break;
		case 9: feesTotal=900;
		break;
		case 10: feesTotal=1000;
		break;
		case 11: feesTotal=1100;
		break;
		case 12: feesTotal=1200;
		break;
		
		}
		
		dues+=feesTotal;
	}
	
	
/**
 * Used to update the student's grade
 * @param grade new grade of the student
 */
	public void setGrade(int grade) {
		this.grade=grade;
		setFees();
	}
	
	/**
	 * Add the fees to feesPaid field
	 * the school is going to receive the funds.
	 * @param fees the fees that the student paid
	 */
	public void payFees(double fees) {
		if(dues==0)
		{
			System.out.println("No more dues left to be paid!");
			return;
		}
		feesPaid+=fees;
		dues-=fees;
		
		School.updateTotalMoneyEarned(fees);
	}
	
	/**
    *
    * @return id of the student.
    */
   public int getId() {
       return id;
   }

   /**
    *
    * @return name of the student.
    */
   public String getName() {
       return name;
   }

   /**
    *
    * @return the grade of the student.
    */
   public int getGrade() {
       return grade;
   }

   /**
    *
    * @return fees paid by the student.
    */
   public double getFeesPaid() {
       return feesPaid;
   }

   /**
    *
    * @return the total fees of the student.
    */
   public double getFeesTotal() {
       return feesTotal;
   }

   /**
    *
    * @return the remaining fees.
    */
   public double getDues(){
       return dues;
   }
	
   @Override
   public String toString() {
       return "Student's name :"+name+" Id :"+id+
               " Total fees paid : $"+ feesPaid+" Fees Due : $"+dues;
   }
	
}
