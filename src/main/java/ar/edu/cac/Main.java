package ar.edu.cac;

import java.util.*;

public class Main {

    public static <LinkedList> void main(String[] args) {
        // Ejercicio 1
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);

        int suma = 0;
        for (int numero: numeros) {
            suma += numero;
        }

        System.out.println("La suma de los numeros es: " + suma);


        // Ejercicio 2

        // Crea un ArrayList de cadenas de caracteres y muestra por pantalla la longitud de la cadena más larga

        ArrayList<String>cadenas = new ArrayList<String>();
        cadenas.add("Hola");
        cadenas.add("Mundo");
        cadenas.add("Codo a Codo");

        int longitud = 0;

        for (String cadena: cadenas) {
            if (cadena.length() > longitud) {
                longitud = cadena.length();
            }
        }

        System.out.println("La longitud de la cadena mas larga es: " + longitud);

        // Ejercicio 3: Crea un HashMap con parejas de valores de tipo String (clave) y Integer (valor) y muestra por
        // pantalla el valor correspondiente a una clave determinada

        HashMap<String, Integer> valores = new HashMap<>();
        valores.put("Uno", 1);
        valores.put("Dos", 2);
        valores.put("Tres", 3);

        String clave = "Dos";
        int valor = valores.get(clave);

        System.out.println("El valor correspondiente a la clave " + clave + " es: " + valor);


        // Ejercicio 4:Crea un HashSet de números enteros y muestra por pantalla el número más grande

        HashSet<Integer> numerosSet = new HashSet<>();
        numerosSet.add(5);
        numerosSet.add(10);
        numerosSet.add(15);

        int maximo = 0;

        for (int numero: numerosSet) {
            if (numero > maximo){
                maximo = numero;
            }
        }

        System.out.println("El numero mas grande es: " + maximo);



          // Ejercicio 5: Crea una pila Stack de números enteros y muestra por pantalla si está vacía o no

        Stack<Integer> numerosStack = new Stack<>();
        numerosStack.push(5);
        numerosStack.push(10);
        numerosStack.push(15);

        if (numerosStack.empty()) {
            System.out.println("La pila esta vacía");
        } else{
            System.out.println("La pila no esta vacía");
        }



        // Ejercicio 6: Crea un HashSet de cadenas de caracteres y muestra por pantalla todas las cadenas que empiezan
        // por una letra determinada (pasada como parámetro)

        HashSet<String> cadenasSet = new HashSet<>();
        cadenasSet.add("Hola");
        cadenasSet.add("Hola Mundo");
        cadenasSet.add("Codo a Codo");

        char letra = 'H';

        for (String cadena: cadenasSet) {
            if (cadena.charAt(0) == letra){
                System.out.println(cadena);
            }
        }


        // Ejercicio 7: Crea una pila Stack de cadenas de caracteres y muestra por pantalla
        // el contenido de la pila en orden inverso

        Stack<String> pila = new Stack<>();
        pila.push("uno");
        pila.push("dos");
        pila.push("tres");
        pila.push("cuatro");

        System.out.println("Contenido de la pila: ");
        System.out.println(pila);

        System.out.println("Contenido de la pila invertido: ");
        while (!pila.empty()){
            System.out.println(pila.pop());
        }


    }

}