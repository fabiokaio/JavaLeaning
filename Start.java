import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class Start {
    public static void main(String[] args) {
        // rememeber fast 
        System.out.println("Começando tudo de novo com um bloco para cada tópico.");

        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o seu nome ?");
        String nome =input.nextLine();
        System.out.printf("Bem vindo %s%n",nome);

        //Array & loop While
        ArrayList <Integer>numeros = new ArrayList<>();
        System.out.println("Digite  números");
        int i = 0;
        while (i < 10){
            numeros.add(input.nextInt());
            i++;
        } 
        System.out.printf("Os números digitados foram :%s%n",numeros);
        
        

        // Mine disafio
        // mostrar a soma e média da soma entre os valores de notas e moedas brasileiras 
        HashMap <String, Float> notas = new HashMap<>();
        notas.put("nota200", 200f);
        notas.put("nota100", 100f);
        notas.put("nota50", 50f);
        notas.put("nota20", 20f);
        notas.put("nota10", 10f);
        notas.put("nota5", 5f);
        notas.put("nota2", 2f);
        notas.put("nota1", 1f);
        notas.put("nota0.50", 0.50f);
        notas.put("nota0.25", 0.25f);
        notas.put("nota0.10", 0.10f);
        notas.put("nota0.05", 0.05f);

        float somageral = 0f;
        int contador = 0;
        for (float valor  : notas.values()) {
            somageral+=valor;
            contador++;     
        }

        float mediageral = somageral/contador;
        System.out.printf("A soma geral de todas as notas e moedas brasileiras é : R$ %.2f%n",somageral);
        System.out.printf("A média geral desse valor é: %f",mediageral);
        input.close();
}
}