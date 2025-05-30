package deals;

public class Sale extends Deal {
    public Sale(int debitChange, int creditChange, String comment) {
        super(debitChange, creditChange, comment);
        if (debitChange <= 0) {
            throw new IllegalArgumentException("Сумма продажи не может быть меньше или равна нулю");
        }
        if (creditChange != 0) {
            throw new IllegalArgumentException("При продаже сумма расходов должна быть равна нулю");
        }        
        // this.comment = "Продажа " + comment + " на " + debitChange + " руб.";

    }    
}
