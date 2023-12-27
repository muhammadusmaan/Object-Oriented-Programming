import java.util.*;
class StudentOrganizer{
	private ArrayList<Student> bscs = new ArrayList<>();
	private HashSet<String> common = new HashSet<>();
	Scanner sc = new Scanner(System.in);
	
public void addStudent( Student a ){
		bscs.add(a);
	}
	
public void removeStudent ( String A , String B  ){
		
		Iterator<Student> rt = bscs.iterator();
		while(rt.hasNext())
		{
			if (rt.next().getFirst_Name().equals(A)&& rt.next().getLast_Name().equals(B));
			{
				rt.remove();
				return;
			}
		}
	}
public int studentCount (){
		return bscs.size();
	}
public void printAllStudentsResult (){

	for(Student s:bscs){
    s.PrintResult();
}
}
public void printNames(String n){
		for(Student s:bscs){
			
		if(s.getName().equals(n))
			s.PrintResult();
		}
	}
public void getName(){
	for(Student s:bscs){
		String a;
		a=s.getName();
		System.out.println(a);
	}
}
public void findStudent(Student s){
		for(Student a:bscs){
			if( a.getFirst_Name().equals(s)){
				System.out.println("student is found");
		break;
			}
			else
				System.out.println("Student not found");
		}
		
	}
	public void editStudent(String A, String B)
	{
		for(Student c : bscs)
		{
			if (c.getFirst_Name().equals(A)&&c.getLast_Name().equals(B))
			{
				System.out.println("Enter Chem Marks:");
				c.setChem_Marks(sc.nextInt());
				System.out.println("Enter Eng Marks:");
				c.setEng_Marks(sc.nextInt());
				System.out.println("Enter Phy Marks:");
				c.setPhy_Marks(sc.nextInt());
				System.out.println("Enter Bio Marks:");
				c.setBio_Marks(sc.nextInt());
				System.out.println("Enter Math Marks:");
				c.setMath_Marks(sc.nextInt());
			}
		}
	}
	
	//To search the contact 
	
	public boolean search(String sk)
	{
		for(Student z: bscs)
		{
			if (z.getFirst_Name() .equals(sk))
			{
				return true;
			}
		}
		return false;
	}
public void printDuplicate (){
	for(Student a:bscs){
			for(Student b:bscs){
			if( a.getFirst_Name().equals(b.getFirst_Name())){
				if(a != b)
				System.out.println(a.getName()+"Duplicate name found");
			}	
			}
		}
	}
public void printAverageSubject(String sub){
		float sum=0;
		if(sub.equals("physics")){
			for(Student s:bscs){
				sum += s.getPhy_Marks();
			}
		} else if(sub.equals("chemistry")){
			for(Student s:bscs){
				sum += s.getChem_Marks();
			}
		} else if(sub.equals("biology")){
			for(Student s:bscs){
				sum += s.getBio_Marks();
			}
		}else if(sub.equals("math")){
			for(Student s:bscs){
				sum += s.getMath_Marks();
			}
		}else if(sub.equals("english")){
			for(Student s:bscs){
				sum += s.getEng_Marks();
			}
		}
		
		float avg =sum/studentCount();
		System.out.println(avg);
	}
public void printOverallAverage(){
		float sum=0;
		for(Student s:bscs){
			sum += s.obtained_marks();
		}
		float avg =sum/studentCount();
		System.out.println(avg);
	}
	
	public void editAdressBook(String A, String B)
	{
		int c=0;
		Student obj = new Student();
		for(Student a : bscs)
		{
			if (a.getFirst_Name().equals(A)&&a.getLast_Name().equals(B))
			
			{
				c=1;
				obj=a;
			}
		}
		if (c==1)
		{
			
			System.out.println("Enter 1 to Add new contact");
			System.out.println("Enter 2 to Find Contact");
			System.out.println("Enter 3 to Edit Contact");
			System.out.println("Enter 4 to Delete contact");
			int e = sc.nextInt();
			if(e==1)
			{
				System.out.println("New Contact\n");
				System.out.println("Enter First Name:");
				String f = sc.next();
				System.out.println("Enter Last Name:");
				String g = sc.next();
				System.out.println("Enter Organization:");
				String h = sc.next();
				System.out.println("Enter Mobile No.:");
				String i = sc.next();
				System.out.println("Enter Email Address");
				String j = sc.next();
				obj.newcontact(new AdressBook(f,g,h,i,j));	
			}
			
			else if(e==2)
			{
				System.out.println("Enter 1 is by using Full Name ");
				System.out.println("Enter 2 is by using First Name only");
				int s = sc.nextInt();
				if (s==1)
				{
					System.out.println("Enter First Name:");
					String f = sc.next();
					System.out.println("Enter Last Name:");
					String g = sc.next();
					obj.printContact(f,g);
				}
				else if (s==2)
				{
					System.out.println("Enter First Name:");
					String f = sc.next();
					obj.printContact(f);
				}
			}
			else if(e==3)
			{
				System.out.println("Enter First Name:");
				String f = sc.next();
				System.out.println("Enter Last Name:");
				String g = sc.next();
				obj.updateContact(f, g);
			}
			else if(e==4)
			{
				System.out.println("Enter First Name:");
				String f = sc.next();
				System.out.println("Enter Last Name:");
				String g = sc.next();
				obj.deleteContact(f, g);
			}
		}
		else
			System.out.println("Not Found!");
	}
	
	
}