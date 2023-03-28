package pessoa;

import java.util.Scanner;

public class exec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas:");
        Integer howMuch = sc.nextInt();
        sc.nextLine();
        Pessoa[] listaPessoas = new Pessoa[howMuch];
        for(int i = 0; i < howMuch; i++){
        System.out.print("Nome:");
        String nome = sc.nextLine();
        System.out.print("Idade:");
        Integer Idade = sc.nextInt();
        sc.nextLine();
        System.out.println("-------------");
        Pessoa pessoa = new Pessoa(nome, Idade);
        listaPessoas[i] = new Pessoa(nome, Idade);
        }
        
       

       
        System.out.println("Enter the position:");
        int position = sc.nextInt();

        for(int i = 0; i < listaPessoas.length; i++){
            if(position <= listaPessoas.length){
                if(listaPessoas[i].equals(listaPessoas[position - 1])){
                    System.out.println(listaPessoas[position - 1]);
                }
            }
            else{
                System.out.println("Error");
                break;
            }
        }
        
        sc.close();
    }
    
}
