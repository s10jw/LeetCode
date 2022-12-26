package EasyProblems;

public class LongCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int min = findMin(strs);
        StringBuilder longest = new StringBuilder();
        if (min == -1) {
            return "";
        }
        char hold = Character.MIN_VALUE;
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (j == 0) {
                    hold = strs[j].charAt(i);
                } else if (strs[j].charAt(i) != hold) {
                    return longest.toString();
                }
                if (strs[j].charAt(i) == hold && j == strs.length - 1) {
                    longest.append(hold);
                }
            }
        }
        return longest.toString();
    }
    private static int findMin(String[] list) {
        int min = 200;
        for (String s : list) {
            if (s.length() == 0) {
                return -1;
            }
            if (s.length() < min) {
                min = s.length();
            }
        }
        return min;
    }
    public static void main(String[] args) {
        String[] strs = new String[]{"a"};
        System.out.println(longestCommonPrefix(strs));
    }
}
