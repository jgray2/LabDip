package dip.lab2.solution;

import dip.lab2.*;

public class TipService {

    private TipCalculatorStrategy tipCalculator;

    public TipService(TipCalculatorStrategy tipCalculator) {
        this.tipCalculator = tipCalculator;
    }

 }
