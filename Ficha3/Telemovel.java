import java.util.ArrayList;

public class Telemovel {
    private String marca;
    private String modelo;
    private int displayX;
    private int displayY;
    private int capacidadeMsg;
    private ArrayList<String> mensagens;
    private int capacidadeFotosApps;
    private int capacidadeFotos;
    private int capacidadeApps;
    private int espacoOcupado;
    private int numFotosGuardadas;
    private int numAppsInstaladas;
    private ArrayList<String> nomeAppsInstaladas;

    /**
     * Construtor por omissão
     */
    public Telemovel() {
        this.marca = "None";
        this.modelo = "None";
        this.displayX = 0;
        this.displayY = 0;
        this.capacidadeMsg = 0;
        this.mensagens = new ArrayList<>(capacidadeMsg);
        this.capacidadeFotosApps = 0;
        this.capacidadeFotos = 0;
        this.capacidadeApps = 0;
        this.espacoOcupado = 0;
        this.numFotosGuardadas = 0;
        this.numAppsInstaladas = 0;
        this.nomeAppsInstaladas = new ArrayList<>(capacidadeApps);
    }

    /**
     * Construtor com valores passados como parametro
     * @param marca marca do telemovel
     * @param modelo modelo do telemovel
     * @param displayX comprimento do display
     * @param displayY altura do display
     * @param numeroMensagens numero de mensagens no telemovel
     * @param capFotosApps armazenamento para aplicações
     * @param capFotos armazenamento para fotos
     * @param capApps armazenamento para aplicações
     */
    public Telemovel(String marca, String modelo, int displayX, int displayY, int numeroMensagens, int capFotosApps, int capFotos, int capApps, int capTotal){
        this.marca = marca;
        this.modelo = modelo;
        this.displayX = displayX;
        this.displayY = displayY;
        this.capacidadeMsg = 0;
        this.mensagens = new ArrayList<>(capacidadeMsg);
        this.capacidadeFotosApps = capFotosApps;
        this.capacidadeFotos = capFotos;
        this.capacidadeApps = capApps;
        this.espacoOcupado = 0;
        this.numFotosGuardadas = 0;
        this.numAppsInstaladas = 0;
        this.nomeAppsInstaladas = new ArrayList<>(capacidadeApps);
    }

    /**
     * Construtor de cópia de Telemovel.
     */
    public Telemovel(Telemovel t){
        this.marca = t.getMarca();
        this.modelo = t.getModelo();
        this.displayX = t.getDisplayX();
        this.displayY = t.getDisplayY();
        this.capacidadeMsg = t.getCapacidadeMsg();
        this.capacidadeFotos = t.getCapacidadeFotos();
        this.capacidadeApps = t.getCapacidadeApps();
        this.capacidadeFotosApps = t.getCapacidadeFotosApps();
        this.capacidadeFotos = t.getCapacidadeFotos();
        this.numAppsInstaladas = t.getNumAppsInstaladas();
        this.nomeAppsInstaladas = t.getNomeAppsInstaladas();
        this.mensagens = new ArrayList<>(t.getMenssagens().size());
        this.espacoOcupado = t.getEspacoOcupado();
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getDisplayX(){
        return this.displayX;
    }

    public int getDisplayY(){
        return this.displayY;
    }

    public int getCapacidadeMsg(){
        return this.capacidadeMsg;
    }

    public int getCapacidadeFotos(){
        return this.capacidadeFotos;
    }

    public int getCapacidadeApps(){
        return this.capacidadeApps;
    }

    public int getCapacidadeFotosApps(){
        return this.capacidadeFotos + this.capacidadeApps;
    }

    public int getNumFotosGuardadas(){
        return this.numFotosGuardadas;
    }

    public int getNumAppsInstaladas(){
        return this.numAppsInstaladas;
    }

    public int getEspacoOcupado(){
        return this.espacoOcupado;
    }

    public ArrayList<String> getNomeAppsInstaladas(){
        return this.nomeAppsInstaladas;
    }

    public ArrayList<String> getMenssagens(){
        return this.mensagens;
    }

    public void setMarca(String m){
        this.marca = m;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public void setDisplayX(int x){
        this.displayX = x;
    }

    public void setDisplayY(int y){
        this.displayY = y;
    }

    public void setCapacidadeMsg(int cap){
        this.capacidadeMsg = cap;
    }

    public void setCapacidadeFotos(int cap){
        this.capacidadeFotos = cap;
    }

    public void setCapacidadeApps(int cap){
        this.capacidadeApps = cap;
    }

    public void setCapacidadeFotosApps(int cap){
        this.capacidadeFotosApps = cap;
    }

    public void setEspacoOcupado(int espaço){
        this.espacoOcupado = espaço;
    }

    public void setNumFotos(int num){
        this.numFotosGuardadas = num;
    }

    public void setNumApps(int num){
        this.numAppsInstaladas = num;
    }

    public void setNomesApps(int numApps, ArrayList<String> Apps){
        this.numAppsInstaladas = numApps;
        this.nomeAppsInstaladas = new ArrayList<>(numAppsInstaladas);
        this.nomeAppsInstaladas.addAll(Apps);
    }

    public void setMensagens(int numMensagens, ArrayList<String> msg){
        this.capacidadeMsg = numMensagens;
        this.mensagens = new ArrayList<>(numMensagens);
        this.mensagens.addAll(msg);
    }

    /**
     * Método que devolve a representação do telemóvel em formato de texto.
     * @return String com as características do telemóvel.
     */
    public String toString(){
        return "Marca: " + this.marca + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "DisplayX: " + this.displayX + "\n" +
                "DisplayY: " + this.displayY + "\n" +
                "CapacidadeMsg: " + this.capacidadeMsg + "\n" +
                "CapacidadeFotos: " + this.capacidadeFotos + "\n" +
                "CapacidadeApps: " + this.capacidadeApps + "\n" +
                "CapacidadeFotosApps: " + this.capacidadeFotosApps + "\n" +
                "Espaço Ocupado: " + this.espacoOcupado + "\n" +
                "NumFotos: " + this.numFotosGuardadas + "\n" +
                "NumApps: " + this.numAppsInstaladas + "\n" +
                "NomesApps: " + this.nomeAppsInstaladas + "\n" +
                "Mensagens: " + this.mensagens + "\n";
    }

    /**
     * Método que cria uma cópia do telémovel recetor da mensagem.
     * @return cópia do telemóvel original.
     */
    public Telemovel clone(){
        return new Telemovel(this);
    }

    // 2. a)
    public boolean existeEspaco(int numeroBytes) {
        int espacoLivre = this.capacidadeFotosApps - this.espacoOcupado;
        if (numeroBytes <= espacoLivre)
            return true;
        else
            return false;
    }

    // 2. b)
    public void instalaApp(String nome, int tamanho) {
        if(existeEspaco(tamanho)) {
            this.numAppsInstaladas++;
            this.nomeAppsInstaladas.add(nome);
            this.espacoOcupado += tamanho;
            this.capacidadeApps += tamanho;
        } else {
            System.out.println("Não existe espaço para instalar essa aplicação.");
        }
    }

    // 2. c)
    public void recebeMsg(String msg) {
        if(existeEspaco(msg.length())) {
            this.mensagens.add(msg);
            this.espacoOcupado += msg.length();
            this.capacidadeMsg += msg.length();
        }
    }

    // 2. d)
    public double tamMedioApps() {
        double tamMedio = (this.capacidadeApps / this.numAppsInstaladas);
        return tamMedio;
    }

    // 2. e)



}
