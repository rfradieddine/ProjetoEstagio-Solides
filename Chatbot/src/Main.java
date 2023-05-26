import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, sou o LiquidusBot, Bot responsável por te auxiliar a " +
                "encontrar o computador ideal para você. Primeiramente me informe qual " +
                "seu objetivo com o computador:");

        while (true) {
            String input = sc.nextLine();

            if (input.equals("Qual a melhor configuração para jogos?")) { // adicionado para jogar
                objetivoJogar();
                break;
            } else if (input.equals("Qual a melhor configuração para trabalhar?")) { // adicionado para trabalhar
                objetivoTrabalhar();
                break;
            } else if (input.equals("Qual a melhor configuração para estudar?")) { // adicionado para estudar
                objetivoEstudar();
                break;
            } else if (input.equals("sair")) {  // adicionado para sair do programa
                System.out.println("Espero ter ajudado. Até mais!");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }


    public static void objetivoJogar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quais tipos de jogos você costuma jogar?" + "\n1 - FPS" + "\n2 - MOBA" + "\n3 - RPG");
        String input = sc.nextLine();

        if (input.equals("1")){
            System.out.println("Aqui estão algumas opções de hardware ideal para jogar FPS: ");
            System.out.println("Placa Gráfica: RTX 3060- Processador: Ryzen 5 5600 - Memoria Ram: 16gb RAM - Armazenamento: SSD 1TB NVME, 1TB HD - Fonte: 700w - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: Gigabyte B560M DS3H V2");
        } else if (input.equals("2")) {
            System.out.println("Aqui estão algumas opções de hardware ideal para jogar MOBA: ");
            System.out.println("Placa Gráfica: GTX 1650 - Processador: I3 10100 - Memoria Ram: 16GB RAM - Armazenamento: SSD 500GB, HD 1TB - Fonte: 500W - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: PLACA-MÃE GIGABYTE H410M H V3 GAMING");
        } else if (input.equals("3")) {
            System.out.println("Aqui estão algumas opções de hardware ideal para jogar RPG: ");
            System.out.println("Placa Gráfica: RTX 3070 - Processador: ryzen 7 5800x - Memoria Ram: 32gb RAM - Armazenamento: SSD 1TB NVME, 1TB HD  - Fonte: 700W - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: Asus TUF GAMING B550M-PLUS AMD AM4 DDR4 mATX");
        }else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }

    public static void objetivoTrabalhar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Em qual área você atua? " + "\n1 - Arquitetura" + "\n2 - Engenharia" + "\n3 - Design" + "\n4 - Programação" + "\n5 - Edição de vídeo" + "\n6 - Edição de imagem" + "\n7 - Edição de áudio" + "\n8 - Outros");
        String input = sc.nextLine();

        if (input.equals("1")) {
            System.out.println("Para quem trabalha com Arquitetura é necessário um poder Gráfico para poder rodar softwares como:\nArchiCad\n" +
                    "- SketchUp\n" +
                    "- Armedia\n" +
                    "- AutoCad." + "\nAqui estão algumas opções de hardware ideal para trabalhar com arquitetura: ");
            System.out.println("Placa Gráfica: 3060 TI 12gb - Processador: i7 12900k - Memoria Ram: 32GB Ram DDR4 - Armazenamento: SSD 1TB NVME, HD 2TB - Fonte:750W - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: Asus Prime Z590-P, Intel, mATX, DDR4");


        } else if (input.equals("2")) {
            System.out.println("Aqui estão algumas opções de hardware ideal para trabalhar com engenharia: ");
            System.out.println("Placa Gráfica: 3060 TI 12gb - Processador: i7 12900k - Memoria Ram: 32GB Ram DDR4 - Armazenamento: SSD 1TB NVME, HD 2TB - Fonte:750W - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: Asus Prime Z590-P, Intel, mATX, DDR4");

        } else if (input.equals("3")) {
            System.out.println("Aqui estão algumas opções de hardware ideal para trabalhar com design: ");
            System.out.println("Placa Gráfica: Geforce RTX 2060 - Processador: Ryzen 5 5600x- Memoria Ram: 32gb RAM ddr4 - Armazenamento: SSD 1TB NVME,HD 2TB - Fonte: 700w - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: B450M ");
        }
        else if (input.equals("4")) {
            System.out.println("Para quem trabalha com programação é necessário um poder de processamento para rodar softwares mais complexos. \nAqui estão algumas opções de hardware ideal para trabalhar com programação: ");
            System.out.println("Placa Gráfica: Gráfico integrado - Processador: Ryzen 7 5700G - Memoria Ram: 32GB RAM - Armazenamento: SSD 1TB - Fonte: 500W - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: Placa Mãe Asus TUF GAMING B550M-PLUS AMD AM4 DDR4 mATX\n");

        }
        else if (input.equals("5")) {
            System.out.println("Para quem trabalha com edição de vídeos é necessário um poder Gráfico para poder rodar softwares como:\n- Premiere Pro\n" +
                    "- After Effects\n" +
                    "- Audition\n" +
                    "- Animate." + "\nAqui estão algumas opções de hardware ideal para trabalhar com edição de vídeos: ");
            System.out.println("Placa Gráfica:Geforce RTX 3080 - Processador: I7 12900K - Memoria Ram: 16GB RAM - Armazenamento: 2TB SSD NVME, HD 2TB - Fonte: 1000W - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: Asus Prime Z590-P, Intel, mATX, DDR4");
        }
        else if (input.equals("6")) {
            System.out.println("Aqui estão algumas opções de hardware ideal para trabalhar com edição de imagem: ");
            System.out.println("Placa Gráfica: GTX 1660 - Processador: I7 11700K - Memoria Ram: 16GB - Armazenamento: SSD 500GB NVME, HD 1TB - Fonte: 600W - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: Asus TUF GAMING B460M-PLUS, Chipset B460, Intel LGA 1200, mATX, DDR4");
        }
        else if (input.equals("7")) {
            System.out.println("Para quem trabalha com edição de audio é necessário um poder de processamento para rodar softwares de áudio. \nAqui estão algumas opções de hardware ideal para trabalhar com edição de áudio: ");
            System.out.println("Placa Gráfica: Gráfico integrado - Processador: Ryzen 7 5700G - Memoria Ram: 32GB RAM - Armazenamento: SSD 1TB - Fonte: 500W - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: Placa Mãe Asus TUF GAMING B550M-PLUS AMD AM4 DDR4 mATX\n");
        }
        else if (input.equals("8")) {
            System.out.println("Em outras áreas como uso diário de Pacote Office e navegador de internet, pode-se em optar em algo custo-benefício. \nAqui estão algumas opções de hardware ideal para trabalhar com outras áreas: ");
            System.out.println("Placa Gráfica: Gráfico integrado - Processador: i5 10400 - Memoria Ram: 8gb RAM - Armazenamento: 500gb SSD - Fonte: 500w - Gabinete: Ao seu criterio, porém, indicamos um Mid Tower para obter maior aproveitamento de espaço interno no gabinete - Placa Mãe: ASUS Prime - H510M-E, Intel LGA 1200, microATX, DDR4");
        }
        else if (input.equals("sair")) {
            System.out.println("Espero ter ajudado. Até mais!");
        }else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }

    public static void objetivoEstudar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Em sua área de estudos você utiliza programas como: Pacote Office e Navegador de internet? " + "\n1 - Sim" + "\n2 - Não");
        String input = sc.nextLine();

        if (input.equals("1")){
            System.out.println("Quem deseja busca algo para os estudos que se utiliza  Pacote Office e Navegador de internet, indicamos um notebook para maior mobilidade. \nAqui está a opção de notebook ideal para quem utiliza Pacote Office e Navegadores de internet: ");
            System.out.println("Notebook Lenovo Ultrafino IdeaPad 3 Ryzen 5 5500U 8GB 256GB SSD Prata 15.6");

        } else if (input.equals("2")) {
            System.out.println("Para quem não se utiliza de Pacote Office e Navegador de internet com frequência, indicamos um tablet apenas para a escrita. \nAqui está a opção de tablet ideal para quem não utiliza Pacote Office e Navegadores de internet e busca algo mais compacto:");
            System.out.println("Galaxy Tab A7 Lite 4G 32GB 3G RAM Tela imersiva 8.7 pol - SM- T225\n");
        }else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }
}

