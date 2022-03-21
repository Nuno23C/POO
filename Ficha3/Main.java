import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        // Exercicio 1
        Circulo circulo = new Circulo();

        // 1. a)
        double x = circulo.getX();
        out.println("Valor em x: " + x);

        // 1. b)
        double y = circulo.getY();
        out.println("Valor em y: " + y);

        // 2. c)
        double raio = circulo.getRaio();
        out.println("Valor do raio: " + raio);

        // 1. d
        circulo.setX(2);
        circulo.setY(2);
        circulo.setRaio(16);

        out.println("X: " + circulo.getX());
        out.println("Y: " + circulo.getY());
        out.println("Raio: " + circulo.getRaio());

        // 1. e)
        circulo.alteraCentro(10, 10);
        out.println("X: " + circulo.getX());
        out.println("Y: " + circulo.getY());

        // 1. f)
        out.println("Area: " + circulo.calculaArea());

        // 1. g)
        out.println("Perimetro: " + circulo.calculaPerimetro());
        */

        /*
        // Exercicio 3
        ArrayList<String> comentarios = new ArrayList<String>();
        comentarios.add("Bom video!");
        comentarios.add("Ya concordo...");
        Youtube youtube = new Youtube("10 coisas que ninguem quer saber","Ninguem quer saber", LocalDate.now(), 1080, 6, 360, comentarios, 34, 9);

        out.println("Exercicio 3");
        out.print("Alinea: ");
        String alinea = scan.next();

        switch (alinea) {
            case "b":
                // 3. b)
                out.print("Comentario a ser adicionado: ");
                String comentario = scan.next();
                youtube.insereComentario(comentario);

                for (int i = 0; i < comentarios.size(); i++) {
	                out.println(comentarios.get(i));
	            }

                break;

            case "e":
                // 3. c)
                out.println("Conteudo do video:");
                out.println(youtube.processa());
                break;
        }
    */

    /*
        Futebol futebol = new Futebol(2,2,3);
        int estado = futebol.getEstado();
        if (estado == 0) {
            out.println("Jogo por iniciar");
        } else if (estado == 1) {
            out.println("Jogo iniciado");
            out.println("Resultado:");
            out.print(futebol.resultadoAtual());
        } else {
            out.println("Jogo terminado.");
            out.println("Resultado:");
            out.print(futebol.resultadoAtual());
        }
    */


    }
}
