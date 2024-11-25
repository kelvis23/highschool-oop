package org.ies.highschool.componentes;

import org.ies.highschool.mode.Student;

import java.util.Scanner;

public class StudentReader {
    private final Scanner scanner;

    public StudentReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Student read(){
        System.out.println("Introduce los datos del studiante");
        System.out.println(" nombre");
        String name =scanner.nextLine();
        System.out.println("apellido");
        String lastname=scanner.nextLine();
        System.out.println("direcion");
        int id = scanner.nextInt();
        scanner.nextLine();
        return new Student(
                name,
                lastname,
                id
        );
    }
}
