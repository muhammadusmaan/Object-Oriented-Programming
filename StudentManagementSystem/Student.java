import java.util.*;
class Student{
String sname;
String fname;
int age;
String address;
ArrayList<AdressBook> contacts = new ArrayList<>();

String first_name;
String last_name;
String father_name;
String Address;
int chem_marks,phy_marks,bio_marks,math_marks,eng_marks;
int Total=500;
float percentage;
char grade;

/** constructor that recieves class object as parameter 
    and initialize other object.*/

    Student(){
	 this.first_name=null;
	 this.last_name=null;
	 this.father_name=null;
	 this.address=null;
	 this.chem_marks=0;
	 this.phy_marks=0;
	 this.bio_marks=0;
	 this.math_marks=0;
	 this.eng_marks=0;
	 this.percentage=0;
	 this.grade='0';
}
	 
public Student(Student sm)
	{
	 this.first_name=sm.first_name;
	 this.last_name=sm.last_name;
	 this.father_name=sm.father_name;
	 this.address=sm.address;
	 this.chem_marks=sm.chem_marks;
	 this.phy_marks=sm.phy_marks;
	 this.bio_marks=sm.bio_marks;
	 this.math_marks=sm.math_marks;
	 this.eng_marks=sm.eng_marks;
	 this.percentage=sm.percentage;
	 this.grade=sm.grade; 
}

     // public methods to set all fiels 
public Student(String A, String B)
	{
		first_name = A;
		last_name = B;
	}
public void setFirst_Name(String a)               
{
	first_name=a;
}
public void setLast_Name(String b)
{
	last_name=b;
}
public void setFather_Name(String c)
{
	father_name=c;
}
public void setAddress(String d)
{
	Address=d;
}
public void setChem_Marks(int e)
{
	chem_marks=e;
}
public void setPhy_Marks(int f)
{
	phy_marks=f;
}
public void setBio_Marks(int g)
{
	bio_marks=g;
}
public void setMath_Marks(int h)
{
	
	math_marks=h;
}
public void setEng_Marks(int i)
{
	eng_marks=i;
}
public float obtained_marks(){
	int add=getChem_Marks()+getPhy_Marks()+getBio_Marks()+getMath_Marks()+getEng_Marks();
	return add;
}
public void calculatePercentage(){
	//int obtained_marks=getChem_Marks()+getPhy_Marks()+getBio_Marks()+getMath_Marks()+getEng_Marks();
	int Total=500;
	percentage=obtained_marks()/Total*100;
}
 public void calculateGrade(){
	
	if(percentage>=85)
		grade='A';
	if(percentage>=75 && percentage<85) 
		grade='B';
	if(percentage>=60 && percentage<75)
		grade='C';
	if(percentage>=50 && percentage<65)
		grade='D';
	
	if(percentage<50)
		grade='F';
	
}

//private methods to get students marks for indvidual subjects

public String getFirst_Name(){
	return first_name;
}
public String getLast_Name(){
	return last_name;
}
public String getFather_Name(){
	return father_name;
}
public int getChem_Marks(){
	return chem_marks;
}
public int getPhy_Marks()
{
	return phy_marks;
}
public int getBio_Marks(){
	return bio_marks;
}
public int getMath_Marks(){
	return math_marks;
}
public int getEng_Marks(){
	return eng_marks;
}
public String getName(){
	return getFirst_Name()+getLast_Name();
}

public void PrintResult()
{

	System.out.println("########RESULT CARD########");
	System.out.println("Student Name:" +"      " +getFirst_Name() +" " +getLast_Name() );
	System.out.println("Father Name:"  +"      " +getFather_Name() );
	System.out.println("###########################");
	System.out.println("Chemistry:" +"      " +getChem_Marks() );
	System.out.println("Physics:" +"        " +getPhy_Marks() );
	System.out.println("Biology:" +"        " +getBio_Marks());
	System.out.println("maths:" +"          " +getMath_Marks());
	System.out.println("English:" +"        " +getEng_Marks());
	System.out.println("--------------------");
	System.out.println("Total:" +"          " +Total);
	System.out.println("--------------------");
	calculatePercentage();
	System.out.println("Percentage:" +"     " +percentage +"%");
	calculateGrade();
	System.out.println("Grade:" +"          " +grade);
}
public void newcontact(AdressBook a)
	{
		contacts.add(a);
	}
public void printContact(String F, String L)
	{
		int c=0;
		for(AdressBook a : contacts)
		{
			if (a.getFirst_Name().equals(F) && a.getLast_Name().equals(L))
			{
				c=1;
				System.out.println("Name: " + a.getFirst_Name() + " " + a.getLast_Name());
				System.out.println("Organization: " + a.get_Organization());
				System.out.println("Mobile No.: " + a.getMobile_No());
				System.out.println("Email: " + a.get_Email());
			}
		}
		if (c==0)
			System.out.println("Not found!");
	}
	
	public void printContact(String F)
	{
		int c=0;
		for(AdressBook a : contacts)
		{
			if (a.getFirst_Name().equals(F))
			{
				c=1;
				System.out.println("Name: " + a.getFirst_Name() + " " + a.getLast_Name());
				System.out.println("Organization: " + a.get_Organization());
				System.out.println("Mobile No.: " + a.getMobile_No());
				System.out.println("Email: " + a.get_Email());
			}
		}
		if (c==0)
			System.out.println("Not found!");
	}
	
public void updateContact(String A, String B)
	{
		Scanner s =new Scanner(System.in);
		int c=0;
		AdressBook d = new AdressBook();
		for(AdressBook a : contacts)
		{
			c=1;
			d=a;
			printContact(A,B);
		}
		if(c==1)
		{
			System.out.println("Do you want to update?(yes or no)");
			String g = s.nextLine();
			if(g=="y" || g=="Y")
			{
				System.out.println("Enter First Name:");
				d.setFirst_Name(s.nextLine());
				System.out.println("Enter Last Name:");
				d.setLast_Name(s.nextLine());
				System.out.println("Enter Organization:");
				d.set_Organization(s.nextLine());
				System.out.println("Enter Mobile No.:");
				d.setMobile_No(s.nextLine());
				System.out.println("Enter Email:");
				d.set_Email(s.nextLine());
			}
		}
	}
	public void deleteContact(String A, String B)
	{
		Scanner s = new Scanner(System.in);
		Iterator <AdressBook> it = contacts.iterator();
		int k=0;
		while(it.hasNext())
		{
			it.next();
			if (it.next().getFirst_Name().equals(A) && it.next().getLast_Name().equals(B))
			{
				k=1;
				System.out.println("Are you sure you want to delete? yes or no ??");
				String x = s.nextLine();
				if (x.equals("yes") || x.equals("YES"))
				{
					it.remove();
				}
			}
			if(k==0)
			System.out.println(" CONTACT DELETED !");
		}
	}	
}