package org.ies.highschool.mode;

import java.util.Objects;

public class Student {
    private String name;
    private String lasname;
    private int id ;

    public Student(String name, String lasname, int id) {
        this.name = name;
        this.lasname = lasname;
        this.id = id;
    }
    public void showInfo(){
        System.out.println(name);
        System.out.println(lasname);
        System.out.println(id);
    }

    public String getName() {
        return name;
    }

    public String getLasname() {
        return lasname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLasname(String lasname) {
        this.lasname = lasname;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lasname='" + lasname + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(lasname, student.lasname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lasname, id);
    }
}
