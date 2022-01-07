package Tarea;

public class Jaimer{
    //Atributos (Definición de variables)
    String Altura;
    String Nacionalidad;
    String colorDeOjos;
    String Cabello;
    String colorDeCabello;
    int Edad;
    int CI;
    
    //Metodo (Secuencia de pasos)
    public static void main(String[] args){
        Jaimer jaimer = new Jaimer();
        
       //Consumir (Uso de variables) 
        jaimer.Altura="180";
        jaimer.Nacionalidad="Ecuatoriano";
        jaimer.colorDeOjos="Cafe";
        jaimer.Cabello="Ondulado";
        jaimer.colorDeCabello="Castaño";
        jaimer.Edad=20;
        jaimer.CI= 1315494276;
        
        //imprimir (Salida de los valores ingresados mensaje)
        System.out.println("Altura en cm: "+jaimer.Altura);
        System.out.println("Paiz de origen: "+jaimer.Nacionalidad);
        System.out.println("Color de ojos "+jaimer.colorDeOjos);
        System.out.println("Tipo de cabello: "+jaimer.Cabello);
        System.out.println("Color de cabello: "+jaimer.colorDeCabello);
        System.out.println("Edad: "+jaimer.Edad);
        System.out.println("Numero de Cedula: "+jaimer.CI);
        
        
    }
        
   }