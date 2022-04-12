package schoolAccountingSystem;
import java.util.Scanner;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		School s=new School();
		while(true) {
			System.out.println("1: Add Teacher");
			System.out.println("2: Add Student");
			System.out.println("3: Draw Salary");
			System.out.println("4: Pay Fees");
			System.out.println("5: See all Teachers");
			System.out.println("6: See all Students");
			System.out.println("7: See Teacher profile");
			System.out.println("8: See Student profile");
			System.out.println("9: See School Account");
			int i=sc.nextInt();
			
			switch(i) {
			case 1:
			{
			sc.nextLine();
			System.out.println("Enter name");
			String name=sc.nextLine();
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter level");
			int level=sc.nextInt();
			Teacher obj=new Teacher(name,id,level);
			s.addTeacher(obj);
			}
			break;
		
			case 2:
			{
			sc.nextLine();
			System.out.println("Enter name");
			String name=sc.nextLine();
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter grade");
			int grade=sc.nextInt();
			Student o=new Student(name,id,grade);
			s.addStudent(o);
			}
			break;
			
			case 3:
			{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter salary to be drawn");
			double salary=sc.nextDouble();
			List<Teacher> T=s.getTeachers();
			for(Teacher t:T) {
				if(t.id==id) {
					t.drawSalary(salary);
					break;
				}
			}
			}
			break;
			
			case 4:
			{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter fees to be paid");
			double fees=sc.nextDouble();
			List<Student> S=s.getStudents();
			for(Student st:S) {
				if(st.id==id) {
					st.payFees(fees);
					break;
				}
			}
			}
			break;
			
			case 5:
			{
				List<Teacher> T=s.getTeachers();
				for(Teacher t:T) {
					System.out.println(t.name+" "+t.id);
					}
				
			System.out.println();
			}
			break;
			
			case 6:
			{
			List<Student> S=s.getStudents();
			for(Student st:S) {
				System.out.println(st.name+" "+st.id);
				}
			System.out.println();
			}
			break;
			
			case 7:
			{
				System.out.println("Enter id");
				int id=sc.nextInt();
				List<Teacher> T=s.getTeachers();
				for(Teacher t:T) {
					if(t.id==id) {
						System.out.println(t.toString());
						break;
					}
				}
				
			}
			break;
			
			case 8:
			{
				System.out.println("Enter id");
				int id=sc.nextInt();
				List<Student> S=s.getStudents();
				for(Student st:S) {
					if(st.id==id) {
						System.out.println(st.toString());
						break;
					}
				}
				
			}
			break;
			
			case 9:
			{
				System.out.println(s.toString());
			}
			break;
			default: System.out.println("Invalid Input");
			}
			System.out.println("Press Y to continue");
			char c=sc.next().charAt(0);
			if(c!='Y')
				break;
		}
	}

}
