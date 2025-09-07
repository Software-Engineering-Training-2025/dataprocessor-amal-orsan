package org.example.dataprocessor.output;

public class Console implements OutputInterface {
        public void output(double Output) {
            System.out.println("Result = " + Output);
    }
}
