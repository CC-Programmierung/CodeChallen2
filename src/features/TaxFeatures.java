package features;

public class TaxFeatures {

public static double calculateCitizenTax(ITax c){return c.getIncome() * c.getTax();}
public static double calculateCompanyTax(ITax cC){return cC.getIncome() * cC.getTax();}

}
