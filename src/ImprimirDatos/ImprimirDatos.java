package ImprimirDatos;


import CreadorDeDatos.GeneraDatos;
import CreadorDeDatos.ImplementaMinimoMaximo;


public class ImprimirDatos {
    
     public ImprimirDatos() {
        
        GeneraDatos generador = new GeneraDatos();
        ImplementaMinimoMaximo<Integer> implementacionEnteros = new ImplementaMinimoMaximo<>(generador);
        ImplementaMinimoMaximo<Character> implementacionCaracteres = new ImplementaMinimoMaximo<>(generador);
        ImplementaMinimoMaximo<String> implementacionCadenas = new ImplementaMinimoMaximo<>(generador);

        Integer[] enteros = new Integer[9];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = generador.generarCadenaCaracteres(1).charAt(0) - 'a' + 1;
        }

        Character[] caracteres = new Character[9];
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = generador.generarArrayCaracteres(1)[0];
        }

        String[] cadenas = new String[9];
        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = generador.generarCadenaCaracteres(3);
        }

        Integer maximoEnteros = implementacionEnteros.maximo(enteros);
        Integer minimoEnteros = implementacionEnteros.minimo(enteros);

        Character maximoCaracteres = implementacionCaracteres.maximo(caracteres);
        Character minimoCaracteres = implementacionCaracteres.minimo(caracteres);

        String maximoCadenas = implementacionCadenas.maximo(cadenas);
        String minimoCadenas = implementacionCadenas.minimo(cadenas);

        // Mostrar resultados
        System.out.println("Valores enteros: " + java.util.Arrays.toString(enteros));
        System.out.println("Maximo de enteros: " + maximoEnteros);
        System.out.println("Minimo de enteros: " + minimoEnteros);

        System.out.println("Caracteres: " + java.util.Arrays.toString(caracteres));
        System.out.println("Maximo de caracteres: " + maximoCaracteres);
        System.out.println("Minimo de caracteres: " + minimoCaracteres);

        System.out.println("Cadenas: " + java.util.Arrays.toString(cadenas));
        System.out.println("Maximo de cadenas: " + maximoCadenas);
        System.out.println("Minimo de cadenas: " + minimoCadenas);
    }
    
}
