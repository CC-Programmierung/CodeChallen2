package com.company;
import citizens.*;

import company.TestCompany;
import features.TaxFeatures;

public class Main {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setIncome(5000);

        TestCompany te = new TestCompany();
        te.setIncome(1000);
        te.setEmpl(101);

        System.out.println("Steuern eines Arbeiters: " + TaxFeatures.calculateCitizenTax(e));
        System.out.println("Steuern des Unternehmens: " + TaxFeatures.calculateCompanyTax(te));






    }
}
