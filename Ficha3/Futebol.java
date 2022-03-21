public class Futebol {
    private int estado; // 0 - por iniciar | 1 - a decorrer | 2 - terminado
    private int golosEquipaVisitada;
    private int golosEquipaVisitante;

    public int getEstado() {
        return this.estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getGolosEquipaVisitada() {
        return this.golosEquipaVisitada;
    }

    public void setGolosEquipaVisitada(int golosEquipaVisitada) {
        this.golosEquipaVisitada = golosEquipaVisitada;
    }

    public int getGolosEquipaVisitante() {
        return this.golosEquipaVisitante;
    }

    public void setGolosEquipaVisitante(int golosEquipaVisitante) {
        this.golosEquipaVisitante = golosEquipaVisitante;
    }

    public Futebol() {
        this.estado = 0;
        this.golosEquipaVisitada = 0;
        this.golosEquipaVisitante = 0;
    }

    public Futebol(int estado, int golosEquipaVisitado, int golosEquipaVisitante) {
        this.estado = estado;
        this.golosEquipaVisitada = golosEquipaVisitado;
        this.golosEquipaVisitante = golosEquipaVisitante;
    }

    public Futebol(Futebol jogo) {
        this.estado = jogo.getEstado();
        this.golosEquipaVisitada = jogo.getGolosEquipaVisitada();
        this.golosEquipaVisitante = jogo.getGolosEquipaVisitante();
    }

    public Futebol clone(){
        return new Futebol(this);
    }

    // 5. a)
    /**
     * Acaba o jogo.
     */
    public void startGame() {
        this.setEstado(1);
        this.setGolosEquipaVisitada(0);
        this.setGolosEquipaVisitante(0);
    }

    // 5. b)
    /**
     * Acaba o jogo.
     */
    public void endGame() {
        this.setEstado(2);
    }

    // 5. c)
    /**
     * Adiciona um golo à equipa visitada.
     */
    public void goloVisitado() {
        this.golosEquipaVisitada++;
    }

    // 5. d)
    /**
     * Adiciona um golo à equipa visitante.
     */
    public void goloVisitante() {
        this.golosEquipaVisitante++;
    }

    // 5. e)
    /**
     * Método que imprime o resultado do jogo.
     * @return resultado do jogo.
     */
    public String resultadoAtual() {
        return ("Equipa Visitada = " + getGolosEquipaVisitada() + "\nEquipa Visitante = " + getGolosEquipaVisitante());
    }
}
