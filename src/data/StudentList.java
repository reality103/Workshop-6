/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author reality
 */
public class StudentList extends ArrayList<Student> {

    public StudentList() {
        super();
    }

    public void addAStudent() {
        String code;
        String name;
        int mark;
        do {
            code = Inputter.inputPattern("Input code: ", "Code must be in format <S000>", "[sS]\\d{3}");
            if (isCodeDuplicated(code)) {
                System.out.println("Student code can not be dupplicated");
            } else {
                break;
            }

        } while (true);
        name = Inputter.inputNonBlankStr("Input name: ", "Name can not be blank !");
        mark = Inputter.inputInt("Input mark", "Mark must be in range from 0 to 10", 0, 10);
        this.add(new Student(code, name, mark));
        System.out.println("ADDED SUCCESSFULLY !");
    }

    private boolean isCodeDuplicated(String code) {
        for (Student s : this) {
            if (s.getCode().equalsIgnoreCase(code)) {
                return true;
            }

        }
        return false;

    }

    public void printAll() {
        if (this.isEmpty()) {
            System.out.println("Student list is empty");
        }
        for (Student s : this) {
            System.out.println(s);

        }
        System.out.println("There are " + this.size() + "student(s) in the list");

    }

    public Student search(String code) {
        if (this.isEmpty()) {
            return null;
        }
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equalsIgnoreCase(code))
            return this.get(i);

        }
        return null;

    }

    public void removeStudent() {
        String code;
        if (this.isEmpty()) {
            System.out.println("Student list is empty");
        } else {
            code = Inputter.inputStr("Input student code for removing: ");
            Student s = search(code);
            if (s == null) {
                System.out.println("Student is not be in the list");
            } else {
                this.remove(s);
                System.out.println("REMOVE STUDENT SUCCESSFULLY");
            }

        }

    }

    public void searchStudent() {
        String code;

        if (this.isEmpty()) {
            System.out.println("Student list is empty");
        } else {
            

        }

    }

}
