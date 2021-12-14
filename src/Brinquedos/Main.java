package Brinquedos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {
        Carro ca = new Carro();
        Aviao av = new Aviao();
        Barco br = new Barco();
        
        controleRemoto cr = new controleRemoto(ca);
        cr.mover();
    }
}
