package MyClass;

public class Main {

    public static void main(String[] args) {

        User[] user = new User[3];
        user [0] = new User("Harry Potter",  "HPotter", "www.HP.com", "Gryffindor@hogwarts.com");
        user [1]= new User("Hermoine Granger","HGranger","www.HP.com","Smartwizard@hogwarts.com");
        user [2]= new User("Georgia Clooney","GClooney","www.actress.com","GClooney@hotmail.com");


        Post[] post = new Post[5];
        post[0] = new Post(user[0].userName,": Hey!"+"\n");
        post[1] = new Post(user[1].userName,": Whats up?"+"\n");
        post[2] = new Post(user[2].userName,": Not a lot!"+"\n");
        post[3] = new Post(user[0].userName,": Just doing magic!"+ "\n");
        post[4] = new Post(user[1].userName,": You guys are awesome!"+"\n");



        for (int i = 0; i < post.length; i++) {

                System.out.println(post[i].getPost());
            }


        for(int i = 0; i < user.length; i++){

            System.out.println(user[i].getDetails());
        }
    }

}