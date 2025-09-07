package org.example.dataprocessor.analysis;
import java.util.*;

public  class nearestRank implements AnalysisInterface {
    @Override
    public double analysis(List<Integer> data) {
        double result;
        if (data.isEmpty()) {
            result = Double.NaN;
        } else {
            List<Integer> sorted = new ArrayList<>(data);
            Collections.sort(sorted);
            int n = sorted.size();
            int rank = (int) Math.ceil(0.90 * n);
            result = sorted.get(rank - 1);
        }
        return result;
    }
}
