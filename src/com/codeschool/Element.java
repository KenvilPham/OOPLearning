package com.codeschool;

public class Element {
    private int no;
    private String symbol;
    private double weight;
    private String name;

    public Element(String info) {
        String[] infoLineCSV = info.split(",");
        this.no = Integer.parseInt(infoLineCSV[0]);
        this.symbol = infoLineCSV[1];
        this.weight = Double.parseDouble(infoLineCSV[2]);
        this.name = infoLineCSV[3];
    }

    public int getNo() {
        return no;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s %.3f (%s)", no, symbol, weight, name);
    }

}
