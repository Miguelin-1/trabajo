import java.util.Scanner;

public class Main {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int num;

        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Sumar dos numeros");
            System.out.println("2. Multiplicar dos numeros");
            System.out.println("3. Elevar un numero a una potencia");
            System.out.println("4. Calcular el volumen de un cono");
            System.out.println("5. Calcular el factorial de un numero");
            System.out.println("6. Calcular el area de un cuadrado");
            System.out.println("7. Calcular el area de un circulo");
            System.out.println("8. Calcular el enesimo numero de Fibonacci");
            System.out.println("9. Salir");
            System.out.print("Escoja una opción del menu: ");

            num = leer.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Diga un numero para sumar:");
                    int a = leer.nextInt();
                    System.out.println("Diga otro numero para sumar:");
                    int b = leer.nextInt();
                    System.out.println("La suma resultante es: " + suma(a, b));
                    break;

                case 2:
                    System.out.println("Diga un numero para multiplicar:");
                    a = leer.nextInt();
                    System.out.println("Diga otro numero para multiplicar:");
                    b = leer.nextInt();
                    System.out.println("La multiplicación resultante es: " + mult(a, b));
                    break;

                case 3:
                    System.out.println("Dijite La Base de la potenciacion:");
                    System.out.println("Base: ");
                    int Base = leer.nextInt();
                    System.out.println("Potencia: ");
                    int Potencia = leer.nextInt();
                    System.out.println("El resultado de : " + Base + " a la potencia de " + Potencia + " Es igual a: " + exp(Base, Potencia, Base));

                case 4:
                    System.out.println("Escriba el radio de la base");
                    double r = leer.nextDouble();
                    System.out.println("Escirba la altura del cono");
                    double h = leer.nextDouble();
                    System.out.println("El volumen del cono es: " + areacon(r, h));
                case 5:
                    System.out.println("Escriba un numero para sacar su factorial");
                    int x = leer.nextInt();
                    System.out.println("El factorial de" + x + "es : " + facto(x));
                    break;
                case 6:
                    System.out.println("Escriba un lado del cuadrado");
                    int l = leer.nextInt();
                    System.out.println("El area del cuadrado es: " + areac(l));
                    break;
                case 7:
                    System.out.println("Escriba el radio del circulo");
                    r = leer.nextDouble();
                    System.out.println("El area del cuadrado es: " + areacir(r));
                    break;
                case 8:
                    System.out.println("Escriba un número para calcular su posicion en la sucesion de Fibonacci:");
                    int n = leer.nextInt();
                    System.out.println("El enesimo numero de Fibonacci es: " + fibo(n));
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intentalo de nuevo.");

            }
        } while (num != 9);
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int mult(int a, int b) {
        int m = 0;
        for (int i = 0; i < b; i++) {
            m =m+ a;
        }
        return m;
    }


    public static int exp(int Base, int Potencia, int Pot) {
        for (int i = 1; i < Potencia; i++) {
            Pot = Pot * Base;
        }
        return Pot;
    }
    public static int facto (int x){
        int n=1;
        for(int i=1;i<=x;i++) {
            n = n*i;
        }
        return n;
    }
    public static int areac(int l){

        return l*l;
    }

    public static double areacir(double r){
        double a=3.14159265358979323846;
        return  (r*a);
    }
    public static double areacon(double r,double h){
        double a=3.14159265358979323846;
        return r*r*h*a/3;
    }

    public static int fibo(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        int n1 = 1;
        int n2 = 0;
        int m = 0;
        for (int i = 3; i <= n; i++) {
            m = n1 + n2;
            n2 = n1;
            n1 = m;
        }

        return m;
    }

}
