import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in); 

    public Objpunto7[][] LlenarMatriz(Objpunto7[][]matriz){
          
          for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
              Objpunto7 o = new Objpunto7();
              
              System.out.println("-------------CALIFICACIONES--------------------");
              System.out.println("Por favor Ingrese el nombre del estudiante: ");
              o.setNombre(sc.next());
              System.out.println("Por favor Ingrese el apellido del estudiante: ");
              o.setApellido(sc.next());
              System.out.println("Por favor Ingrese la nota del estudiante: ");
              o.setCalificacion(sc.nextDouble());       
              System.out.println("Por favor Ingrese el carnet del estudiante: ");
              o.setCarnet(sc.nextDouble());
              System.out.println("Ingrese por favor el Semestre del estudiante: ");
              o.setSemestre(sc.nextInt());

              if (o.getCalificacion()>= 4.0) {
                System.out.println("FELICIDADES SU PROMEDIO ESTA POR ENCIMA DE 4.0");

                
              }else if (o.getCalificacion()<4.0 && o.getCalificacion()>=3.0) {
                System.out.println("ESTAS BIEN PERO TEN CUIDADO TU PROMEDIO ESTA ENTRE 4.0 Y 3.0");
                
              } else {
                System.out.println("UYYY QUE PENA TU PROMEDIO ESTA EN MENOS DE 3.0");
                
              }

              matriz[i][j]=o;

            }
        }
        
        return matriz;

      
    }

    public void MostrarMatriz(Objpunto7[][]m){
      for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m.length; j++) {
                System.out.println("El nombre de el estudiantes: "+m[i][j].getNombre());
                System.out.println("El apellido del estudiante es: "+m[i][j].getApellido());
                System.out.println("La nota Ingresada es de: "+m[i][j].getCalificacion());
                System.out.println("El carnet del estudiante es: "+m[i][j].getCarnet());
                System.out.println("El Semestre ingresado es: "+m[i][j].getSemestre());

        }
      }

          System.out.println("ingrese el promedio a buscar");
         Double buscar = sc.nextDouble();
        
        boolean encontrado = false;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                if (m[i][j].getCalificacion()>= buscar) {
                    System.out.println("el promedio que usted busco esta en la fila :" + i + " y en la columna: " + j);

                    encontrado = true;

                } else if (m[i][j].getCalificacion()<buscar && m[i][j].getCalificacion()>=buscar) {
                  System.out.println("el promedio que usted busco esta en la fila :" + i + " y en la columna: " + j);

                    encontrado = true;
                }else{
                  System.out.println("el promedio que usted busco esta en la fila :" + i + " y en la columna: " + j);

                    encontrado = true;
                }

                if (!encontrado) {
                    System.out.println("promedio  no encontrado");
                }

            }
        }
    }
}
