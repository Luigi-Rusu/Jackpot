package com.playtika.main;

import com.playtika.slot.Slot;

public class Main {
    /*
   Enunt : Primim ca input o suma de bani in EURO de la un slot machine , trebuie sa scriem un program care sa fie folosit de slot machine pentru a da
   un numar minim de monede celui care a castigat suma. Monedele sunt [ 1c(cent), 2c, 5c, 10c, 20c, 50c, 1e(euro), 2e ]

   Exemplu : jackpot = 19.99 euro
   Raspuns : [0,2,1,0,2,1,1,9]
   Explicatie: vom folosi 9 monede de 2e, 1 de 1e , 1 de 50c , 2 de 20c , niciuna de 10c, 1 de 5c , 2 de 2c si niciuna de 1c
    */
    public static void main(String[] args) {
        Slot slot = new Slot(1999);
        int[] coins = slot.coins();

        for (int i : coins) {
            System.out.print(coins[i] + " ");
        }
    }
}
