public class Comment {
    private String comentario;
    private String autor;

    public Comment(String comentario, String autor) {
        this.comentario = comentario;
        this.autor = autor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String printComentarios() {

        return comentario
                + " - "
                + autor;
    }
}
