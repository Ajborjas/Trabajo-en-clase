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
    public static int buscar = 0;
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
    
    
    public static int menu(){
        System.out.println("");
        System.out.println("");
        System.out.println("------------Menu-------------");
        System.out.println("0. Salir");
        System.out.println("1. Crear animal\n" +
                            "2. Editar animal\n" +
                            "3. Eliminar animal\n" +
                            "4. Listar animal\n" +
                            "5. Buscar animal\n" +
                            "Ingrese la opcion: ");
        return sc.nextInt();
    }
    
    public static void opciones(int opcion){
        switch (opcion) {
            case 0:
                System.exit(0);
            case 1:
                crearAnimal();
                break;
            case 2:
                editarAnimal();
                break;
            case 3:
                eliminarAnimal();
                break;
            case 4:
                listarAnimal();
                break;
            case 5:
                System.out.println("Elegia el nombre cientifico que quiere buscar: ");
                String nombre = sc.next();
                buscarAnimal(nombre);
                if(buscar==2)
                    System.out.println(lista.toString());
                break;
            default:
                break;
        }
    }
    
    
    

    
    public static void crearAnimal(){
        System.out.print("Nombre Cientifico: ");
        String nombreCientifico = sc.nextLine();
        System.out.print("Nombre Comun: ");
        String nombreComun = sc.next();
        System.out.print("Habitat: ");
        String habitat = sc.next();
        System.out.print("Alimento: ");
        String alimento = sc.next();
        System.out.print("Rasgos: ");
        String rasgos = sc.nextLine();
        System.out.print("Geografica: ");
        String geografica = sc.nextLine();
        System.out.print("Vida: ");
        int vida = sc.nextInt();
        lista.add(new Animales(nombreCientifico, nombreComun, habitat, alimento, rasgos, geografica, vida));
    }
    
    public static void editarAnimal(){
        System.out.print("Ingrese la posicion: ");
        int pos = sc.nextInt();
        System.out.println("1. Un atributo");
        System.out.println("2. Todos los atributos");
        System.out.print("Ingrese la opcion: ");
        int opcion = sc.nextInt();
        if(opcion == 1)
            editarUnAtributo(pos);
        else if(opcion == 2)
            editarAtributos(pos);
    }
    
    public static void editarUnAtributo(int pos){
        System.out.println("1. Nombre Cientifico");
        System.out.println("2. Nombre Comun");
        System.out.println("3. Habitat");
        System.out.println("4. Alimento");
        System.out.println("5. Rasgos");
        System.out.println("6. Geografica");
        System.out.println("7. Vida");
        System.out.print("Ingrese la opcion: ");
        int opcion = sc.nextInt();
        if(opcion == 1){
            System.out.print("Nombre Cientifico: ");
            lista.get(pos).setNombreCientifico(sc.next());
        }else if(opcion == 2){
            System.out.print("Nombre Comun: ");
            lista.get(pos).setNombreComun(sc.next());
        }else if(opcion == 3){
            System.out.print("Habitat: ");
            lista.get(pos).setHabitat(sc.next());
        }else if(opcion == 4){
            System.out.println("Alimento: ");
            lista.get(pos).setAlimento(sc.next());
        }else if(opcion == 5){
            System.out.print("Geografica: ");
            lista.get(pos).setRasgos(sc.next());
        }else if(opcion == 6){
            System.out.print("Año: ");
            lista.get(pos).setDescripcionGeo(sc.next());
        }else if(opcion == 7){
            System.out.println("Vida: ");
            lista.get(pos).setVida(sc.nextInt());
        }
    }
    
    public static void editarAtributos(int pos){
        System.out.print("Nombre Cientifico: ");
        lista.get(pos).setNombreCientifico(sc.next());
        System.out.print("NombreComun: ");
        lista.get(pos).setNombreComun(sc.next());
        System.out.print("Habitat: ");
        lista.get(pos).setHabitat(sc.next());
        System.out.println("Alimentacion: ");
        lista.get(pos).setAlimento(sc.next());
        System.out.print("Rasgos: ");
        lista.get(pos).setRasgos(sc.next());
        System.out.print("Descripcion Geografica: ");
        lista.get(pos).setDescripcionGeo(sc.next());
        System.out.println("Vida : ");
        lista.get(pos).setVida(sc.nextInt());
    }
    
    public static void eliminarAnimal(){
        System.out.print("Posicion: ");
        lista.remove(sc.nextInt());
    }
 
    public static void listarAnimal(){
        for (Animales animales : lista) {
            System.out.println(animales.toString());
            
        }
        
    }
    private static void buscarAnimal(String nombreCientifico) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombreCientifico().equals(nombreCientifico)) {
                buscar = 2;
                break;
            }
        }
    }
}
