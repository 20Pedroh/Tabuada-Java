import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Bem Vindo");
        int valor;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor ou 0 para sair");
        valor = teclado.nextInt();
        do{
        /*Estrutura de repetição FOR:
         * i=0 representa o inicio
         * i=10 representa o fim
         * i++ represenra incremento*/
        System.out.println("Resultado da tabuada de:" + valor);
        for (int i = 0; i <= 10;i++){
            System.out.println(valor + "x" + i + "=" + (valor*i) );
        }
        valor = teclado.nextInt();
    }while(valor !=0);  
    }
}
