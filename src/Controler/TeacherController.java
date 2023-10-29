package Controler;

import Data.Teacher;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private final TeacherService dataService = new TeacherService();
    private final TeacherGroupService studentGroupService = new TeacherGroupService();
    private final TeacherView studentView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        studentView.sendOnConsole(dataService.getAll());
    }

    public void createTeacherGroup(List<Teacher> teachers){
        teacherGroupService.createTeacherGroup(teachers);
        teacherView.sendOnConsoleUserGroup(teacherGroupService.getTeacherGroup());
    }


    public void getSortedListTeacherFromTeacherGroup(){
        List<Teacher> teachers = teacherGroupService.getSortedTeacherGroup();
        teacherView.sendOnConsole(teachers);
    }

    public void getSortedListByFIOTeacherFromTeacherGroup(){
        List<Teacher> teachers = teacherGroupService.getSortedByFIOStudentGroup();
        teacherView.sendOnConsole(teachers);
    }
}
