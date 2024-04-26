package model;

public class AparelhoCelular implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String modelo;
    private String marca;
    private int anoFabricacao;
    private boolean ligado;

    public AparelhoCelular() {
    }

    public AparelhoCelular(String modelo, String marca, int anoFabricacao, boolean ligado) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.ligado = ligado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        this.ligado = true;
    }
    public void desligar() {
        this.ligado = false;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolhendo música...");
    }

    @Override
    public void fazerLigacao() {
        System.out.println("Fazendo ligação...");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Abrindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando novo aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
