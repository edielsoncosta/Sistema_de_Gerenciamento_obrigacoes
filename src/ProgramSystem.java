import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nome do projeto: ");
        String nomeProjeto = sc.nextLine();

        System.out.print("quantas tarefas terá o projeto: ");
        int qntTask = sc.nextInt();

        List<Task> tasks = new ArrayList<>();
        List<User> users = new ArrayList<>();

        for (int i = 0; i < qntTask; i++) {
            System.out.print("email: ");
            String email = sc.next();
            System.out.print("User: ");
            String usuario = sc.next();

            User user = new User(usuario, email);
            users.add(user);

            System.out.print("nome da tarefa: ");
            String nomeTask = sc.next();
            sc.nextLine();
            System.out.print("Descrição: ");
            String descricao = sc.nextLine();
            System.out.print("quantos comentarios: ");
            int qntComentarios = sc.nextInt();

            List<Comment> taskComments = new ArrayList<>();
            for (int j = 0; j < qntComentarios; j++) {
                System.out.print("comentário #" + (j + 1) + ": ");
                String comentario = sc.next();
                sc.nextLine();
                System.out.print("autor: ");
                String autor = sc.next();

                Comment comment = new Comment(comentario, autor);
                taskComments.add(comment);
            }
            Task task = new Task(nomeTask, descricao, taskComments);
            tasks.add(task);
        }
        Project project = new Project(nomeProjeto, tasks, users);
        System.out.print(project);

        sc.close();
    }
}