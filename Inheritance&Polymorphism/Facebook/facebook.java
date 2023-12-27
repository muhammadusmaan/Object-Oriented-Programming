import java.util.Scanner;
class facebook{
	public static void main(String[] args){
		NewsFeed nf = new NewsFeed();
		Scanner input = new Scanner(System.in);
		
		boolean bool = true;
		while(bool){
			bool = false;
			System.out.println("if you want to add post then press 1 ");
			System.out.println("if you want to show all posts then press 2 ");
			System.out.println("if you want to like any post then press 3");
			System.out.println("if you want to comment on any post then press 4");
			int i = input.nextInt();
			if(i == 1){
				System.out.println("if you want to add photo post then press 1 ");
				System.out.println("if you want to add message post then press 2 ");
				int o = input.nextInt();
				if(o == 1){
					input.nextLine();
					System.out.println("Enter the username of the author of this post.");
					String a = input.nextLine();
					System.out.println("Enter The filename of the image in this post.");
					String b = input.nextLine();
					System.out.println("Enter  A caption for the image.");
					String c = input.nextLine();
					nf.addPost(new PhotoPost(a, b, c));
				}
				else if(o == 2){
					System.out.println("Enter the username of the author of this post.");
					String a = input.nextLine();
					System.out.println("Enter The text of this post.");
					String b = input.nextLine();
					nf.addPost(new MessagePost(a, b));
				}
			}
			//show
			else if( i == 2){
				nf.show();
			}
			else if( i == 3){
				System.out.println();
				nf.show();
				System.out.println();
				System.out.println("Liking post....");
				System.out.println();
				System.out.println("enter the post number you want to like.");
				int aa = input.nextInt();
				nf.like(aa);
				System.out.println("Liked");
				System.out.println();
			}
			else if( i == 4){
				System.out.println();
				nf.show();
				System.out.println();
				System.out.println("commenting....");
				System.out.println();
				System.out.println("enter the post number on which you want to comment.");
				int aa = input.nextInt();
				input.nextLine();
				System.out.println("enter comment.");
				String aa1 = input.nextLine();
				nf.comment(aa, aa1);
				System.out.println("Comment. added");
				System.out.println();
			}else if( i == 5){
				System.out.println();
				nf.show();
				System.out.println();
				System.out.println("Unliking post....");
				System.out.println();
				System.out.println("enter the post number you want to unlike.");
				int aa = input.nextInt();
				nf.unlike(aa);
				System.out.println("unliked");
				System.out.println();
			}
			System.out.println("do you want to continue then press 1.");
			int cc = input.nextInt();
			if(cc == 1){
				bool = true;
			}
		}
	}
	
	
}