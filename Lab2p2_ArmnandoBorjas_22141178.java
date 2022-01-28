        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion2;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Armando Borjas
 */
public class Lab2p2_ArmnandoBorjas_22141178 {
    public static ArrayList<Animales> lista = new ArrayList();
    public static Animales animal1 = new Animales();
    public static Animales animal2 = new Animales();
    public static Animales animal3 = new Animales();
    public static Animales logueado = new Animales();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        animal1 = new Animales("Cobra", "Ophiophagus hannah", "Africa", "ratones", "escamas", "salvaje", 9 );
        animal2 = new Animales("Tiburon", "Selachimorpha", "oceano", "peces", "colmillos_afilados", "salvaje", 20 );
        animal3 = new Animales("Lobo", "Canis lupus", "Artico", "ciervos", "aullidos", "salvaje", 16 );
        lista.add(animal1);
        lista.add(animal2);
        lista.add(animal3);
        do{
            opciones( menu() );
        }while(true);
    }
    
    
    
