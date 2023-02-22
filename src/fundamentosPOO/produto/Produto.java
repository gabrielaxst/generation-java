package fundamentosPOO.produto;

public class Produto {
    private String tipoDeJogo;
    private String marcaComputador;
    private String marcaVideoGame;
    private String fantasiaPersonagem;
    private String camisaPersonagem;

    public Produto(String tipoDeJogo, String marcaComputador, String marcaVideoGame, String fantasiaPersonagem, String estampaPersonagem) {
        this.tipoDeJogo = tipoDeJogo;
        this.marcaComputador = marcaComputador;
        this.marcaVideoGame = marcaVideoGame;
        this.fantasiaPersonagem = fantasiaPersonagem;
        this.camisaPersonagem = estampaPersonagem;
    }

    public String getTipoDeJogo() {
        return tipoDeJogo;
    }

    public void setTipoDeJogo(String tipoDeJogo) {
        this.tipoDeJogo = tipoDeJogo;
    }

    public String getMarcaComputador() {
        return marcaComputador;
    }

    public void setMarcaComputador(String marcaComputador) {
        this.marcaComputador = marcaComputador;
    }

    public String getMarcaVideoGame() {
        return marcaVideoGame;
    }

    public void setMarcaVideoGame(String marcaVideoGame) {
        this.marcaVideoGame = marcaVideoGame;
    }

    public String getFantasiaPersonagem() {
        return fantasiaPersonagem;
    }

    public void setFantasiaPersonagem(String fantasiaPersonagem) {
        this.fantasiaPersonagem = fantasiaPersonagem;
    }

    public String getCamisaPersonagem() {
        return camisaPersonagem;
    }

    public void setCamisaPersonagem(String camisaPersonagem) {
        this.camisaPersonagem = camisaPersonagem;
    }
    public String visualizar(){
        return String.format("\tProdutos escolhidos->\nTipo de jogo: %s\nMarca PC: %s\nMarca Video-Game: %s\nFantasia do personagem: %s\nCamiseta do Personagem: %s",
                getTipoDeJogo(), getMarcaComputador(), getMarcaVideoGame(), getFantasiaPersonagem(), getCamisaPersonagem());
    }
}
