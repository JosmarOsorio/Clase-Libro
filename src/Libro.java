// ejercicio 4 sumativa 1 .cpp : Programa que modela la clase libro, crea 2 objetos y los imprime por pantalla. Por: Josmar Osorio. Para: Programación II-UBA.

public class Libro { //Creamos la clase libro junto con las caracteristicas que queremos mostar
    private final String Titulo;
    private final String Autor;
    private final String Genero;
    private final int Anio;

    public Libro(String Titulo,String Autor, String Genero, int Anio){ //Creamos un construstructor libro para crear los valores de la clase libro
        this.Titulo= Titulo;
        this.Autor= Autor;
        this.Genero= Genero;
        this.Anio= Anio;
    }

    void mostar(){ //Creamos un metodo que imprima todas las caracteristicas de la clase libro

        System.out.println("Titulo: " + Titulo); //Imprimimos el titulo
        System.out.println("Autor: "+ Autor); //Imprimimos el autor
        System.out.println("Genero: "+ Genero); //Imprimimos el genero
        System.out.println("Año de publicacion: "+ Anio); //Imprimimos el año de publicacion
        System.out.println();

    }

    public static void main(String[] arg){ //Creamos un metodo para crear 2 objetos de tipo libro con cada uno de los valores que se declararon antes
        Libro Libro1 = new Libro("El principito","Antoine de Saint-Exupéry","Literatura infantil",1943);
        Libro Libro2 = new Libro("Cien años de soledad","Gabriel García Márquez","Realismo Magico",1967);
        Libro1.mostar(); //Llamamos al metodo mostar para que aparezca por pantalla la informacion
        Libro2.mostar();
    }
}
