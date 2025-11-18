//check whether the array is sorted or not

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

    public boolean CheckSorted() {
        boolean bFlag = false;
        int iCnt = 0;

        bFlag = true;
        for (iCnt = 0; iCnt < iSize - 1; iCnt++) {
            if (Arr[iCnt] > Arr[iCnt + 1]) {
                bFlag = false;
            }
        }

        return bFlag;
    }

}

class Ques_1 {

    public static void main(String[] args) {

        boolean bRet = false;

        ArrayX aobj = new ArrayX(5);

        aobj.Accept();
        bRet = aobj.CheckSorted();

        if (bRet == true) {
            System.out.println("Array is Sorted..");
        } else {
            System.out.println("Array is Not Sorted..");

        }
    }
}
