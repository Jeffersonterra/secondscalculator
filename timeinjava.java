import java.util.Scanner;

public class timeinjava {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        int minutes, hours;
        System.out.println(" Tell the system how many seconds would you like to covert into hours");

        int seconds = leitor.nextInt();
        minutes = seconds / 60;
        int secondsprint = (int) (seconds % 60);
        if (minutes > 60) {
            hours = minutes / 60;
            minutes = minutes % 60;

            if (hours > 24) {

                int days = hours / 24;
                hours = hours % 24;
                System.out.printf(
                        seconds + " seconds is equal to " + days + " days and " + hours + " hours and " + minutes
                                + " minutes and " + secondsprint);
            } else {

                System.out.println(
                        seconds + " seconds is equal to " + hours + " hours and " + minutes + " minutes and "
                                + secondsprint + "seconds");
            }

            leitor.close();
        } else {
            System.out.println(
                    seconds + " seconds is equal to " + minutes + " minutes and "
                            + secondsprint + " seconds");
        }
    }
}
