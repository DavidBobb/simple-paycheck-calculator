package com.sda.bobb.calculator;

import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {

    public static void main(String[] args) {
        showEntities();

    }

    public static void showEntities() {

        List<Entity> entityList = new ArrayList<>();

        Professor firstProfessor = new Professor("Cluj-Napoca", 4500);
        Professor secondProfessor = new Professor("Bucuresti", 3800);

        Student firstStudent = new Student("Cluj-Napoca", 800);
        Student secondStudent = new Student("Bucuresti", 500);

        entityList.add(firstProfessor);
        entityList.add(secondProfessor);

        entityList.add(firstStudent);
        entityList.add(secondStudent);

        for (Entity entities: entityList) {
            System.out.println(entities);
        }
    }
}
