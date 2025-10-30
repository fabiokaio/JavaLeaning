package Vida;

import java.util.Scanner;
public class Humanoscan extends Humano{
        
}
class Main2{
    public static void main(String[]args){
        Humanoscan pessoa2 = new Humanoscan();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome");
        pessoa2.nome = input.nextLine();
        System.out.println("Digite seu peso");
        pessoa2.peso = input.nextFloat();
        input.nextLine();
        System.out.println("Qual o seu sexo");
        pessoa2.sexo = input.nextLine();
        System.out.println("Digite seu tipo sanguíneo");
        pessoa2.tpsangue = input.next();
        System.out.println("Digite sua altura");
        pessoa2.altura = input.nextFloat();
        input.nextLine();
        System.out.println("Digite seu CPF (Como no modelo : 000.000.000-00)"); // como obrigar o cpf a ser  escrito NO MODELO , com quaisquer outros números ?
        pessoa2.cpf = input.nextLine();
        System.out.println("Digite sua idade");
        pessoa2.idade = input.nextInt();
        input.nextLine();
        System.out.println("Digite o nome do seu pai");
        pessoa2.fathername = input.nextLine();
        input.nextLine();
        System.out.println("Digite o nome da sua mãe");
        pessoa2.mothername = input.nextLine();
        input.nextLine();
        input.close();

        String workhard = "yes";
        String GOD = "yes";

        pessoa2.nascer();
        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.peso);
        System.out.println(pessoa2.sexo);
        System.out.println(pessoa2.tpsangue);
        System.out.println(pessoa2.altura);
        System.out.println(pessoa2.cpf);
        System.out.println(pessoa2.idade);
        System.out.println(pessoa2.fathername);
        System.out.println(pessoa2.mothername);
        if(pessoa2.idade < 1 ){
            System.out.println("Meu perqunino , você ainda é um bebê");
        }else if( pessoa2.idade>1 && pessoa2.idade < 12){
            System.out.println("You are just a kid");
        } else if (pessoa2.idade >= 12 && pessoa2.idade < 18) {
            System.out.println("You are a teen");
        }else if (pessoa2.idade == 18){
            System.out.println("CONGRATUALTIONS, NOW YOU CAN BE ARRESTED ");
        }else if ( pessoa2.idade >  18 && pessoa2.idade <=60){
            System.out.println("You are a complete adult, enjoy your life.");
        }else if(pessoa2.idade > 60 && pessoa2.idade < 100){
            System.out.println("Parabéns por chegar na terceira idade");
            if(workhard == "yes"){
                System.out.println("You enjoied your life and now you have the time to enjoy the resulf from your work! Congratulations Man");
            }else {
                System.out.println("Why you didn't it ? Now will be  sad ? Do you think don't have a solution  for you ?");
            }
        }else if(pessoa2.idade >= 100){
          pessoa2.morrer();
          if(GOD == "yes"){
            System.out.println("Congratulation , you are one of the people that will live in peace without body,but with light ");
          }else{
            System.out.println("Cry, Cry a lot , Cry too much , Cry still you think will die (spoiler : you will not die). Don't do it if you are  alive");
          }
        }
        pessoa2.morrer();
    }

}
// aindo vou elaborar mais . Tenho minhas  dúvidas marcadas e explicadas