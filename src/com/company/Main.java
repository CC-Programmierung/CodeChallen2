package com.company;
import citizens.*;
import features.*;
import company.*;

import company.TestCompany;
import features.ITax;
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





        ITax[]elements= new ITax[10];
        elements[0] = e;
        elements[1] = te;
        ITax[] arr ={e,te};

        System.out.println("Gesamtsteuern: " + totalTax(elements));

    }

    public static double totalTax(ITax[] t){
        double totalTax = 0;
        for(int i = 0; i< t.length;i++){
            if(t[i] != null){
                totalTax += TaxFeatures.calculateCitizenTax(t[i]);
            }
        }
        return totalTax;
    }
}
