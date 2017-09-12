public class Main {

	public static void main(String[] args) 
{
Scanner s= new Scanner(System.io);	
System.out.println("Select an Operation/n1.Student Registration./n2.Get Student Id/n3.Set Student ID/n4.Get FullName/n5.Set FullName/n6.Get Date Of Birth/n7.Set Date Of Birth/n8.Get AverageMarks/n9.Set AverageMarks/n");
int choice=s.nextInt();
switch(choice)
{

case 1:System.out.println("Enter The Student ID");   
        int id=s.nextInt();
	System.out.println("Enter The Student FullName");
	String fname=s.next();
	System.out.println("Enter The Student Date Of Birth(MMMM d,YYYY)");
	String dobirth=s.next();
	Date dob=new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(dobirth);
	System.out.println("Enter The Student Average Marks");
	Double avgmarks=s.nextDouble();
	Student student=new Student(id,fname,dob,avgmarks);
	break;
case 2:	System.out.println(student.getId());
	break;

case 3:System.out.println("Enter the new id/n");
	int id2=s.nextInt();
	student.setId(id2);
	break;
case 4:	System.out.println(" "+student.getFullName());
	break;
case 5:System.out.println("Enter the Student FullName");
	String name=s.next();
	student.setFullName(name);
	break;
case 6:System.out.println(" "+student.getBirthDate());
	break;
case 7:System.out.println("Enter The Student Date Of Birth(MMMM d,YYYY)");
	String dobirth=s.next();
	Date dob=new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(dobirth);
	student.setBirthDate(dob);
        break;
case 8:System.out.println(""+student.getAvgMark());
       break;
case 9:System.out.println("Enter The Student Average Marks");
	Double avgMark=s.nextDouble();
	student.setAvgMark(avgMark);
	break;
}

}
