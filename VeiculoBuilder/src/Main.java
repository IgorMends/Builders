import builder.VeiculoBuilder;
import entidades.Veiculo;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new VeiculoBuilder().setTipo("Ret").setCor("Prata").setRodas(4).build();

        System.out.println(veiculo.toString());

    }
}