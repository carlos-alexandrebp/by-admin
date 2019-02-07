package visao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("--- BEM-VINDO AO BYADMIN ---");
        
        System.out.println("");
        
        System.out.println("|----------------------|");
        System.out.println("|    1 - Simples       |");
        System.out.println("|    2 - Avancado      |");
        System.out.println("|----------------------|");
        
        System.out.println("");
        
        System.out.print("Digite a opcao numerica: ");
        Byte escolha = sc.nextByte();
        
        if(escolha == 1){
            VisaoPrincipal Tela = new VisaoPrincipal();
            Tela.modoSimples();
        }
        else if(escolha == 2){
            VisaoPrincipal Tela = new VisaoPrincipal();
            Tela.modoAvancado();
        }
        else
            System.out.println("Digite um valor valido");
        
        sc.close();
       
    }
}
