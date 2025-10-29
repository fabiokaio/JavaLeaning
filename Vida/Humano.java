package Vida;

public class Humano {
    //Atributos
    String nome;
    float peso;
    String sexo;
    String tpsangue;
    float altura;
    String cpf;
    int    idade;
    String fathername;
    String mothername;
    // Métodos
    //chorar , cortar cordão umbilical , toma banho  , vai pra casa , mama nos peitos , cresce . envelhece  ... morre.
    void nascer (){
        System.out.println("*opening eyes, receiving light...*");
    }
    void chorar() {
        System.out.println("/aaaaa/ hunwweeennnnnn");
    }
    void comer(){
        System.out.println("eating...");
    }
    void  andar(){
        System.out.println("walking");
    }
    void acelerar(){
        System.out.println("running ");
    }
    void pular(){
        System.out.println("Jumping");
    }
    void pedir(){
        System.out.println("bothering / asking");
    }
    void crescer(){
        System.out.println("Age ... 1 ... 2 ... 3 ... 4 ... 5. ... 6 ...7 .... 8 .....16 .... 17 .... 18...");
    }
    void ver(){
        System.out.println("looking");
    }
    void ouvir(){
        System.out.println("hearing");
    }
    void morrer(){
        System.out.println("Finish");
    }
}

class Main {
    public static void main(String[] args) {
        Humano pessoa = new Humano();
        pessoa.nome = "Cleitinho";
        pessoa.peso = (float)3.212;
        pessoa.sexo = "Masculino";
        pessoa.altura= (float)1.10;
        pessoa.tpsangue = "O+";
        pessoa.cpf = "000.000.000-00";
        pessoa.fathername = "Cletão";
        pessoa.mothername = "Cleytina";
        System.out.printf("Nome: %s%n",pessoa.nome);
        System.out.printf("Born right now");
        String workhard = "yes";
        String GOD = "yes";
        // chamar o método nascer
        pessoa.nascer();
        pessoa.crescer();
        pessoa.idade = 22;
        if(pessoa.idade < 1 ){
            System.out.println("Meu perqunino , você ainda é um bebê");
        }else if( pessoa.idade>1 && pessoa.idade < 12){
            System.out.println("You are just a kid");
        } else if (pessoa.idade >= 12 && pessoa.idade < 18) {
            System.out.println("You are a teen");
        }else if (pessoa.idade == 18){
            System.out.println("CONGRATUALTIONS, NOW YOU CAN BE ARRESTED ");
        }else if ( pessoa.idade >  18 && pessoa.idade <=60){
            System.out.println("You are a complete adult, enjoy your life.");
        }else if(pessoa.idade > 60 && pessoa.idade < 100){
            System.out.println("Parabéns por chegar na terceira idade");
            if(workhard == "yes"){
                System.out.println("You enjoied your life and now you have the time to enjoy the resulf from your work! Congratulations Man");
            }else {
                System.out.println("Why you didn't it ? Now will be  sad ? Do you think don't have a solution  for you ?");
            }
        }else if(pessoa.idade >= 100){
          pessoa.morrer();
          if(GOD == "yes"){
            System.out.println("Congratulation , you are one of the people that will live in peace without body,but with light ");
          }else{
            System.out.println("Cry, Cry a lot , Cry too much , Cry still you think will die (spoiler : you will not die). Don't do it if you are  alive");
          }
        }
        pessoa.morrer();
    }
}
