import br.com.alura.paradis_filmes.modelos.Filme;
import br.com.alura.paradis_filmes.modelos.Serie;
import br.com.alura.screnmatch.calculo.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {

        // Filme
        Filme meuFilme = new Filme();
        meuFilme.setNome("Interestelar");
        meuFilme.setAnoDeLancamento(2014);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Média de avaliações  do filme: " + meuFilme.pegaMedia());

        System.out.println("Total de avaliações do filme: " + meuFilme.getTotalDeAvaliacoes());


        // Série
        Serie dark = new Serie();
        dark.setNome("Dark");
        dark.setAnoDeLancamento(2017);
        dark.setDuracaoEmMinutos(50);
        dark.setTemporadas(3);
        dark.setAtiva(false);
        dark.setEpisodiosPorTemporada(10);
        dark.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Dark: " + dark.getDuracaoEmMinutos());

        // Filme
        Filme outroFilme = new Filme();
        outroFilme.setNome("Parasita");
        outroFilme.setAnoDeLancamento(2018);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(dark);
        System.out.println(calculadora.getTempoTotal());




    }
}
