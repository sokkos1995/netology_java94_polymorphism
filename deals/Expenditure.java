package deals;

public class Expenditure extends Deal {
    public Expenditure(int debitChange, int creditChange, String comment) {
        super(debitChange, creditChange, comment);
        if (creditChange <= 0) {
            throw new IllegalArgumentException("Сумма покупки не может быть меньше или равна нулю");
        }
        if (debitChange != 0) {
            throw new IllegalArgumentException("При покупке сумма доходов должна быть равна нулю");
        }               
        // this.comment = "Покупка " + comment + " на " + creditChange + " руб.";
    }    
}