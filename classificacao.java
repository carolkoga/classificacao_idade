import java.util.Scanner;
public class classificacao{ 
    public static void main (String[] args){ 
        //declaração de variáveis
        Scanner scanner = new Scanner(System.in);
        String nome;
        int nascimento;
        int atual;
        int idade;
        int i;
        atual = 2025;

        //cadastrar 3 campos:
        for (i=1 ; i<=3 ; i ++){
            //nome do usuario com verificação de caracter:
            while(true){ //vai rodar até que o usuário digite pelo menos um caractere
            System.out.println("Candidato número #" + i);
            System.out.println("Digite o nome: ");
            nome = scanner.nextLine().trim();
            if (!nome.isEmpty()){
                break;
            } else {
                System.out.println("O nome não pode estar vazio.");Teste
            }
            } 
            }
        }
    }