import java.util.ArrayList;
import java.util.List;

public class Project {
    private String nomeProjeto;

    List<Task> tasks;

    public Project(String nomeProjeto, List<Task> tasks) {
        this.nomeProjeto = nomeProjeto;
        this.tasks = tasks;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Projeto: ");
        sb.append(nomeProjeto).append("\n");

        for (Task task : tasks){
            sb.append(task);
        }

        return sb.toString();
    }
}
