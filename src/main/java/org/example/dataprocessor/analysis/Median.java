package org.example.dataprocessor.analysis;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Median implements AnalysisInterface{
    @Override
    public double analysis(List<Integer> data) {
        double result;
        if (data.isEmpty()) {
            result = Double.NaN;
        } else {
            List<Integer> sorted = new ArrayList<>(data);
            Collections.sort(sorted);
            int size = sorted.size();
            if (size % 2 == 1) {
                result = sorted.get(size / 2);
            } else {
                result = (sorted.get(size/ 2 - 1) + sorted.get(size / 2)) / 2.0;
            }
        }
        return result;
    }
}
