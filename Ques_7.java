//Check whether given string is palindrome or not

import java.util.Scanner;

class StringX7 {

    private String str;

    public void Accept() {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        str = sobj.nextLine();
    }

    public boolean CheckPalindrome() {

        int iStart = 0;
        int iEnd = str.length() - 1;

        while (iStart < iEnd) {
            if (str.charAt(iStart) != str.charAt(iEnd)) {
                return false;
            }
            iStart++;
            iEnd--;
        }

        return true;
    }
}

class Ques_7 {

    public static void main(String[] args) {

        StringX7 sobj = new StringX7();

        sobj.Accept();

        boolean bRet = sobj.CheckPalindrome();

        if (bRet == true) {
            System.out.println("String is Palindrome.");
        } else {
            System.out.println("String is Not Palindrome.");
        }
    }
}
