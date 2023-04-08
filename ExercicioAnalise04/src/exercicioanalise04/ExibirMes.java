package exercicioanalise04;

import java.util.Scanner;

public class ExibirMes {

    int numMes;

    public void mes() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o numero do mês que você deseja: ");
        numMes = entrada.nextInt();

        switch (numMes) {
            case 1:
                System.out.printf("O mês de número %d corresponde a Janeiro\n", numMes);
                break;
            case 2:
                System.out.printf("O mês de número %d corresponde a Fevereiro\n", numMes);
                break;
            case 3:
                System.out.printf("O mês de número %d corresponde a Março\n", numMes);
                break;
                case 4:
                System.out.printf("O mês de número %d corresponde a Abril\n", numMes);
                break;
                case 5:
                System.out.printf("O mês de número %d corresponde a Maio\n", numMes);
                break;
                case 6:
                System.out.printf("O mês de número %d corresponde a Junho\n", numMes);
                break;
                case 7:
                System.out.printf("O mês de número %d corresponde a Julho\n", numMes);
                break;
                case 8:
                System.out.printf("O mês de número %d corresponde a Agosto\n", numMes);
                break;
                case 9:
                System.out.printf("O mês de número %d corresponde a Setembro\n", numMes);
                break;
                case 10:
                System.out.printf("O mês de número %d corresponde a Outubro\n", numMes);
                break;
                case 11:
                System.out.printf("O mês de número %d corresponde a Novembro\n", numMes);
                break;
                case 12:
                System.out.printf("O mês de número %d corresponde a Dezembro\n", numMes);
                break;
                default:
                    System.out.printf("O mês de número %d não corresponde a nenhum mês do calendário tradicional\n", numMes);
                    break;
                
        }

    }
    
}
