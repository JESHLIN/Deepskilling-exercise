public class MVCTest {
    public static void main(String[] args) {
        // Create the model
        Student student = new Student("Jessie", "S101", "A");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(student, view);

        // data display
        controller.updateView();

        // Update the model data through the controller
        controller.setStudentName("Angelin");
        controller.setStudentGrade("A+");

        // Display updated data
        controller.updateView();
    }
}
