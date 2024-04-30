import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión en Java!");
        // System.out.println("Película Matrix");
        //Declaración de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnELPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Película: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Incluido en el plan: " + incluidoEnELPlanBasico);
        System.out.println("Sinopsis: " + sinopsis);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;

        System.out.println("Media de evaluación de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Película Popular en el momento");
        } else {
            System.out.println("Película Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la película " +
                "Matrix calculada por el Usuario fue: " + mediaEvaluacionUsuario / 3);
    }
}