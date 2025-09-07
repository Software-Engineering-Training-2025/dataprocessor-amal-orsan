package org.example.dataprocessor.clean;
import java.util.List;
import java.util.stream.Collectors;

public class removeNegatives implements CleaningInterface{
    @Override
    public List<Integer> clean(List<Integer> data) {
        if (data == null || data.isEmpty()) {
            return List.of();
        }
        return data.stream().filter(integer -> integer >= 0).collect(Collectors.toList());
    }
}
