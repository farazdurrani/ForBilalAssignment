package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TelevisionReader {

    public static void main(String[] args) throws IOException {
	List<String> televisions = Files.lines(Paths.get("/home/televisions.csv")).skip(1)
	    .collect(Collectors.toList());

	Stream<Television> stream = televisions.stream()
	    .map(line -> new Television(line.split(",")[0], line.split(",")[1],
	        Integer.parseInt(line.split(",")[2]), Integer.parseInt(line.split(",")[3])))
	    .filter(tv -> tv.getScreenSize() > 60);
	stream.forEach(System.out::println);
	Map<String, List<Television>> map = televisions.stream()
	    .map(line -> new Television(line.split(",")[0], line.split(",")[1],
	        Integer.parseInt(line.split(",")[2]), Integer.parseInt(line.split(",")[3])))
	    .collect(Collectors.groupingBy(Television::getBrand));

	map.forEach((brand, list) -> {
	    System.out.println("Brand: " + brand + "\nTelevisions: ");
	    list.forEach(System.out::println);
	});
	
	System.out.println("Average Screen Size:");
	System.out.println(IntStream.of(televisions.stream()
	    .mapToInt(line -> Integer.parseInt(line.split(",")[3]))
	    .toArray()).average().getAsDouble());
	
	System.out.println("Largest Screen Size:");
	System.out.println(IntStream.of(televisions.stream()
	    .mapToInt(line -> Integer.parseInt(line.split(",")[3]))
	    .toArray()).max().getAsInt());

    }
}
