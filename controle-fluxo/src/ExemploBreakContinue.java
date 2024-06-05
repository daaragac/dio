public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++ ){
            if(numero == 3)//Quando for igual a 3 não imprimi.
                continue;
            System.out.println(numero);
        }
    }
    
}
