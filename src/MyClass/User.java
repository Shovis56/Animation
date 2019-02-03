package MyClass;

public class User {


    //users
    private String fullName;
    public String userName;
    public String webAddress;
    private String emailAddress;



    //constructor
    public User(String fullName1, String userName1, String webAddress1, String emailAddress1) {

        this.fullName = fullName1;
        this.userName = userName1;
        this.webAddress = webAddress1;
        this.emailAddress = emailAddress1;
    }

    public String getDetails() {
            return ("Full name: "+fullName+"\n" +"User name: "+userName+"\n"+ "Web Address: "+webAddress +"\n"+ "Email Address: "+emailAddress+"\n");
        }

    }


