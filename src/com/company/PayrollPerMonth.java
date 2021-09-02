package com.company;

import java.util.ArrayList;
import java.util.List;


public class PayrollPerMonth {
    private ArrayList<Aworker> arrWorkers;
    private int id;


    public PayrollPerMonth(Aworker... arrWorkers) {
        this.arrWorkers = new ArrayList<>();
        for (Aworker aworker : arrWorkers) {
            this.arrWorkers.add(aworker);
            aworker.setiD(this.id++);
            payroll(aworker);

        }
    }

    public void addWorkers(Aworker... arrWorkers) {
        for (Aworker aworker : arrWorkers) {
            this.arrWorkers.add(aworker);
            aworker.setiD(this.id++);
            payroll(aworker);
        }

    }

    private int CheckingTheHoursWorked(int time) {
        return (Constants.WORKING_HOURS_RATE >= time ? time : Constants.WORKING_HOURS_RATE + ((time - Constants.WORKING_HOURS_RATE) * 2));
    }

    private void payroll(Aworker aworker) {
        if (aworker instanceof BidPayment) {
            if (aworker.pay / Constants.WORKING_HOURS_RATE * CheckingTheHoursWorked(aworker.time) >= Constants.MINIMUM_WAGE) {
                aworker.setPay(aworker.pay / Constants.WORKING_HOURS_RATE * CheckingTheHoursWorked(aworker.time));
            } else {
                aworker.setPay(Constants.MINIMUM_WAGE / Constants.WORKING_HOURS_RATE * aworker.time);
            }
        } else if (aworker instanceof HourlyPayment) {
            if (aworker.pay * CheckingTheHoursWorked(aworker.time) >= Constants.MINIMUM_WAGE) {
                aworker.setPay(aworker.pay * CheckingTheHoursWorked(aworker.time));
            } else {
                aworker.setPay(Constants.MINIMUM_WAGE/ Constants.WORKING_HOURS_RATE * aworker.time);
            }
        }
    }


    @Override
    public String toString() {
        return "PayrollPerMonth{" +
                "\n arrWorkers=" + arrWorkers +
                '}';
    }


}
