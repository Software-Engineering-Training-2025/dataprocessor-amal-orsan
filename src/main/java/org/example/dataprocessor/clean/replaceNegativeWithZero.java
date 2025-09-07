package org.example.dataprocessor.clean;

import java.util.List;

public class replaceNegativeWithZero implements CleaningInterface{
    @Override
    public List<Integer> clean(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return List.of();
        }
        return list.stream().map(integer -> integer < 0 ? 0 : integer).toList();
    }
}
