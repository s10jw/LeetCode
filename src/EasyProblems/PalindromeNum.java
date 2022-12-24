package EasyProblems;

import java.util.Arrays;

public class PalindromeNum {
    public static boolean isPalindrome(int x) {
    if (x < 0) {
        return false;
    }
    int[] int_list = intToList(x);
    for (int i = 0; i < int_list.length; i++) {
        if (int_list[i] != int_list[(int_list.length - 1) - i]) {
            return false;
        }
    }
    return true;
    }
    private static int[] intToList(int x) {
        int integer = x;
        int size = 1;
        int cnt = 0;
        if (integer / 10 == 0) {
            return new int[]{integer};
        } else {
            while (integer / 10 != 0) {
                size++;
                integer = integer / 10;
            }
        }
        int[] result = new int[size];
        while (cnt < size) {
            result[cnt] = x % 10;
            x = x / 10;
            cnt ++;
        }
        return result;
    }
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }
}
