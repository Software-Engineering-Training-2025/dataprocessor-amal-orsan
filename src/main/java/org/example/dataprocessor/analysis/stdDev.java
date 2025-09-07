package org.example.dataprocessor.analysis;
import java.util.List;

public  class stdDev implements AnalysisInterface{
    @Override
    public double analysis(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;
        double mean = data.stream().mapToDouble(i -> i).average().orElse(Double.NaN);
        double variance = data.stream()
                .mapToDouble(i -> Math.pow(i - mean, 2))
                .sum() / data.size();
        return Math.sqrt(variance);
    }
}
