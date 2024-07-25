import java.util.List;

public class Project {
    private String nomeProjeto;

    List<Task> tasks;
    List<User> users;

    public Project(String nomeProjeto, List<Task> tasks, List<User> users) {
        this.nomeProjeto = nomeProjeto;
        this.tasks = tasks;
        this.users = users;
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

        for (User user : users) {
            sb.append(user).append("\n");
        }

        return sb.toString();
    }
}
