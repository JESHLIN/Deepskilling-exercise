public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Design UI", "Pending"));
        taskList.addTask(new Task(2, "Fix Bugs", "In Progress"));
        taskList.addTask(new Task(3, "Deploy App", "Completed"));

        System.out.println("All Tasks:");
        taskList.displayTasks();

        System.out.println("\nSearching for Task with ID 2:");
        Task found = taskList.searchTask(2);
        System.out.println(found != null ? found : "Task not found.");

        System.out.println("\nDeleting Task with ID 1:");
        taskList.deleteTask(1);

        System.out.println("\nRemaining Tasks:");
        taskList.displayTasks();
    }
}
