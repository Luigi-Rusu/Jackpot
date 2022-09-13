package com.playtika.slot;

public class Slot {
    private int jackpot;

    public Slot(int jackpot) {
        this.jackpot = jackpot;
    }
    public int getJackpot() {
        return jackpot;
    }

    public void setJackpot(int jackpot) {
        this.jackpot = jackpot;
    }

    public int[] coins() {
        // am folosit o metoda de tip greedy , am transformat totul in centi pentru a lucra doar cu int-uri , deoarece cu float-uri
        // pierdeam din precizie.Pentru a se observa mai usor , am facut cate un while pt fiecare tip de moneda.

        //coins este vectorul ce va fi returnat la final , la inceput este initializat cu 0-uri
        int[] coins = {0, 0, 0, 0, 0, 0, 0, 0};

        while (jackpot >= 200) {
            jackpot -= 200;
            coins[7]++;
        }

        while (jackpot >= 100) {
            jackpot -= 100;
            coins[6]++;
        }

        while (jackpot >= 50) {
            jackpot -= 50;
            coins[5]++;
        }

        while (jackpot >= 20) {
            jackpot -= 20;
            coins[4]++;
        }

        while (jackpot >= 10) {
            jackpot -= 10;
            coins[3]++;
        }

        while (jackpot >= 5) {
            jackpot -= 5;
            coins[2]++;
        }

        while ( jackpot >= 2) {
            jackpot -= 2;
            coins[1]++;
        }

        while (jackpot >= 1) {
            jackpot -= 1;
            coins[0]++;
        }

        return coins;
    }
}
