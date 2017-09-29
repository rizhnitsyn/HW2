import java.util.Scanner;

public class ConvertNumbers {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String romeString = scanner.nextLine();
        char[] chars = romeString.toCharArray();
        int arabicNumber;
        int wholeArabicNumber = 0;

        for (int i = 0; i < chars.length - 1; i++) {
            arabicNumber = getArabicNumber(chars[i]);
            if (arabicNumber == -1 || getArabicNumber(chars[i + 1]) == -1) {
                System.out.println("Incorrect input");
                return;
            } else {
                if (arabicNumber < getArabicNumber(chars[i + 1])){
                    arabicNumber = -arabicNumber;
                }
                wholeArabicNumber += arabicNumber;
            }
        }
        wholeArabicNumber += getArabicNumber(chars[chars.length - 1]);
        System.out.println(wholeArabicNumber);
    }

    public static int getArabicNumber(char romeChar ) {
        int arabicNumber;
        switch (romeChar) {
            case 'M':
                arabicNumber = 1000;
                break;
            case 'D':
                arabicNumber = 500;
                break;
            case 'C':
                arabicNumber = 100;
                break;
            case 'L':
                arabicNumber = 50;
                break;
            case 'X':
                arabicNumber = 10;
                break;
            case 'V':
                arabicNumber = 5;
                break;
            case 'I':
                arabicNumber = 1;
                break;
            default:
                arabicNumber = -1;
                break;
        }
        return arabicNumber;
    }
}
