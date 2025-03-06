import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {


//        System.out.println("- Did Joffrey agree?\n- He did. He also said \"I'm using this \\n\".");
//
//        char a = '0';
//        System.out.println(a);
//        System.out.println();
//
//        double b = (int) 17.54;
//        System.out.println(b);
//        System.out.println();
//
//        String firstResult = String.format("%.3f",7.0004);
//        String secondResult = String.format("%.3f",7.0005);
//        String thirdResult = String.format("%.3f",7.0006);
//        System.out.println(firstResult + " " + secondResult + " " + thirdResult);
//        System.out.println();
//
//        System.out.println("alala");
//        System.out.println();

//        String text = "Never forget what you are, for surely the world will not";
//        String firstNLastLetter = "First: " + text.charAt(0) + "\n" + "Last: " + text.charAt(text.length() - 1);
//        System.out.println(firstNLastLetter);
//        System.out.println(text.charAt(text.length() - 1));
//        System.out.println();

//        String name = "heXlEt";
//        String capitalize = name.substring(0, 1).toUpperCase()
//                + name.substring(1, name.length()).toLowerCase();
//        System.out.println(capitalize);

        LocalDate dateFrom = LocalDate.of(2017, Month.MAY, 24);
        LocalDate dateTo = LocalDate.of(2017, Month.JULY, 29);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);
    }


}
