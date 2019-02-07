package visao;

import java.util.Scanner;

public class VisaoPrincipal {
    Scanner sc = new Scanner(System.in);
    Scanner scs = new Scanner(System.in);
    
    private boolean executarLOOP = false;
    private String[] comandoFormatado;
    
    public void modoSimples(){
        while(!executarLOOP){
            System.out.print(">- ");
            String comando = scs.nextLine();
            formatarComando(comando);
            
            switch(comandoFormatado[0]){
            
                case "exit":
                    
                    executarLOOP = true;
                    System.out.println("Saindo do Programa...");
                    break;
            
            
            
            
            }
            
        }
    }
    
    public void modoAvancado(){
    
    
    }
    
    private void formatarComando(String comando)
    {
        comando = comando.trim();
        comando = comando.replace(" ", "/");
        
        this.comandoFormatado = comando.split("/");
        
    
        
    }
}
