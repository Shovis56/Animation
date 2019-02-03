package movie_list;

public class MovieLister {

    private static float average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (float) sum / numbers.length;
    }

    public static void main(String[] args) {

        // int [] ratings = {5,4,4,4,4,3,3,3,3,3,2};
        //  int [] ratings = {5,5,5,5,5,4,4,3,2};
        int[] ratings = {5, 4, 4, 4, 4, 3, 3, 3, 3, 3, 2};
        System.out.println(average(ratings));
        /*
        System.out.println("1. Here are five of our favorite movies!");
        String movie1=("Bringing Up Baby ");
        float rating1=4;
        System.out.print(movie1);
        System.out.println(rating1);
        String movie2=("Zoolander ");
        float rating2=(float)3.5;
        System.out.print(movie2);
        System.out.println(rating2);
        String movie3 =("The Princess Bride ");
        float rating3 = (float)4.5;
        System.out.print(movie3);
        System.out.println(rating3);
        String movie4=("Star Wars ");
        float rating4 = 4.2f;  //could also do it this way
        System.out.print(movie4);
        System.out.println(rating4);
        String movie5=("Hackers ");
        float rating5= 4;
        System.out.print(movie5);
        System.out.println(rating5);
        //DONE: print the names of five movies.
        */


//        System.out.println("1. Here are five of our favorite movies!");
//        String[] movieNames = {"Bringing Up Baby ","Zoolander ","The Princess Bride ","Star Wars ","Hackers "};
//        float[] movieRatings = {4,3.5f,4.5f,4.2f,4};
//        System.out.print(movieNames[0]);
//        System.out.println(movieRatings[0]);
//        System.out.print(movieNames[1]);
//        System.out.println(movieRatings[1]);
//        System.out.print(movieNames[2]);
//        System.out.println(movieRatings[2]);
//        System.out.print(movieNames[3]);
//        System.out.println(movieRatings[3]);
//        System.out.print(movieNames[4]);
//        System.out.println(movieRatings[4]);

//        System.out.print(movie1);
//        System.out.println(rating1);
//        System.out.print(movie2);
//        System.out.println(rating2);
//        System.out.print(movie3);
//        System.out.println(rating3);
//        System.out.print(movie4);
//        System.out.println(rating4);
//        System.out.print(movie5);
//        System.out.println(rating5);


        //Done: Now, print the rating of those movies, along with their name
        //What kind of data type is good for these? Why?

        //Done: Now, let's store them in variables.

        //SKIP: let's add five more movies!


        //TODO: Now, print the names and ratings of the movies that have a 4.5 or more stars.
//
//        //Do this without using classes
//        System.out.println("1. Here are five of our favorite movies!");
//        String[] movieNames = {"Bringing Up Baby ","Zoolander ","The Princess Bride ","Star Wars ","Hackers "};
//        float[] movieRatings = {4,3.5f,4.5f,4.2f,4};
//
//        for(int row = 0; row < movieNames.length; row++){
//            float currentRating = movieRatings[row];
//            if(currentRating >= 4.5)
//            System.out.println(movieNames[row] + currentRating);
//        }
//


        //TODO: Now let's do it using classes!

        Movie movie1 = new Movie("Bringing Up Baby", 4);
        Movie movie2 = new Movie("Zoolander ", 3.5f);
        Movie movie3 = new Movie("The Princess Bride ", 4.5f);
        Movie movie4 = new Movie("Star Wars ", 4.2f);
        Movie movie5 = new Movie("Hackers ", 4);


        //Do this without using classes
        System.out.println("1. Here are five of our favorite movies!");
        String[] movieNames = {"Bringing Up Baby ", "Zoolander ", "The Princess Bride ", "Star Wars ", "Hackers "};
        float[] movieRatings = {4, 3.5f, 4.5f, 4.6f, 4};

        for (int row = 0; row < movieNames.length; row++) {
            float currentRating = movieRatings[row];
            if (currentRating >= 4.5)
                System.out.println(movieNames[row] + currentRating);
        }


        Movie movie6 = movie4;
        movie6 = new Movie("Black Panther", 4.6f);
        System.out.println("Goodbye");
    }
    }
