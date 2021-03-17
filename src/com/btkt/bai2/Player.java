package com.btkt.bai2;

public class Player {
    private int num;
    private String fullName;
    private Position position;

    public Player(String playerInfo) {
        String[] info = playerInfo.split(" - ");

        this.num = Integer.parseInt(info[0]);
        this.fullName = info[1];
        this.position = Position.valueOf(info[2]);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s", num, fullName, position);
    }

    public enum Position {
        GK,
        DF,
        MF,
        FW;
    }
}
