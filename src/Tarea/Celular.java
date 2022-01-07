package Tarea;

public class Celular{
    //Atributos (Definición de variables)
    String color;
    String modelo;
    String sistema;
    int bateria;
    int memoria;
    int ram;
    int camara;
    //Metodo (Secuencia de pasos)
    public static void main(String[] args){
        Celular celular = new Celular();
        
       //Consumir (Uso de variables) 
        celular.color="Negro";
        celular.modelo="Huawei";
        celular.sistema="Android";
        celular.bateria=3340;
        celular.memoria=64;
        celular.ram=4;
        celular.camara= 16;
        
        //imprimir (Salida de los valores ingresados mensaje)
        System.out.println("Color del Celular es: "+celular.color);
        System.out.println("El modelo es: "+celular.modelo);
        System.out.println("Su sistema operativo es: "+celular.sistema);
        System.out.println("Los mAh son: "+celular.bateria);
        System.out.println("Sus GB de almacenamiento son de: "+celular.memoria);
        System.out.println("Total de GB de ram: "+celular.ram);
        System.out.println("Pixeles de la camara: "+celular.camara);
        
        
    }
        
   }
    
    
