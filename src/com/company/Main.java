package com.company;

import java.util.*;

public class Main {



    public static void main(String[] args) {
        int id = 1;
        BidPayment woker1 = new BidPayment(7000, "Betya", 15);
        BidPayment woker2 = new BidPayment(6500, "Aasya", 21);
        HourlyPayment woker3 = new HourlyPayment(89, "Dedya", 100);
        HourlyPayment woker4 = new HourlyPayment(25, "Ciril", 10);
        System.out.println(woker1);
        System.out.println(woker2);
        System.out.println(woker3);
        PayrollPerMonth payrollPerMonth = new PayrollPerMonth(woker1, woker2, woker3);
        System.out.println(payrollPerMonth);
        payrollPerMonth.addWorkers(woker4);
        System.out.println("----------------\n");
        System.out.println(payrollPerMonth);
        Collections.sort(payrollPerMonth.getArrWorkers(), Aworker.nameComparator);
        System.out.println(payrollPerMonth);

        PayrollPerMonth payrollPerMonth1 = payrollPerMonth.sort(Aworker.nameComparator);

    }


}


