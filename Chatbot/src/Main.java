import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, sou o LiquidusBot, Bot responsável por te auxiliar a " +
                "encontrar o computador ideal para você. Primeiramente me informe qual " +
                "seu objetivo com o computador:" + "\n1 - Jogar" + "\n2 - Trabalhar" + "\n3 - Estudar");

        while (true) {
            String input = sc.nextLine();
            if (input.equals("1")) {
                objetivoJogar();
            } else if (input.equals("2")) {
                objetivoTrabalhar();
                System.out.println("Alguma outra dúvida?");
            } else if (input.equals("3")) {
                objetivoEstudar();
            } else if (input.equals("sair")) {
                System.out.println("Espero ter ajudado. Até mais!");
                break;
            }
        }
    }

    public static void objetivoJogar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você deseja um computador para jogar, certo? ");
        String input = sc.nextLine();
        // Lógica para jogar
    }

    public static void objetivoTrabalhar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Em qual área você atua? " + "\n1 - Arquitetura" + "\n2 - Engenharia" + "\n3 - Design" + "\n4 - Programação" + "\n5 - Edição de vídeo" + "\n6 - Edição de imagem" + "\n7 - Edição de áudio" + "\n8 - Outros");

        String input = sc.nextLine();
        if (input.equals("1")) {
            System.out.println("Aqui estão algumas opções de hardware ideal para trabalhar com arquitetura: ");

        } else if (input.equals("2")) {
            System.out.println("Aqui estão algumas opções de hardware ideal para trabalhar com engenharia: ");
            System.out.println("Placa Gráfica: - Processor: - Memoria Ram: - Armazenamento: - Fonte: - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: ");

        } else if (input.equals("3")) {
            System.out.println("Aqui estão algumas opções de hardware ideal para trabalhar com design: ");
            System.out.println("Placa Gráfica: RTX 2060 - Processor: Ryzen 5 5600- Memoria Ram: 32gb RAM ddr4 - Armazenamento: 1TB SSD e 2TB HD - Fonte: 700w - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: B450M ");
        }
        else if (input.equals("4")) {
            System.out.println("Aqui estão algumas opções de hardware ideal para trabalhar com programação: ");
            System.out.println("Placa Gráfica: - Processor: - Memoria Ram: - Armazenamento: - Fonte: - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: ");

        }
        else if (input.equals("5")) {
            System.out.println("Aqui estão algumas opções de hardware ideal para trabalhar com edição de vídeo: ");
            System.out.println("Placa Gráfica: - Processor: - Memoria Ram: - Armazenamento: - Fonte: - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: ");
        }
        else if (input.equals("6")) {
            System.out.println("Aqui estão algumas opções de hardware ideal para trabalhar com edição de imagem: ");
            System.out.println("Placa Gráfica: - Processor: - Memoria Ram: - Armazenamento: - Fonte: - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: ");
        }
        else if (input.equals("7")) {
            System.out.println("Aqui estão algumas opções de hardware ideal para trabalhar com edição de áudio: ");
            System.out.println("Placa Gráfica: - Processor: - Memoria Ram: - Armazenamento: - Fonte: - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: ");
        }
        else if (input.equals("8")) {
            System.out.println("Aqui estão algumas opções de hardware ideal para trabalhar com outras áreas: ");
            System.out.println("Placa Gráfica: - Processor: - Memoria Ram: - Armazenamento: - Fonte: - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: ");
        }
        else if (input.equals("sair")) {
            System.out.println("Espero ter ajudado. Até mais!");
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }

    }

    public static void objetivoEstudar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você deseja um computador para estudar, certo? ");
        String input = sc.nextLine();
        // Lógica para estudar
    }
}
