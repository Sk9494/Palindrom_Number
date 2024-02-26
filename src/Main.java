public class Main {

    static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastNumber;      //reversNumber sayının tersenn ifadesi,last number son rakamını temsil eder
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)     //sayının tersiyle eşitliği kontrol edilir 
        return true;                      //sayı aynı ise true döner değilse false döner
        else
            return  false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
}
