package CreadorDeDatos;

import java.security.SecureRandom;

public class GeneraDatos {
    
    
    private SecureRandom aleatorio;

    public GeneraDatos() {

        aleatorio = new SecureRandom();

    }

    public char[] generarArrayCaracteres(int longitud) {

        char [] caracteres = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            caracteres[i] = (char) (aleatorio.nextInt(26) + 'a');
        }
        return caracteres;

    }

    public String generarCadenaCaracteres(int longitud) {

        char [] caracteres = generarArrayCaracteres(longitud);
        return new String(caracteres);

    }

    public byte[] generarSecuenciaDeBytes(int longitud) {

        byte[] bytes = new byte[longitud];
        aleatorio.nextBytes(bytes);
        return bytes;

    }
    
}
