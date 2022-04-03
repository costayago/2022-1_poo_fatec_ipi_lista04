// 1. Escreva uma classe para representar carros. Adicione a ela dois atributos e dois
// métodos que lhe pareçam razoáveis. Os dois atributos devem ser encapsulados.
// Escreva métodos getters/setters para cada um deles.
//-------------------------------------------------------------------------------------
//3. Rescreva a classe do exercício 1 adicionando a ela um construtor que recebe valores
//a serem atribuídos às duas variáveis de instância da classe carro

public class Carro{

    private String nome;
    private String marca;
    private String cor;
    private boolean motorLigado;
    private int velocidade;

    //construtor simples
    public Carro(){
        super();
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }

    public boolean isMotorLigado(){
        return motorLigado; 
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

}