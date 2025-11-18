//Remove Duplicate Elements

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

    public void RemoveDuplicate() {
        int iCnt1 = 0;
        int iCnt2 = 0;

        for (iCnt1 = 0; iCnt1 < iSize; iCnt1++) {

            for (iCnt2 = iCnt1 + 1; iCnt2 < iSize; iCnt2++) {
                if (Arr[iCnt1] == Arr[iCnt2]) {
                    Arr[iCnt1] = 0;
                }
            }

        
        ///                                        Error || Doubt
        }

        for (iCnt1 = 0; iCnt1 < iSize; iCnt1++) {
            System.out.println(Arr[iCnt1]);
        }

    }

}

class Ques_5 {

    public static void main(String[] args) {

        int iRet = 0;
        int iLength = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        iLength = sobj.nextInt();

        ArrayX aobj = new ArrayX(iLength);

        aobj.Accept();
        aobj.RemoveDuplicate();

    }
}
