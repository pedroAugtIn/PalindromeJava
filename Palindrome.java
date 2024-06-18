public class Palindrome {

    public static void main(String[] args){
        isPalindrome(11);
        isPalindrome(-1221);
        isPalindrome(707);
        isPalindrome(11212);
        isPalindrome(289982);
        isPalindrome(-289982);
    }

    public static boolean isPalindrome(int number){

        boolean check = false;
        int reverse = 0;
        int numberDivide = number;

        if(number < 0){
            numberDivide = number * -1;
        }

        while (numberDivide > 0){
            reverse += numberDivide % 10;
            reverse *= 10;
            numberDivide = numberDivide / 10;
        }

        if(number < 0){
            reverse = (reverse / 10) * -1;
        } else {
            reverse = reverse / 10;
        }

        if(reverse == number){
            check = true;
            System.out.println("Palindrome: Reverse " + reverse + " is equal to number " + number);
        } else {
            System.out.println("Fail: Reverse (" + reverse + ") is not a palindrome of Number (" + number + ").");
        }

        return check;
    }
}
