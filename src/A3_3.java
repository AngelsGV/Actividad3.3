import java.util.Scanner;
public class A3_3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Dame un número positivo y te lo separaré por guarismos: ");
    int num = sc.nextInt();

        if (num < 0) {
            System.out.println("El número ingresado no es positivo.");
        } else {
            System.out.println("Los dígitos del número son:");
            while (num > 0) { //Para abrir el bucle debe ser positivo.
                int digito = num % 10;
                // Se utiliza para obtener el dígito más a la derecha de un número entero.
                System.out.println(digito);
                num /= 10;
                //para eliminar el dígito más a la derecha de un número
                //y preparar el número para el próximo ciclo del bucle.
            }
        }
    }
}

