package com.example.noice;

class Problem {
    public static void main(String[] args) {

    }


    public static Boolean solve(String A, String B) {
        if (A.equals(B)) return true;
        int start = 0;
        while (A.charAt(start) != '*') {
            if (A.charAt(start) != B.charAt(start)) return false;
            start++;
        }

        int endA = A.length() - 1;
        int endB = B.length() - 1;
        while (A.charAt(endA) != '*') {
            if (A.charAt(endA) != B.charAt(endB)) return false;
            endA--;
            endB--;
        }
        return true;
    }
}