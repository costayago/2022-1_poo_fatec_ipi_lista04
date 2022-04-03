/* 2. Escreva uma classe de teste que:
2.1 Instancia dois veículos.
2.2 Obtém valores para seus atributos e os atribui adequadamente.
2.3 Chama cada um dos métodos que você criou.
2.4 Exibe os valores das variáveis, usando os métodos getters. */


public class Principal {
    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        c1.setNome("Compass");
        c1.setMarca("Jeep");
        c1.setCor("Branco");
        c1.setMotorLigado(false);
        c1.setVelocidade(0);

        Carro c2 = new Carro();
        c2.setNome("Argo");
        c2.setMarca("Fiat");
        c2.setCor("Branco");
        c2.setMotorLigado(true);
        c2.setVelocidade(45);

        Carro c3 = new Carro();
        c3.setNome("Fusca");
        c3.setMarca("Volkswagen");

        System.out.println("----CARRO 1----");
        System.out.println("Nome: " + c1.getNome() + "\nMarca: " + c1.getMarca() +
         " \nCor: " + c1.getCor() + "\nMotor esta ligado ? - " + c1.isMotorLigado() + 
         "\nVelocidade: " + c1.getVelocidade() );  

        System.out.println("----CARRO 2----");
        System.out.println("Nome: " + c2.getNome() + "\nMarca: " + c2.getMarca() 
        + " \nCor: " + c2.getCor() + "\nMotor esta ligado ? - " + c2.isMotorLigado() +
        "\nVelocidade: " + c2.getVelocidade());

        System.out.println("----CARRO 3----");
        System.out.println("Nome: " + c3.getNome() + "\nMarca: " + c3.getMarca());
        }
    }
