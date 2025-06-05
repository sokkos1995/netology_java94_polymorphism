package deals;

public class Sale extends Deal {
    public Sale(int debitChange, int creditChange, String comment) {
        super(debitChange, 0, "Продажа " + comment + " на " + debitChange + " руб.");
        if (debitChange <= 0) {
            throw new IllegalArgumentException("Сумма продажи не может быть меньше или равна нулю");
        } 
    }    
}
