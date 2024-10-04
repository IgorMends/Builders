package entidades;

public class Veiculo {

    private String tipo = "";
    private String cor = "";
    private int rodas = 0;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "tipo='" + tipo + '\'' +
                ", cor='" + cor + '\'' +
                ", rodas=" + rodas +
                '}';
    }
}
