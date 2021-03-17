package com.btkt.bai2;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Team mTeam = new Team();

        boolean exit = false;
        do {
            System.out.println("Choose type of list player: " +
                    "\n1 - List player follow 4-4-2" +
                    "\n2 - List player follow 3-5-2" +
                    "\n3 - List player follow 4-3-3" +
                    "\nOther to exit!");
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    mTeam.buildTeam();
                    break;
                case 2:
                    mTeam.buildTeam(3, 5, 2);
                    break;
                case 3:
                    mTeam.buildTeam(4, 3, 3);
                    break;
                default:
                    exit = true;
                    break;
            }
        } while (!exit);
    }
}
