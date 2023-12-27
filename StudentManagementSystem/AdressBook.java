import java.util.*;
class AdressBook
{
	
	String FirstName,LastName,Organization,Email;
  String MobileNo;
      ArrayList<String> contact=new ArrayList<>();
      AdressBook(String a,String b,String c){
	
}
AdressBook(){
	
}
public AdressBook(String FirstName, String LastName, String Organization, String MobileNo, String Email)
	{
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Organization = Organization;
		this.Email = Email;
		this.MobileNo = MobileNo;
	}
public void setFirst_Name(String a){
	FirstName=a;
}
public void setLast_Name(String b){
	LastName=b;
}
public void set_Organization(String c){
	Organization=c;
}
public void set_Email(String d){
	Email=d;
}
public void setMobile_No(String e){
	MobileNo=e;
}
public String getFirst_Name(){
	return FirstName;
}
public String getLast_Name(){
	return LastName;
}
public String get_Organization(){
	return Organization;
}
public String get_Email(){
	return Email;
}
public String getMobile_No(){
	return MobileNo;
}
public void printContact(){
   
	//if((a.equals(getFirst_Name()))&& (b.equals(getLast_Name())));
	
	Print();
	
}
public void Print(){
	System.out.println("PLEASE ENTER THE COMPLETE CONTACT !!");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first name: \t ");
			String a=sc.nextLine();
			System.out.println("Enter Last name: \t");
			String b=sc.nextLine();
			System.out.println("Enter Organization:\t ");
			String c=sc.nextLine();
			System.out.println("Enter Email Address: \t");
			String d=sc.nextLine();
			System.out.println("Enter mobile no:\t ");
			String e=sc.nextLine();
			System.out.println("\n");
			
			System.out.println("HERE IS THE COMPLETE CONTACT !!!! ");
			System.out.println("\n");
			
			System.out.println("FIRST NAME IS: "   +a);
			System.out.println("LAST NAME IS: "     +b);
			System.out.println("ORGANIZATION IS: "  +c);
			System.out.println("EMAIL ADRESS IS: "  +d);
			System.out.println("MOBILE NO IS: "    +e);
	/*System.out.println("First name is : "+getFirst_Name());
	System.out.println("Last name is : "+getLast_Name());
	System.out.println("Organization is :"+get_Organization());
	System.out.println("Email adress is : "+get_Email());
	System.out.println("Mobile no. is : "+getMobile_No());*/
}
}