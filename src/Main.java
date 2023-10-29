import Controler.StudentController;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.create("Иван", "Сидоров", (LocalDate.of(1980, 10, 12)));
        studentController.create("Михаил", "Козлов", (LocalDate.of(1979, 10, 10)));
        for (StudentController controller :  teacher) {
            System.out.println();
        }




    }
}

