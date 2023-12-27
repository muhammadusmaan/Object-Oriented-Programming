import java.util.Scanner;

class Driver
{
	public static void main(String args[])
	{
			boolean y=true;
	AdressBook ad=new AdressBook();
	Student s = new Student();
	StudentOrganizer O=new StudentOrganizer();
	Scanner sp=new Scanner(System.in);
	do
		{
			
	
			            System.out.println("ENTER 1 TO ADD STUDENT CONTACT IN STUDENT CLASS: ");
                        System.out.println("ENTER 2 TO SEARCH CONTACT: ");
                        System.out.println("ENTER 3 TO DELETE CONTACT FROM STUDENT CLASS:");
                        System.out.println("ENTER 4 TO EDIT STUDENT CLASS: ");	
                        System.out.println("ENTER 5 TO EDIT THE ADRESS CLASS: ");
                        System.out.println("ENTER 6 TO PRINT THE RESULT OF ALL STUDENTS: ");
                        System.out.println("ENTER 7 TO UPDATE CONTACTS: ");						
			            System.out.println("ENTER 8 TO EXIT PROGRAM: ");
			
			int x = sp.nextInt();
			if (x == 1)
			{
				
				System.out.println("Enter first name:");
				String f = sp.next();
				System.out.println("Enter last name:");
				String g = sp.next();
				O.addStudent(new Student(f,g));
				ad.Print();
			}
			else if (x == 2)
			{
				System.out.println("Enter name:");
				if(O.search(sp.next()))
				{
					System.out.println("Found !!");
				}
				else
					System.out.println("Not Found!");
				//ad.updateContact();
			}
			
			else if (x == 3)
			{
				System.out.println("Enter first name:");
				String f = sp.next();
				System.out.println("Enter last name:");
				String g = sp.next();				
				s.deleteContact(f,g );
                //O.removeStudent(f,g); //To remove the student from contacts !
			}
			else if (x== 4)
			{
				System.out.println("Enter first name:");
				String f = sp.next();
				System.out.println("Enter last name:");
				String g = sp.next();
				O.editStudent(f, g);
			}
			else if (x==5)
			{
				System.out.println("Enter first name:");
				String f = sp.next();
				System.out.println("Enter last name:");
				String g = sp.next();
				O.editAdressBook(f, g);
			}
			
			else if (x ==6)
			{
						O.printAllStudentsResult();
			}
			else if (x ==7)
			{
						
				System.out.println("Enter first name:");
				String f = sp.next();
				System.out.println("Enter last name:");
				String g = sp.next();
				s.updateContact(f, g);
			}
			else if(x == 8)
				y=false;
			
		}
		while(y);
		System.out.println(" Thanks to Co-Operate ");	
		}
			
}