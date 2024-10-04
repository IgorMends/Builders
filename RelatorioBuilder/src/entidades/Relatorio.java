package entidades;

public class Relatorio {

    private String titulo = "";
    private String corpo = "";
    private String rodape = "";

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public String getRodape() {
        return rodape;
    }

    public void setRodape(String rodape) {
        this.rodape = rodape;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "titulo='" + titulo + '\'' +
                ", corpo='" + corpo + '\'' +
                ", rodape='" + rodape + '\'' +
                '}';
    }
}
