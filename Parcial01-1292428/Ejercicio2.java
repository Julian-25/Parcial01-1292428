import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra para cambiar sus vocales por letras");
        String ENTRADA = scanner.nextLine();

        char []Caracteres = ENTRADA.toCharArray();
        int  LONGITUD_PALABRA = Caracteres.length;
        for( int i = 0; i < LONGITUD_PALABRA; i++)
        if (Caracteres[i] == 'a' || Caracteres[i] == 'e' || Caracteres[i] == 'i' ||
        Caracteres[i] == 'o' || Caracteres[i] == 'u' ||
        Caracteres[i] == 'A' || Caracteres[i] == 'E' || Caracteres[i] == 'I' ||
        Caracteres[i] == 'O' || Caracteres[i] == 'U') {
        Caracteres[i] = (String)@;
    }
    String  PALABRA_MODIFICADA = String.valueOf(Caracteres);
    System.out.println(PALABRA_MODIFICADA);
    }
}
