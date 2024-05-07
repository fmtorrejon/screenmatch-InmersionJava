import calculos.CalculadoraDeTiempos;
import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {

    Pelicula peliculaUsuario = new Pelicula();
    Serie serieUsuario = new Serie();
    CalculadoraDeTiempos calculadoraDeTiempos = new CalculadoraDeTiempos();

    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                    Bienvenido(a) a Screenmatch
                    1) Registrar nueva película
                    2) Registrar nueva serie
                    3) Calculadora de tiempo
                    
                    9) Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la película");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la película");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos de la película");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();

                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    calculadoraDeTiempos.incluye(peliculaUsuario);
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la serie");
                    String nombreSerie = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la serie");
                    int fechaDeLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingrese el número de temporadas para esta serie");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingrese la cantidad de episodios por cada temporada");
                    int episodiosPorTemporada = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingrese la duración en minutos de cada episodio");
                    int minutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();

                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    serieUsuario.setEpisodiosPorTemporada(episodiosPorTemporada);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setDuracionEnMinutosPorEpisodio(minutosPorEpisodio);
                    serieUsuario.muestraFichaTecnica();
                    calculadoraDeTiempos.incluye(serieUsuario);

                    break;
                case 3:
                    System.out.println("Tiempo que necesitas para maratonear tus títulos favoritos: "+
                            calculadoraDeTiempos.getTiempoTotal() + " minutos");
                    System.out.println("------------");
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

    }


}
