package org.ies.highschool;

import org.ies.highschool.componentes.StudentReader;
import org.ies.highschool.mode.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentReader studentReader = new StudentReader(scanner);
        Student student =studentReader.read();
        System.out.println(" mostrando datos del estudiante" +student);
        student.showInfo();
    }
}