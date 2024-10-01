import java.util.Scanner;
public class Ejercicio1 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un numero para saber si es primo");
        int NUMERO_USUARIO = scanner.nextInt();
        if(NUMERO_USUARIO <= 0 ){
            System.out.println("Ingrese un numero positivo");
            NUMERO_USUARIO = scanner.nextInt();
        }
        for(int i = 0; i <= NUMERO_USUARIO ; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }else{

            }
        }
    }
}
