package com.sda.bobb.calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CalculatorTest {

    public static void main(String[] args) {
        List<Entity> entityList = createEntityList();
        List<Entity> rearrangeEntitiesList = rearrangeEntities(entityList);

        System.out.println(rearrangeEntitiesList);

        double salaries = computeAmountRecivedPerCity(entityList, "Cluj-Napoca");
        System.out.println("\n" + "The amount in this city is: " + salaries);
    }

    public static List<Entity> createEntityList() {

        List<Entity> entityList = new ArrayList<>();

        Professor firstProfessor = new Professor("Cluj-Napoca", 4500);
        Professor secondProfessor = new Professor("Bucuresti", 3800);

        Student firstStudent = new Student("Brasov", 800);
        Student secondStudent = new Student("Cluj-Napoca", 500);

        entityList.add(firstProfessor);
        entityList.add(secondProfessor);

        entityList.add(firstStudent);
        entityList.add(secondStudent);

//        for (Entity entities: entityList) {
//            System.out.println(entities);
//        }

        return entityList;
    }

    public static List<Entity> rearrangeEntities(List<Entity> entities) {

        List<Entity> students = new ArrayList<>();
        List<Entity> professors = new ArrayList<>();

        for (Entity e : entities) {
            if (e instanceof Student) {
                students.add(e);
            } else if (e instanceof Professor) {
                professors.add(e);
            }
        }

        Comparator<Entity> myComparator = new EntityComparator();

        Collections.sort(students, new EntityComparator());
        Collections.sort(professors, new EntityComparator());
        Collections.reverse(professors);

        entities.clear();
        entities.addAll(professors);
        entities.addAll(students);

        return entities;
    }

    public static double computeAmountRecivedPerCity(List<Entity> entities, String city) {

        int sum = 0;
        for (Entity e : entities) {
            if (e.getCity().equals(city)) {
                sum += e.amountReceived();
            }
        }
        return sum;
    }
}
