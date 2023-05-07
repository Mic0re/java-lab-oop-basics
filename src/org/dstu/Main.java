package org.dstu;

import org.dstu.domain.*;
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
        List<IZoo> people = new ArrayList<>();

        for (String[] line: strings) {
            people.add(AnimalUtils.initializePerson(line));
        }

        people.forEach(System.out::println);

        SerializeUtils.serialize(people, binFile);
        List<IZoo> newPersons = (List<IZoo>) SerializeUtils.deserialize(binFile);
        System.out.println("Новый зоопарк:");
        newPersons.forEach(System.out::println);
    }
}
