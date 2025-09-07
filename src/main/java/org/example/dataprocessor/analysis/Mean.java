package org.example.dataprocessor.analysis;
import java.util.List;

public class Mean implements AnalysisInterface{
        @Override
        public double analysis(List<Integer> data) {
            if (data == null || data.isEmpty()) {
                return Double.NaN;
            }
            return data.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(Double.NaN);
        }
}
