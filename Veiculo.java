abstract class Veiculo{
    public abstract void mover();
}
class Carro extends Veiculo{
    public void mover(){
        System.out.println("O carro está dirigindo");
    }
}
class Bicicleta extends Veiculo{
    public void mover(){
        System.out.println("A bicicleta está pedalando");
    }
}
class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Bicicleta b1 = new Bicicleta();
        c1.mover();
        b1.mover();
    }
}