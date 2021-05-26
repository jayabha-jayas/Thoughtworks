import java.util.Scanner;

public class ComputeSalary {

    public static void main(String[] args) {
	    // declaring necessary variables
        Scanner scanner = new Scanner(System.in);
        int[] hoursWorkedInWeek = new int[7];
        int sumOfHours = 0, salary = 0, extraHours, extraSalary;

        // Iterating through each day of the week for salary calculation
        for (int thisDay = 0; thisDay < hoursWorkedInWeek.length; thisDay++) {

            //accepting 'number of hours worked' as input for this day of the week
            hoursWorkedInWeek[thisDay] = scanner.nextInt();

            //salary calculation for Sunday with 50% bonus
            if (thisDay == 0) {
                salary += hoursWorkedInWeek[thisDay] * 150;  //she gets 150 per day
            }

            //salary calculation for Saturday with 25% bonus
            else if (thisDay == 6) {
                salary += hoursWorkedInWeek[thisDay] * 125;  //she gets 125 per day
            }

            //salary calculation for the week days
            else {

                //calculating sum of working hours of the week days
                sumOfHours += hoursWorkedInWeek[thisDay];

                //if she worked more than 8 hours
                if (hoursWorkedInWeek[thisDay] > 8) {
                    extraHours = hoursWorkedInWeek[thisDay] - 8;
                    extraSalary = extraHours * 115; // she gets 115 for extra hours
                    salary += extraSalary + 800;
                }

                //if she worked less than 9 hours
                else if (hoursWorkedInWeek[thisDay] <= 8)
                    salary += hoursWorkedInWeek[thisDay] * 100; // she gets 100 rupees per hour

            }
        }

        //if she worked more than 40 hours during weekdays
        if (sumOfHours > 40) {

            extraHours = sumOfHours - 40;
            salary += extraHours * 25; // she gets extra 25 rupees per hour

        }

        System.out.println(salary);


    }
}
