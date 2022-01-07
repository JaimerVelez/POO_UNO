package Tarea;

public class Computador{
    //Atributos (Definición de variables)
    String procesador;
    String tarjetaMadre;
    String tarjetaGrafica;
    int fuenteDePoder;
    int Almacenamiento;
    int ram;
    String caja;
    //Metodo (Secuencia de pasos)
    public static void main(String[] args){
        Computador computador = new Computador();
        
       //Consumir (Uso de variables) 
        computador.procesador="Ryzen";
        computador.tarjetaMadre="Asus";
        computador.tarjetaGrafica="RX";
        computador.fuenteDePoder=550;
        computador.Almacenamiento=1000;
        computador.ram=16;
        computador.caja= "asus tuf gaming";
        
        //imprimir (Salida de los valores ingresados mensaje)
        System.out.println("Su procesador es un: "+computador.procesador);
        System.out.println("El modelo de la tarjeta madre es: "+computador.tarjetaMadre);
        System.out.println("Su tarjeta grafica es: "+computador.tarjetaGrafica);
        System.out.println("Los watts de la fuente son: "+computador.fuenteDePoder);
        System.out.println("Sus GB de almacenamiento son de: "+computador.Almacenamiento);
        System.out.println("Total de GB de ram: "+computador.ram);
        System.out.println("El modelo del case es: "+computador.caja);
        
        
    }
        
   }