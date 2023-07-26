package org.example;

public class Zoologico {
    public static void main(String[] args) {


        Animal mama = new Animal();
        mama.nombre="Cebra";
        mama.genero="F";


        Animal papa = new Animal();
        papa.nombre="Caballo";
        papa.genero="M";


        papa.encontrarPareja(mama);


        Familia familia = new Familia(papa,mama);


        familia.tenerHijo("Cebrallo");


        familia.imprimirFamilia("Caballo");




    }
}