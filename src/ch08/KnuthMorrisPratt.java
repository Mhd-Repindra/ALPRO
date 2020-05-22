package ch08;


import java.util.Scanner;

public class KnuthMorrisPratt {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String search = kb.next();
        String target = kb.next();
        int result = KMP (search, target);
        if (result == -1){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }

    public static int KMP(String search, String target){
        int[] failureTable = failureTable(target);

        int targetPointer = 0;
        int searchPointer = 0;

        while (searchPointer < search.length()){
            if (search.charAt(searchPointer) == target.charAt(targetPointer)){

                targetPointer++;
                if (targetPointer == target.length()){
                    int X = target.length() + 1;
                    return searchPointer - X;
                }
                searchPointer++;
            }else if (targetPointer > 0){
                targetPointer = failureTable[targetPointer];
            }else{
                searchPointer++;
            }
        }
        return -1;
    }

    public static int[] failureTable(String target){
        int[] table = new int[target.length() + 1];

        table[0] = -1;
        table[1] = 0;

        int left = 0;
        int right = 2;

        while (right < table.length) {
            if (target.charAt(right - 1) == target.charAt(left)){
                left++;
                table[right] = left;
                right++;
            } else if (left > 0){
                left = table[left];
            } else {
                table[right] = left;
                right++;
            }
        }
        return table;
    }
}
