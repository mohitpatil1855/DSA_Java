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

    public int DisplaySecondLargest() {
        int iScndMax = 0;
        int iMax = 0;
        int iCnt = 0;

        for (iMax = Arr[0], iCnt = 0; iCnt < iSize; iCnt++) {
            if (Arr[iCnt] > iMax) {
                iScndMax = iMax;
                iMax = Arr[iCnt];
            }
        }

        return iScndMax;
    }

}

class Ques_3 {

    public static void main(String[] args) {

        int iRet = 0;
        int iLength = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        iLength = sobj.nextInt();

        ArrayX aobj = new ArrayX(iLength);

        aobj.Accept();
        iRet = aobj.DisplaySecondLargest();

        System.out.println("Second Largest Element is : " + iRet);
    }
}
