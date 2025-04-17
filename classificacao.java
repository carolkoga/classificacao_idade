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
                System.out.println();
                System.out.println("Candidato número #" + i);
                System.out.println("Digite o nome: ");
                nome = scanner.nextLine().trim();
                if (!nome.isEmpty()){ //verifica se o campo esta vazio.
                    break;
                } else { //caso o campo estiver vazio
                    System.out.println();
                    System.out.println("____________________________");
                    System.out.println("O nome não pode estar vazio.");
                    System.out.println("____________________________");
                    System.out.println();
                }
            } 
            //cadastro do ano de nascimento de cada usuário:
            while(true){
                System.out.println("Digite o ano de nascimento: ");
                nascimento = scanner.nextInt();
                scanner.nextLine();
                if (nascimento >= 1950 && nascimento <= atual){
                    break;
                } else {
                    System.out.println("____________________________");
                    System.out.println("É preciso estar entre 1950 e " + atual);
                    System.out.println("____________________________");
                    System.out.println();
                }
            }
                idade = (atual - nascimento);
                System.out.println("A idade de " + nome + " é: " + idade);
                if (idade > 25){
                    System.out.println(nome + " esta classificado para a liga Premium.");
                } else if (idade < 25 && idade >= 18) {
                    System.out.println(nome + " esta classificado para a liga Junior.");
                }else {
                    System.out.println(nome + " não pode participar do campeonato.");
                }
            }
            scanner.close();
            System.out.println("\nPrograma Finalizado!");
        }
    }