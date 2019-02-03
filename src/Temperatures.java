import static java.lang.System.out;

public class Temperatures {
    public static int sum(int[] arr) {
        int sum = 0;

        for (int row = 0; row < arr.length; row++) {
            sum += arr[row];
        }
        int avg = sum / arr.length;
        out.println(avg);
        return sum;
    }

    private static int findOneColumnSum(int[][] arr, int col) {
        int total = 0;
        for (int row = 0; row < arr.length; row += 1) {
            total += arr[row][col];
        }
        out.println(total / arr.length);
        return total;
    }

    private static int findTotalAvg(int arr[][]) {
        int counter = 0;
        int total = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                total = total + arr[row][col];
                counter++;
            }
        }

        return total / counter;
    }

    public static void main(String[] args) {
        String[] weekDays = {"          ", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        String[] times = {"7:00 AM", "3:00 PM", "7:00 PM", "3:00 AM"};

        int[][] temps = new int[4][7];

        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;

        out.println("Temperature Calculator");

        out.println("The data provided are: \n");


        for (int col = 0; col < weekDays.length; col++) {
            out.print(weekDays[col] + "  ");
        }
        out.println();

        for (int i = 0; i < times.length; i++) {

            out.print(times[i]);
            for (int j = 0; j < weekDays.length - 1; j++) {
                out.printf("%5d", temps[i][j]);
            }
            out.println("");
        }
        out.println();

        out.println("Based on that data, the following are the average temperatures for the week. \n");

        for (int col = 1; col <= temps.length + 3; col++)

        {
            out.print(weekDays[col] + ":");
            findOneColumnSum(temps, (col - 1));
        }

        out.println();


        for (int row = 0; row < times.length; row++)

        {
            out.print(times[row] + ":");
            sum(temps[row]);
        }

        out.println();

        out.println("The final average temperature for the week was : \n");
        out.print("Overall: ");
        out.println(findTotalAvg(temps));
    }
}
