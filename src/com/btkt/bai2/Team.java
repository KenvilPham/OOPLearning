package com.btkt.bai2;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Team {
    private ArrayList<Player> mListPlayer;
    private Scanner sc = new Scanner(System.in);

    public Team() throws IOException {
        mListPlayer = importListPlayer();
    }

    private ArrayList<Player> importListPlayer() throws IOException {
        ArrayList<Player> mPlayer = new ArrayList<>();
        File playerListFile = new File("player_list.txt");
        Scanner reader = new Scanner(playerListFile);

        while (reader.hasNextLine()) {
            mPlayer.add(new Player(reader.nextLine()));
        }
        reader.close();

        return mPlayer;
    }

    public void printAllPlayer() {
        mListPlayer.forEach(System.out::println);
    }


    public ArrayList<Player> buildTeam() {
        Random rd = new Random();
        ArrayList<Player> player = new ArrayList<>();

        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwaderSize = 0;

        boolean runnable = true;
        while (runnable) {
            System.out.println("List player: ");
            while (gateKeeperSize < 1) {
                int rdGateKeeper = rd.nextInt(22);
                if (mListPlayer.get(rdGateKeeper).getPosition().equals(Player.Position.GK)) {
                    player.add(mListPlayer.get(rdGateKeeper));
                    gateKeeperSize++;
                }
            }

            while (defenderSize < 4) {
                int rdDefender = rd.nextInt(22);
                if (mListPlayer.get(rdDefender).getPosition().equals(Player.Position.DF)
                        && !player.contains(mListPlayer.get(rdDefender))) {
                    player.add(mListPlayer.get(rdDefender));
                    defenderSize++;
                }

            }

            while (midFieldSize < 4) {
                int rdMidField = rd.nextInt(22);
                if (mListPlayer.get(rdMidField).getPosition().equals(Player.Position.MF)
                        && !player.contains(mListPlayer.get(rdMidField))) {
                    player.add(mListPlayer.get(rdMidField));
                    midFieldSize++;
                }
            }

            while (forwaderSize < 2) {
                int rdForwader = rd.nextInt(22);
                if (mListPlayer.get(rdForwader).getPosition().equals(Player.Position.FW)
                        && !player.contains(mListPlayer.get(rdForwader))) {
                    player.add(mListPlayer.get(rdForwader));
                    forwaderSize++;
                }
            }

            player.forEach(System.out::println);

            System.out.println("\nDo you want to see another option? Type Y or N: ");
            String answer = sc.nextLine();
            if (answer.toUpperCase().equals("Y")) {
                runnable = true;
            } else {
                runnable = false;
            }
        }

        return player;
    }

    public void buildTeam2() {
        Random rd = new Random();
        ArrayList<Player> player = new ArrayList<>();

        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwaderSize = 0;

        while (player.size() < 11) {
            int rdNumber = rd.nextInt(22);

            if (mListPlayer.get(rdNumber).getPosition().equals(Player.Position.GK)
                    && gateKeeperSize < 1) {
                player.add(mListPlayer.get(rdNumber));
                gateKeeperSize++;
            }

            if (mListPlayer.get(rdNumber).getPosition().equals(Player.Position.DF)
                    && !player.contains(mListPlayer.get(rdNumber))
                    && defenderSize < 4) {
                player.add(mListPlayer.get(rdNumber));
                defenderSize++;
            }

            if (mListPlayer.get(rdNumber).getPosition().equals(Player.Position.MF)
                    && !player.contains(mListPlayer.get(rdNumber))
                    && midFieldSize < 4) {
                player.add(mListPlayer.get(rdNumber));
                midFieldSize++;
            }

            if (mListPlayer.get(rdNumber).getPosition().equals(Player.Position.FW)
                    && !player.contains(mListPlayer.get(rdNumber))
                    && forwaderSize < 2) {
                player.add(mListPlayer.get(rdNumber));
                forwaderSize++;
            }
        }

        player.forEach(System.out::println);
    }

    public ArrayList<Player> buildTeam(int defender, int midFielder, int forwarder) {

        Random rd = new Random();
        ArrayList<Player> player = new ArrayList<>();

        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwaderSize = 0;

        boolean runnable = true;
        while (runnable) {
            System.out.println("List player: ");
            while (gateKeeperSize < 1) {
                int rdGateKeeper = rd.nextInt(22);
                if (mListPlayer.get(rdGateKeeper).getPosition().equals(Player.Position.GK)) {
                    player.add(mListPlayer.get(rdGateKeeper));
                    gateKeeperSize++;
                }
            }

            while (defenderSize < defender) {
                int rdDefender = rd.nextInt(22);
                if (mListPlayer.get(rdDefender).getPosition().equals(Player.Position.DF)
                        && !player.contains(mListPlayer.get(rdDefender))) {
                    player.add(mListPlayer.get(rdDefender));
                    defenderSize++;
                }

            }

            while (midFieldSize < midFielder) {
                int rdMidField = rd.nextInt(22);
                if (mListPlayer.get(rdMidField).getPosition().equals(Player.Position.MF)
                        && !player.contains(mListPlayer.get(rdMidField))) {
                    player.add(mListPlayer.get(rdMidField));
                    midFieldSize++;
                }
            }

            while (forwaderSize < forwarder) {
                int rdForwader = rd.nextInt(22);
                if (mListPlayer.get(rdForwader).getPosition().equals(Player.Position.FW)
                        && !player.contains(mListPlayer.get(rdForwader))) {
                    player.add(mListPlayer.get(rdForwader));
                    forwaderSize++;
                }
            }

            player.forEach(System.out::println);

            System.out.println("\nDo you want to see another option? Type Y or N: ");
            String answer = sc.nextLine();
            if (answer.toUpperCase().equals("Y")) {
                runnable = true;
            } else {
                runnable = false;
            }
        }
        return player;
    }
}
