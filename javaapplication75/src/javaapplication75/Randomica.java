/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;

/**
 *
 * @author JuanPablo
 */
public class Randomica {
    public static void main(String[] args) {
        Random aleatorios = new Random();
        int v = aleatorios.nextInt(4);
        System.out.println(v);
    }
}
