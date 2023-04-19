package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> intSet = new HashSet<>();
        for (int temp : sourceList) {
            intSet.add(temp);
            if (temp % 2 != 0) {
                intSet.add(temp * 2);
            } else {
                while (temp % 2 == 0) {
                    temp = temp / 2;
                    intSet.add(temp);
                }
            }
        }
        return intSet;
    }
}
