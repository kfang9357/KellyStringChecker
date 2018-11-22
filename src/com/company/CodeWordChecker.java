package com.company;

public class CodeWordChecker implements StringChecker {
    private int min;
    private int max;
    private String noStr;


    public CodeWordChecker(int min, int max, String noStr) {
        this.min = min;
        this.max = max;
        this.noStr = noStr;
    }

    public CodeWordChecker(String noStr) {
        this.noStr = noStr;
        this.min = 6;
        this.max =20;
    }

    public boolean isValid(String str) {
        int length = str.length();
        boolean valid = false;
        if ((length < max + 1) && (length > min - 1)) {
            if (str.indexOf(noStr) < 0) {
                valid = true;
            }
        }
        return valid;
    }
}
