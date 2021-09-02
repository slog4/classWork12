package com.company;

public class HourlyPayment extends Aworker{

    public HourlyPayment(int pay, String name, int time) {
        this.pay = pay;
        this.name = name;
        this.iD=1;
        this.time = time;
    }

    @Override
    public int payroll(int time) {
        int payment = time*pay;
        return payment;
    }


    @Override
    public int compareTo(Aworker o) {
        return 0;
    }
}
