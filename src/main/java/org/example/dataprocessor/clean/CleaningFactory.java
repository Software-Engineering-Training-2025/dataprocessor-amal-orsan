package org.example.dataprocessor.clean;

import org.example.dataprocessor.enums.CleaningType;

public class CleaningFactory {
    public static CleaningInterface getCleanByType(CleaningType cleaningType) {
        if(cleaningType == CleaningType.REMOVE_NEGATIVES){
            return new removeNegatives();
        } else if(cleaningType == CleaningType.REPLACE_NEGATIVES_WITH_ZERO) {
            return new replaceNegativeWithZero();
        }
        throw new RuntimeException("Not supported");
    }
}
