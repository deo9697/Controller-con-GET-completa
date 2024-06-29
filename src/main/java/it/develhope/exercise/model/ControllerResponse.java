package it.develhope.exercise.model;

public class ControllerResponse {

    public String nome;

    public String provincia;

    public String saluto;

    public ControllerResponse(String nome, String provincia, String saluto) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = saluto;
    }

    public ControllerResponse() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getSaluto() {
        return saluto;
    }

    public void setSaluto(String saluto) {
        this.saluto = saluto;
    }

    @Override
    public String toString() {
        return "ControllerResponse{" +
                "nome='" + nome + '\'' +
                ", provincia='" + provincia + '\'' +
                ", saluto='" + saluto + '\'' +
                '}';
    }

}
