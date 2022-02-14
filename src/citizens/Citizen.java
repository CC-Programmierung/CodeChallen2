package citizens;

public abstract class Citizen implements features.ITax {

    private double income;
    private double tax;
    private double allowance = 2500.00;

    @Override
    public double getIncome() {
        if(income > 2500){
            income = income - allowance;
            setTax(0.25);
        }
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
