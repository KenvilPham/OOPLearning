package com.codeschool;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PeriodicTable {
    private List<Element> elementList;

    public PeriodicTable() throws IOException {
        this.elementList = loadElements();
    }

    private List<Element> loadElements() throws IOException {
        return Files.lines(Paths.get("periodic_table.csv"))
                .map(Element::new)
                .collect(Collectors.toList());
    }

    Function<String, List<Element>> findByName =
            pattern -> elementList.stream()
            .filter(element -> element.getName().contains(pattern))
            .collect(Collectors.toList());

    BiFunction<Double, Double, List<Element>> findByWeight =
            (min, max) -> elementList.stream()
                .filter(element -> element.getWeight() >= min && element.getWeight() <= max)
                .collect(Collectors.toList());

    public void listAllElements() {
        elementList.forEach(System.out::println);
    }
}
