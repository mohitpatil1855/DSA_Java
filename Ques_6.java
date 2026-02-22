//Find pair with given sum in an array

import java.util.HashSet;
import java.util.Scanner;

class ArrayX6 {

    private int Arr[];
    private int iSize;

    public ArrayX6(int iNo) {
        iSize = iNo;
        Arr = new int[iSize];
    }

    public void Accept() {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements: ");
        for (int iCnt = 0; iCnt < iSize; iCnt++) {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public boolean CheckPairForSum(int iTarget) {
        HashSet<Integer> hobj = new HashSet<Integer>();

        for (int iCnt = 0; iCnt < iSize; iCnt++) {
            int iNeed = iTarget - Arr[iCnt];
            if (hobj.contains(iNeed)) {
                System.out.println("Pair found : " + Arr[iCnt] + " and " + iNeed);
                return true;
            }
            hobj.add(Arr[iCnt]);
        }

        return false;
    }
}

class Ques_6 {

    public static void main(String[] args) {

        int iLength = 0;
        int iTarget = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        iLength = sobj.nextInt();

        ArrayX6 aobj = new ArrayX6(iLength);

        aobj.Accept();

        System.out.println("Enter target sum : ");
        iTarget = sobj.nextInt();

        boolean bRet = aobj.CheckPairForSum(iTarget);

        if (bRet == false) {
            System.out.println("No pair found for given sum.");
        }
    }
}
