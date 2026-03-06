import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese la dimension de la matriz:");
        int n=sc.nextInt();
        Metodos m =new Metodos();
        Objpunto7[][]Mo= new Objpunto7[n][n];
        Mo=m.LlenarMatriz(Mo);
        m.MostrarMatriz(Mo);;
    }
}
