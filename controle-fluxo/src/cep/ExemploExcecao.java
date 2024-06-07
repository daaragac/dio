package cep;
import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        //Number valor = Double.valueOf("a1.75"); //Segurando o Ctrl e Clicando em cima do valueOf abre uma classe para analise
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            
            e.printStackTrace();
        }
        
    }
    
}
