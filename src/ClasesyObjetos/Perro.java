package ClasesyObjetos;

public class Perro {
    //Atributos

    String color;
    String raza;
    int velocidad;

    //Metodo
    public static void main(String[] args) {

        Perro perro = new Perro();

        //consumir
        perro.color = "Cafe";
        perro.raza = "Pastor Aleman";
        perro.velocidad = 15;

        //imprimir
        System.out.println("Color del perro es:" + perro.color);
        System.out.println("La raza del perro es:" + perro.raza);
        System.out.println("La velocidad del perro es:" + perro.velocidad);

    }

}
