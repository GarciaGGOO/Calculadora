package calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        // Criando uma instância da classe OperacaosMatecaticas
        OperacaosMatecaticas calculadora = new OperacaosMatecaticas();
        
        // Exemplo de chamada ao método somar
        double resultadoSoma = calculadora.somar(5, 3);
        System.out.println("Resultado da soma: " + resultadoSoma);
        
        // Exemplo de chamada ao método subtrair
        int resultadoSubtracao = (int) calculadora.subtrair(8, 2);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
        
        // Exemplo de chamada ao método multiplicar
        int resultadoMultiplicacao = (int) calculadora.multiplicar(4, 6);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
        
        // Exemplo de chamada ao método dividir
        try {
            double resultadoDivisao = calculadora.dividir(10, 2);
            System.out.println("Resultado da divisão: " + resultadoDivisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro ao dividir: " + e.getMessage());
        }
    }
}
