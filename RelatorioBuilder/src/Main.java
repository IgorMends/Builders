import builder.RelatorioBuilder;
import entidades.Relatorio;

public class Main {
    public static void main(String[] args) {

        Relatorio relatorio = new RelatorioBuilder().setTitulo("Pindamonhagaba").setCorpo("Pindamonhangaba").setRodape("PindamonhangabaCredits").build();

        System.out.println(relatorio.toString());
    }
}