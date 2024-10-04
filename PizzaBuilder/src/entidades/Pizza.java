package entidades;

public class Pizza {

    private String massa = "";
    private String tamanho = "";
    private String ingrediente = "";

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "massa='" + massa + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", ingrediente='" + ingrediente + '\'' +
                '}';
    }

}
