package Controler;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, LocalDate dateOfBirth);
}