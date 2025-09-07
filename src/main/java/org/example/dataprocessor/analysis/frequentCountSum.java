package org.example.dataprocessor.analysis;
import java.util.*;
import java.util.stream.Collectors;

public  class frequentCountSum implements AnalysisInterface{
    @Override
    public  double analysis(List<Integer> data) {
        if (data.isEmpty())
            return 0.0;
        Map<Integer, Long> freq = data.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        return freq.entrySet().stream()
                .sorted((a, b) -> {
                    int cmp = Long.compare(b.getValue(), a.getValue());
                    return (cmp != 0) ? cmp : Integer.compare(a.getKey(), b.getKey());
                })
                .limit(3)
                .mapToLong(Map.Entry::getValue)
                .sum();
    }
}
