//Perform binary search on sorted array

import java.util.Scanner;

class ArrayX8 {

    private int Arr[];
    private int iSize;

    public ArrayX8(int iNo) {
        iSize = iNo;
        Arr = new int[iSize];
    }

    public void Accept() {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter sorted elements: ");
        for (int iCnt = 0; iCnt < iSize; iCnt++) {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public int BinarySearch(int iNo) {

        int iStart = 0;
        int iEnd = iSize - 1;

        while (iStart <= iEnd) {
            int iMid = iStart + (iEnd - iStart) / 2;

            if (Arr[iMid] == iNo) {
                return iMid;
            } else if (Arr[iMid] < iNo) {
                iStart = iMid + 1;
            } else {
                iEnd = iMid - 1;
            }
        }

        return -1;
    }
}

class Ques_8 {

    public static void main(String[] args) {

        int iLength = 0;
        int iSearch = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        iLength = sobj.nextInt();

        ArrayX8 aobj = new ArrayX8(iLength);

        aobj.Accept();

        System.out.println("Enter element to search : ");
        iSearch = sobj.nextInt();

        int iRet = aobj.BinarySearch(iSearch);

        if (iRet == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index : " + iRet);
        }
    }
}
