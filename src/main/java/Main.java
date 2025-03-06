import org.apache.commons.lang3.StringUtils;

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

//        LocalDate dateFrom = LocalDate.of(2017, Month.MAY, 24);
//        LocalDate dateTo = LocalDate.of(2017, Month.JULY, 29);
//        long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
//        System.out.println(noOfDaysBetween);

//        System.out.println("123");
//        String greeting = Main.greeting();
//        System.out.println("456");
//        System.out.println(greeting.toUpperCase());
//    }
//
//    public static String greeting() {
//
//        String message = "hgfhgfh+1";
//        return message;
//    }

//        String message = Main.getHiddenCard("1111222233334444");
//        System.out.println(message);

//        System.out.println(StringUtils.reverse("мама"));
//        System.out.println();
//        System.out.println(Main.isPalindrome("Dad"));

        System.out.println(Main.isLeapYear(2024));


    }

//    public static String getHiddenCard(String cardNumber, int hidingSymbol) {
//
//        return "*".repeat(hidingSymbol) + cardNumber.substring(12);
//    }
//
//    public static String getHiddenCard(String cardNumber) {
//
//        return getHiddenCard(cardNumber, 4);
//    }

//    public static boolean isPalindrome(String str){
//
//        return StringUtils.reverse(str).equalsIgnoreCase(str);
//   }

    public static boolean isLeapYear(int year) {

        return (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);
    }

    //Год будет високосным, если он кратен (то есть делится без остатка) 400 или он одновременно кратен 4 и не кратен 100.

}