public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean lido = false;


    public Livro(String titulo, String autor, int ano, boolean lido) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.lido = lido;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public boolean isLido() {
        return lido;
    }
    public void marcarComoLido(){
        this.lido=true;
    }
}