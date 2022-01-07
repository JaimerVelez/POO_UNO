package Tarea;

public class Casa{
    //Atributos (Definición de variables)
    String Metros;
    String Pisos;
    String Patio;
    String Parqueadero;
    int Baños;
    int cuartos;
    int conectoresPorCuarto;
    
    //Metodo (Secuencia de pasos)
    public static void main(String[] args){
        Casa casa = new Casa();
        
       //Consumir (Uso de variables) 
        casa.Metros="160";
        casa.Pisos="2";
        casa.Patio="si";
        casa.Baños=2;
        casa.cuartos=4;
        casa.Parqueadero="si";
        casa.conectoresPorCuarto= 3;
        
        //imprimir (Salida de los valores ingresados mensaje)
        System.out.println("Total de Mt de la casa: "+casa.Metros);
        System.out.println("Pisos de la casa: "+casa.Pisos);
        System.out.println("¿La casa posee patio?: "+casa.Patio);
        System.out.println("Total de baños: "+casa.Baños);
        System.out.println("Total de Habitaciones de la casa: "+casa.cuartos);
        System.out.println("¿La casa posee un parqueadero?: "+casa.Parqueadero);
        System.out.println("Conectores de electricidad en cada cuarto: "+casa.conectoresPorCuarto);
        
        
    }
        
   }