import java.util.List;

public class Task {
    private String tituloTask;
    private String descricao;

    List<Comment> comments;

    public Task(String tituloTask, String descricao, List<Comment> comments) {
        this.tituloTask = tituloTask;
        this.descricao = descricao;
        this.comments = comments;
    }

    public String getTituloTask() {
        return tituloTask;
    }

    public void setTituloTask(String tituloTask) {
        this.tituloTask = tituloTask;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment (Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("titulo da task: ").append(tituloTask).append("\n");
        sb.append("descrição: ").append(descricao).append("\n");
        sb.append("comentários:");
        for (Comment comment : comments) {
            sb.append("\n").append(comment.printComentarios());
        }
        return sb.toString();
    }
}
