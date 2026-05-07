import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
                Files.newBufferedWriter(
                        Paths.get("D:\\JAVA Refresher\\Java Date and Time\\Output.txt"));

        String[] firstMultipleInput =
                bufferedReader.readLine().trim().split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static String findDay(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();

        // Month is 0-based
        calendar.set(year, month - 1, day);

        return WeekDayName.values()[
                calendar.get(Calendar.DAY_OF_WEEK) - 1
        ].toString().toUpperCase();
    }
}

enum WeekDayName {
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday
}