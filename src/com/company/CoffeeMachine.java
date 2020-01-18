package com.company;

import java.util.Scanner;

public class CoffeeMachine {
    int water = 10;
    int coffee = 10;
    int milk = 10;
    int cocoa = 10;

    public void MakeCoffeeAmericano(int iAmericano) {
        if (iAmericano > 0) {
            for (int i = 0; i < iAmericano; i++) {
                Americano americano = MakeAmericano();
                if (americano != null) {
                    System.out.println(i + " cup, here your americano");
                } else
                    System.out.println("Sorry can't make this cup");
            }
        }
    }

    public Americano MakeAmericano(){
        if(coffee > 1 && water > 2){
            coffee -= 1;
            water -= 1;

            Americano americano = new Americano();
            return americano;
        } else
            return null;
    }

    public void MakeCoffeeLatte(int iLatte) {
        if (iLatte > 0) {
            for (int i = 0; i < iLatte; i++) {
                Latte latte = MakeLatte();
                if (latte != null) {
                    System.out.println(i + " cup, here your latte");
                } else
                    System.out.println("Sorry can't make this cup");
            }
        }
    }

    public Latte MakeLatte(){
        if(coffee > 1 && milk > 2){
            coffee -= 1;
            milk -= 1;

            Latte latte = new Latte();
            return latte;
        } else
            return null;
    }

    public void MakeCoffeeEspresso(int iEspresso) {
        if (iEspresso > 0) {
            for (int i = 0; i < iEspresso; i++) {
                Espresso espresso = MakeEspresso();
                if (espresso != null) {
                    System.out.println(i + " cup, here your espresso");
                } else
                    System.out.println("Sorry can't make this cup");
            }
        }
    }

    public Espresso MakeEspresso(){
        if(coffee > 2 ){
            coffee -= 1;

            Espresso espresso = new Espresso();
            return espresso;
        } else
            return null;
    }

    public void MakeCoffeeCapuccino(int iCapuccino) {
        if (iCapuccino > 0) {
            for (int i = 0; i < iCapuccino; i++) {
                Capuccino capuccino = MakeCapuccino();
                if (capuccino != null) {
                    System.out.println(i + " cup, here your capuccino");
                } else
                    System.out.println("Sorry can't make this cup");
            }
        }
    }

    public Capuccino MakeCapuccino(){
        if(coffee > 1 && milk > 1){
            coffee -= 1;
            milk -= 1;

            Capuccino capuccino = new Capuccino();
            return capuccino;
        } else
            return null;
    }

    public void MakeCoffeeMocha(int iMocha) {
        if (iMocha > 0) {
            for (int i = 0; i < iMocha; i++) {
                Mocha mocha = MakeMocha();
                if (mocha != null) {
                    System.out.println(i + " cup, here your mocha");
                } else
                    System.out.println("Sorry can't make this cup");
            }
        }
    }

    public Mocha MakeMocha(){
        if(coffee > 1 && water > 2 && cocoa > 0.5){
            coffee -= 1;
            milk -= 1;
            cocoa -= 1;

            Mocha mocha = new Mocha();
            return mocha;
        } else
            return null;
    }
}