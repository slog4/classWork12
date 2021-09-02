package com.company;

public class BidPayment extends Aworker{

    public BidPayment( int pay, String name,int daysWorked) {
       this.pay = pay;
       this.name = name;
        this.time = daysWorked*Constants.WORKING_HOURS ;
    }

    @Override
    public int payroll(int time) {
        int payment = (int) (pay * (time/(20.8*8)));
        return payment;
    }


    @Override
    public int compareTo(Aworker o) {
        return 0;
    }
}
