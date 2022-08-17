package com.tematresjavabasico.servicio;

public class Bucle {

    public Bucle() {
    }

    public void execute() {
        String[] nombres = {"Ezequiel", "Brian", "Rebeca", "Santiago"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
