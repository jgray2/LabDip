package dip.lab2.solution;

import dip.lab2.*;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculatorStrategy implements TipCalculatorStrategy {
    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private final double GOOD_RATE = 0.20;
    private final double FAIR_RATE = 0.15;
    private final double POOR_RATE = 0.10;

    private double bill;
   
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    //if you put into interface then all instances of ServiceQuality must be
    //TipCalculatorStrategy.ServiceQuality q
    
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculatorStrategy(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    public final double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

}
