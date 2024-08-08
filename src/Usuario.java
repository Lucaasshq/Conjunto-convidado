public class Usuario {
    public static void main(String[] args) {

        ConvidadoRepository convidadoRepository = new ConvidadoRepository();

        System.out.println("Quantidade de convidados: " + convidadoRepository.contarConvidados());

        convidadoRepository.adicionarConvidado("Lucas", 0);
        convidadoRepository.adicionarConvidado("Matheus", 1);
        convidadoRepository.adicionarConvidado("Priscila", 1);
        convidadoRepository.adicionarConvidado("Gerson", 3);
        convidadoRepository.adicionarConvidado("Paula", 4);


        System.out.println(convidadoRepository.exibirConvidados());

        System.out.println("Quantidade de convidados: " + convidadoRepository.contarConvidados());

        
    }
}
