package Tarea;

public class Carro{
    //Atributos (Definición de variables)
    String Modelo;
    String Color;
    int Motor;
    String Transmision ;
    int cinturones;
    int Puertas;
    
    
    //Metodo (Secuencia de pasos)
    public static void main(String[] args){
        Carro carro = new Carro();
        
       //Consumir (Uso de variables) 
        carro.Modelo="Toyota";
        carro.Color="Blanco";
        carro.Motor=2000;
        carro.Transmision="Manual";
        carro.cinturones=5;
        carro.Puertas=5;
        
        
        //imprimir (Salida de los valores ingresados mensaje)
        System.out.println("Modelo del carro: "+carro.Modelo);
        System.out.println("Color del carro: "+carro.Color);
        System.out.println("Motor: "+carro.Motor);
        System.out.println("Tipo de transmisión del carro: "+carro.Transmision);
        System.out.println("Total de cinturones que posee: "+carro.cinturones);
        System.out.println("Total de puertas: "+carro.Puertas);
        
        
        
    }
        
   }