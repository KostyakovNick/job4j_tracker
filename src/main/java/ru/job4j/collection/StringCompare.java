package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        if (left != right) {
            int length = Math.min(left.length(), right.length());
            Character[] leftChars = new Character[left.length()];
            Character[] rightChars = new Character[right.length()];
            for (int i = 0; i < length; i++) {
                leftChars[i] = left.charAt(i);
                rightChars[i] = right.charAt(i);
                rsl = Character.compare(leftChars[i], rightChars[i]);
                if (rsl != 0) {
                    return rsl;
                }
            }
            if (rsl == 0) {
                rsl = left.length() - right.length();
            }
        }
        return rsl;
    }
}