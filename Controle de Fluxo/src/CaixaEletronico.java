public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        //Fluxo Condicional Simples

        if (valorSolicitado < saldo){
            saldo=saldo - valorSolicitado;

        }
        System.out.println(saldo);
    }
}
