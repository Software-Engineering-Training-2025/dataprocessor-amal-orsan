package org.example.dataprocessor.analysis;

import org.example.dataprocessor.enums.AnalysisType;

public class AnalysisFactory {
        public static AnalysisInterface getAnalyzer(AnalysisType analysisType) {
            if(analysisType == AnalysisType.MEAN) {
                return new Mean();
            }
            if(analysisType == AnalysisType.MEDIAN) {
                return new Median();
            }
            if(analysisType == AnalysisType.STD_DEV) {
                return new stdDev();
            }

            if(analysisType == AnalysisType.P90_NEAREST_RANK) {
                return new nearestRank();
            }
            if(analysisType == AnalysisType.TOP3_FREQUENT_COUNT_SUM) {
                return new frequentCountSum();
            }
            throw new RuntimeException();
        }
    }
