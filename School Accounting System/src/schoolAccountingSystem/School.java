package schoolAccountingSystem;

import java.util.ArrayList;
import java.util.List;

/*
 * the school can have many teachers and many students
 * implements Teachers and Students using ArrayList
 */
public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private static double totalMoneyEarned;
	private static double totalMoneySpent;
	private static double balance;
	
	public School() {
		teachers=new ArrayList<Teacher>();
		students=new ArrayList<Student>();
		totalMoneyEarned=0;
		totalMoneySpent=0;
		balance=0;
	}
	
	/**
    *
    * @return the list of teachers in the school.
    */
   public List<Teacher> getTeachers() {
       return teachers;
   }

   /**
    * Adds a teacher to the school.
    * @param teacher the teacher to be added.
    */
   public void addTeacher(Teacher teacher) {
       teachers.add(teacher);
   }

   /**
    *
    * @return the list of students in the school.
    */
   public List<Student> getStudents() {
       return students;
   }

   /**
    * Adds a student to the school
    * @param student the student to be added.
    */
   public void addStudent(Student student) {
       students.add(student);
   }

   /**
    *
    * @return the total money earned by the school.
    */
   public double getTotalMoneyEarned() {
       return totalMoneyEarned;
   }
   
   /**
    * 
    * @return balance left in school
    */
   public double getBalance() {
       return balance;
   }
   
   /**
    * adds the total money earned by the school
    * @param moneyEarned
    */
   public static void updateTotalMoneyEarned(double moneyEarned) {
	   totalMoneyEarned+=moneyEarned;
	   balance+=moneyEarned;
   }
   
   public double getTotalMoneySpent() {
	   return totalMoneySpent;
   }
   
   /**
    * update the money that is spent by the school in giving salary to teachers
    * @param moneySpent
    */
   public static void updateTotalMoneySpent(double moneySpent) {
	   totalMoneySpent+=moneySpent;
	   balance-=moneySpent;
	   
   }
   
   @Override
   public String toString() {
       return "Total Earnings: $"+totalMoneyEarned+" Total Spent: $"+totalMoneySpent+" Balance: $"+balance;
   }
}
