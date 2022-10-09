package exemplo;
/**
 * Classe que permite criar balões coloridos que sobem e descem ...
 *
 * @author F. Mário Martins
 * @version 1.0 - 2008
 */
public class Balao {
    // variáveis de instância
    private String cor;
    private String direccao;
    private int altura;

    // construtores de balões
    public Balao() {
        cor = "??"; direccao = "??"; altura = 0;
    }

    public Balao(String c, String dir, int alt) {
        cor = c; direccao = dir; altura = alt;
    }

    public Balao(Balao b) {
        cor = b.getCor(); direccao = b.getDir(); altura = b.getAlt();
    }

    // Métodos de Instância

    public String getCor() { return cor; }
    public String getDir() { return direccao; }
    public int getAlt() { return altura; }

    public void mudaCor(String novaCor) { cor = novaCor; }
    public void mudaDir(String novaDir) { direccao = novaDir; }

    public void subir(int metros) { altura += metros; }

    public void descer(int metros) {
        int altFinal = altura - metros;
        altura = (altFinal > 0) ? altFinal : 0;
    }

    public void subirDescer(String movimento, int metros) { // usa os anteriores
        if(movimento.equals("subir")) this.subir(metros);
        else
        if(movimento.equals("descer")) this.descer(metros);
    }

    public String toString() {
        return "Balão de cor " + cor + " vai para " + direccao + " a " + altura +
                " metros de altura.";
    }

    public boolean equals(Balao b) {
        if(this == b) return true;  // é o mesmo balão
        if(b == null) return false; // é apontador nulo
        return cor.equals(b.getCor()) && direccao.equals(b.getDir()) &&
                altura == b.getAlt();
    }
}
