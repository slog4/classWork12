package com.company;

import java.util.Collections;
import java.util.Comparator;

abstract class Aworker implements IWorker,Comparable<Aworker>{
    int iD;
    int pay;
    String name;
    int time;



    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public double getPay() {
        return pay;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\n Aworker{" +
                "iD=" + iD +
                ", pay=" + pay +
                ", name='" + name + '\'' +
                ", time=" + time +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }



    public static Comparator<Aworker> nameComparator  = new Comparator<Aworker>() {
        public int compare(Aworker one, Aworker other) {
            return one.name.compareTo(other.name);
        }
    };
}
