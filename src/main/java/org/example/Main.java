package org.example;

import org.example.entities.Alumno;
import org.example.entities.Curso;
import org.example.entities.Producto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("-".repeat(10));
        System.out.println("Ejercicio 1");
        System.out.println("-".repeat(10));

        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        Alumno a1 = new Alumno("Fernando", 7);
        Alumno a2 = new Alumno("Nahuel", 10);
        Alumno a3 = new Alumno("Joaco", 8);

        listaAlumnos.add(a1);
        listaAlumnos.add(a2);
        listaAlumnos.add(a3);

        for(Alumno a : listaAlumnos){
            System.out.println(a);
        }

        System.out.println("-".repeat(10));
        System.out.println("Ejercicio 2");
        System.out.println("-".repeat(10));

        Producto p1 = new Producto(1, "Banana");
        Producto p2 = new Producto(2, "Frutilla");
        Producto p3 = new Producto(3, "Kiwi");
        Producto p4 = new Producto(5, "Pera");
        Producto p5 = new Producto(1, "Manzana");

        HashSet<Producto> listaProductos = new HashSet<>();

        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        listaProductos.add(p4);
        listaProductos.add(p5);

        for(Producto p : listaProductos){
            System.out.println(p);
        }

        System.out.println("-".repeat(10));
        System.out.println("Ejercicio 3");
        System.out.println("-".repeat(10));

        Curso c1 = new Curso("Desarrollo de Software", "Alberto");
        Curso c2 = new Curso("Diseño de Sistemas", "Ana");
        Curso c3 = new Curso("Fisica 2", "Bonilla");

        HashMap<String, Curso> listaCursos = new HashMap<>();

        listaCursos.put("1", c1);
        listaCursos.put("2", c2);
        listaCursos.put("3", c3);

        System.out.println(listaCursos.get("1")); //Busca el primer curso

        for(Map.Entry<String, Curso> entrada : listaCursos.entrySet()){
            String clave = entrada.getKey();
            Curso valor = entrada.getValue();

            System.out.println("Clave: " + clave + " -> " + valor);
        }
    }
}