public class Operadores {
    public static void main(String[]args){

       int numero1 = 1;
       int numero2 = 2;

       boolean simNao = numero1 == numero2;
       
        System.out.println("Numero1 é igual a numero2 ? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero1 é diferente a numero2 ? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero1 é maior do que o numero2 ? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("Numero1 é menor do que o numero2 ? " + simNao);
    }
    
}
