package company;

public abstract class Company implements features.ITax {
    private int empl;
    private double tax;
    private double income;

    public int getEmpl() {
        return empl;
    }

    public void setEmpl(int empl) {
        this.empl = empl;
    }

    public double getTax() {
        if(empl > 100){
            setTax(0.14);
        }else{
            setTax(0.20);
        }
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
