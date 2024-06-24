public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        double salarioMinimo = 2500.00;

        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
        //necessario colocar F para float no final e L para long pq o JVM não infirir tipos diferentes

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // cast é para adptar o tipo

        // todo valor de uma variavel constante tem a palavra reservada final antes do nome da variavel é todo nome de variavel é em MAIUCULO
        final double VALOR_DO_PI = 3.14;


    }
}
