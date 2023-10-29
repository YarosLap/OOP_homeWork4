import Controler.StudentController;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.create("Иван", "Сидоров", "Петрочи");
        studentController.create("Михаил", "Козлов", "Николаевич");
        for (Controller controller : controllerGroup) {
            System.out.println(controller);
        }




    }
}