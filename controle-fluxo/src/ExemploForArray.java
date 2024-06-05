public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
        //x < alunos.length => Enquanto x for menor que o bloco de implementação, ou seja tamanho do array.
        for(int x=0; x < alunos.length; x++){
            System.out.println("O aluno no indice x = " + x + " é: " + alunos[x]);
        }
    }
    
}
