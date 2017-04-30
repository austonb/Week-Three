import java.text.SimpleDateFormat;
import java.util.Date;

public class Time Conversion Part1 {
   public static void main(String [] args) throws Exception {
       SimpleDateFormat displayFormat = new SimpleDateFormat("hh:mm");
       SimpleDateFormat parseFormat = new SimpleDateFormat("HH:mm a");
       Date date = parseFormat.parse("18:16 PM");
       System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date));
   }
}