package view;

public interface UserView<T extends User> {
    void create(String firstName, String secondName, String lastName);
    List<T> getAll();
}
