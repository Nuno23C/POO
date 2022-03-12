package com.company;

public class Circulo {
    private double x;
    private double y;
    private double raio;

    /**
     * Construtor por omissão
     */
    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }

    /**
     * Construtor com valores passados como parametro
     * @param x coordenada x
     * @param y coordenada y
     * @param raio valor do raio
     */
    public Circulo(double x, double y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    /**
     * Consrtutor de cópia de um Círculo
     * @param umCirculo Circulo passado como parâmetro
     */
    public Circulo(Circulo umCirculo){
        this.x = umCirculo.getX();
        this.y = umCirculo.getY();
        this.raio = umCirculo.getRaio();
    }

    // 1. a)
    /**
     * Método que devolve o valor da coordenada x
     * @return valor de x
     */
    public double getX() {
        return this.x;
    }

    // 1. b)
    /**
     * Método que devolve o valor da coordenada y
     * @return valor de y
     */
    public double getY() {
        return this.y;
    }

    // 1. c)
    /**
     * Método que devolve o valor do raio
     * @return valor do raio
     */
    public double getRaio() {
        return this.raio;
    }

    // 1. d)

    /**
     * Métedo que altera o valor da variável x
     * @param x valor que vamos colocar em x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Métedo que altera o valor da variável y
     * @param y valor que vamos colocar em y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Métedo que altera o valor da variável raio
     * @param raio valor que vamos colar em raio
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }


    /**
     * Método que verifica se os dois Círculos são iguais
     * @param circulo Círculo passado como parâmetro
     * @return True se os círculos forem iguais | False se os círculos forem diferentes
     */
    public Boolean equals(Circulo circulo){
        return(this.x == circulo.getX() && this.y == circulo.getY() && this.raio == circulo.getRaio());
    }

    /**
     * Método que cria um clone do círculo
     * @param circulo Círculo passado como parâmetro
     * @return Clone do círculo passado como parâmetro
     */
    public Circulo clone(Circulo circulo){
        return new Circulo(this);
    }


    // 1. e)
    /**
     * Métedo que altera o centro do circulo
     * @param x valor de x para onde vamos mudar o centro do círculo
     * @param y valor de y para onde vamos mudar o centro do círculo
     */
    public void alteraCentro(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    // 1. f)
    /**
     * Métedo que determina a area do círculo
     * @return area do círculo
     */
    public double calculaArea() {
        double area = (Math.PI) * (Math.pow(this.raio,2));

        return area;
    }

    // 1. g)
    /**
     * Métedo que determina o perimetro do círculo
     * @return perimetro do círculo
     */
    public double calculaPerimetro() {
        double perimetro = (2 * Math.PI * this.raio);

        return perimetro;
    }
}
