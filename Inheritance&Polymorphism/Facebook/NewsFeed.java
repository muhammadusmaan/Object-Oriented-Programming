import java.util.ArrayList;

/**
 * The NewsFeed class stores news posts for the news feed in a
 * social network application (like FaceBook or Google+).
 * 
 * Display of the posts is currently simulated by printing the
 * details to the terminal. (Later, this should display in a browser.)
 * 
 * This version does not save the data to disk, and it does not
 * provide any search or ordering functions.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.2
 */
public class NewsFeed
{
    private ArrayList<Post> posts;

    /**
     * Construct an empty news feed.
     */
    public NewsFeed()
    {
        posts = new ArrayList<Post>();
    }

    /**
     * Add a post to the news feed.
     * 
     * @param post  The post to be added.
     */
    public void addPost(Post post)
    {
        posts.add(post);
    }
	
	public void like(int n){
		n -= 1;
		if(n>=0 && n <posts.size()){
		posts.get(n).like();	
		}
	}
	
	public void unlike(int n){
		n -= 1;
		if(n>=0 && n <posts.size()){
		posts.get(n).unlike();	
		}
	}
	
	public void comment(int n, String a){
		n -= 1;
		if(n>=0 && n <posts.size()){
		posts.get(n).addComment(a);	
		}
	}

    /**
     * Show the news feed. Currently: print the news feed details
     * to the terminal. (To do: replace this later with display
     * in web browser.)
     */
    public void show()
    {
        // display all posts
		int a= 0;
        for(Post post : posts) { 
		
            System.out.println( "post no: " + ++a + ":\n");   // empty line between posts
			post.display();
        }
    }
}
