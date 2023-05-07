package org.dstu;

import org.dstu.domain.IUniversityPerson;
import org.dstu.domain.Student;
import org.dstu.domain.Teacher;
import org.dstu.util.CsvReader;
import org.dstu.util.SerializeUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("You must specify data file name and serialize file name!");
            return;
        }

        String sourceFile = args[0];
        String binFile = args[1];

        List<String[]> strings = CsvReader.readCsvFile(sourceFile, ";");
        List<IUniversityPerson> people = new ArrayList<>();
        for (String[] line: strings) {
            if (line[0].equals("0")) {
                people.add(new Student(line));
            } else {
                people.add(new Teacher(line));
            }
        }

        people.forEach(System.out::println);

        SerializeUtils.serialize(people, binFile);
        List<IUniversityPerson> newPersons = (List<IUniversityPerson>) SerializeUtils.deserialize(binFile);
        System.out.println("Новые люди:");
        newPersons.forEach(System.out::println);
    }
}
