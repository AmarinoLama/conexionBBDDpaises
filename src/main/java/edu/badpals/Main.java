package edu.badpals;

public class Main {

    public static void main(String[] args) {

        String separador = "---------------------------------";

        prueba1();
        System.out.println(separador);
        prueba2();
        System.out.println(separador);
        prueba3();
        System.out.println(separador);
        prueba4();

    }

    public static void prueba1() {
        System.out.println("prueba1");
        Conexion c = new Conexion();
        c.conectarseBBDD();
    }

    public static void prueba2() {
        System.out.println("prueba2");
        Conexion c = new Conexion();
        c.addDatos("España2", "47000000", "Madrid", "Euro");
        c.leerDatos();
    }

    public static void prueba3() {
        System.out.println("prueba3");
        Conexion c = new Conexion();
        c.addDatos("España2", "47000000", "Madrid", "Euro");
        c.modifyDatos("España2", "0", "madriles", "cubata");
        c.leerDatos();
    }

    public static void prueba4() {
        System.out.println("prueba4");
        Conexion c = new Conexion();
        c.addDatos("España2", "47000000", "Madrid", "Euro");
        c.leerDatos();
        c.deleteDatos("España2");
        c.leerDatos();
    }
}