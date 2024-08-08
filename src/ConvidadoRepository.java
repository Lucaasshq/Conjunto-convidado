
import java.util.HashSet;
import java.util.Set;

public class ConvidadoRepository {

    private Set<Convidado> convidadoSet;

    public ConvidadoRepository() {
        this.convidadoSet = new HashSet<Convidado>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            } else {
                System.out.println("Não Exists convidado com else codigo de convite");
            }
            convidadoSet.remove(convidadoParaRemover);
        }

    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public Set<Convidado> exibirConvidados() {
        return convidadoSet;
    }


}
