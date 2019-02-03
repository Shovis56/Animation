package MyClass;

public class Post {

    private int orderofPosts;
    public String Post;
    public String userName;

    static int counter =1;

    public Post(String userName, String getContents ){

        this.Post = getContents;
        this.userName = userName;
        this.orderofPosts = counter;

        counter++;


    }

    public String getPost()
    {
        return orderofPosts+"\n"+ userName + Post;
    }

}
