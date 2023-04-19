package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> temp = new HashSet<>(firstSet);
        Set<String> resultSet = new HashSet<>(thirdSet);

        resultSet.removeAll(firstSet);
        resultSet.removeAll(secondSet);
        temp.retainAll(secondSet);
        temp.removeAll(thirdSet);
        resultSet.addAll(temp);

        return resultSet;
    }
}
