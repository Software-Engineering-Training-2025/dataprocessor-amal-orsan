package org.example.dataprocessor;
import org.example.dataprocessor.analysis.AnalysisFactory;
import org.example.dataprocessor.clean.CleaningFactory;
import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;
import org.example.dataprocessor.output.OutputFactory;

import java.nio.file.*;
import java.util.*;


public class DataProcessorService {

    public double process(
            CleaningType cleaningType,
            AnalysisType analysisType,
            OutputType outputType,
            List<Integer> data) throws Exception {

        List<Integer> cleanedList = CleaningFactory.getCleanByType(cleaningType).clean(data);
        double analyzedValue = AnalysisFactory.getAnalyzer(analysisType).analysis(cleanedList);
        OutputFactory.getOutput(outputType).output(analyzedValue);
        return analyzedValue;
    }
}

