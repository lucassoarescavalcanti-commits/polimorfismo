class Calculadora{
    public void somar(int a, int b){
        System.out.println(a+b);
    }
    public void somar(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void somar(double a, double b ){
        System.out.println(a+b);
    }
}
class Main {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        c1.somar(1, 2);
        c1.somar(1, 2, 3);
        c1.somar(1.5, 2.7);
    }
}