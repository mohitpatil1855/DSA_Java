//Display second largest element from an array

import java.util.Scanner;

class ArrayX {

    private int Arr[];
    private int iSize;

    public ArrayX(int iNo) {
        iSize = iNo;
        Arr = new int[iSize];
    }

    public void Accept() {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;

        System.out.println("Enter elements: ");
        for (iCnt = 0; iCnt < iSize; iCnt++) {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public int DisplaySum() {
        int iSum = 0;
        int iCnt = 0;

        for (iCnt = 0; iCnt < iSize; iCnt++) {
            iSum += Arr[iCnt];

        }

        return iSum;
    }

}

class Ques_4 {

    public static void main(String[] args) {

        int iRet = 0;
        int iLength = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        iLength = sobj.nextInt();

        ArrayX aobj = new ArrayX(iLength);

        aobj.Accept();
        iRet = aobj.DisplaySum();

        System.out.println("Sum of All Elements is : " + iRet);
    }
}
