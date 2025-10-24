import java.util.Scanner;
import java.util.ArrayList;
public class Start {
    public static void main(String[] args) {
        // rememeber fast 
        System.out.println("Começando tudo de novo com um bloco para cada tópico.");

        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o seu nome ?");
        String nome =input.nextLine();
        System.out.printf("Bem vindo %s",nome);

        //Array & loop While
        ArrayList <Integer>numeros = new ArrayList<>();
        System.out.println("Digite  números");
        int i = 0;
        while (i < 10){
            numeros.add(input.nextInt());
        } 
        System.out.printf("Os números digitados foram :%s",numeros);
        input.close();
        
    }
}