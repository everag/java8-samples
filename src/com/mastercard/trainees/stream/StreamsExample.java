package com.mastercard.trainees.stream;

import com.mastercard.trainees.Gender;
import com.mastercard.trainees.Person;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsExample {

	static List<Person> people = new ArrayList<>();

	public static void main(String[] args) throws IOException, URISyntaxException {
		// people.forEach(p -> System.out.println(p.getName() + " is " + p.getAge() + " years old"));
		
		// Basic filtering
		
		if (people.stream().anyMatch(p -> p.getGender() == Gender.MALE))
			System.out.println("The list has Male characters");
		
		if (people.stream().noneMatch(p -> p.getAge() > 40))
			System.out.println("The list doesn't have any character older than 40 years");
		
		long charsLt15years = people.stream().filter(p -> p.getAge() <= 10).count();
		
		System.out.println("The list has " + charsLt15years + " characters not older than 15 years");
		
		// Map/reduce and collect
		
		Set<String> girlsNames =  people.stream()
										.filter(p -> p.getGender() == Gender.FEMALE)
										.map(Person::getName)
										.collect(Collectors.toSet());
		
		System.out.println("The girls are: " + girlsNames);
		
		// List<Person> to Map<Integer, Person>
		
		Map<Integer, Person> mapIdsPersons = people.stream().collect(Collectors.toMap(Person::getId, (p) -> p));
		
		System.out.println("Mapped ids: " + mapIdsPersons);
		
		// Read text file

		Path filePath = Paths.get(ClassLoader.getSystemResource("test.txt").toURI());
		System.out.println("Reading file " + filePath);
		Files.newBufferedReader(filePath).lines().forEach(System.out::println);
	}

	static {
		people.add(new Person(1,  "Eddard Stark",       35, Gender.MALE));
		people.add(new Person(2,  "Catelyn Stark",      34, Gender.FEMALE));
		people.add(new Person(3,  "Robb Stark",         14, Gender.MALE));
		people.add(new Person(4,  "Jon Snow",           14, Gender.MALE));
		people.add(new Person(5,  "Sansa Stark",        11, Gender.FEMALE));
		people.add(new Person(6,  "Arya Stark",         9,  Gender.FEMALE));
		people.add(new Person(7,  "Bran Stark",         7,  Gender.MALE));
		people.add(new Person(8,  "Robert Baratheon",   36, Gender.MALE));
		people.add(new Person(9,  "Joffrey Baratheon",  13, Gender.MALE));
		people.add(new Person(10, "Tyrion Lannister",   24, Gender.MALE));
		people.add(new Person(11, "Jaime Lannister",    32, Gender.MALE));
		people.add(new Person(12, "Cersei Lannister",   32, Gender.FEMALE));
		people.add(new Person(13, "Sandor Clegane",     27, Gender.MALE));
		people.add(new Person(14, "Theon Greyjoy",      19, Gender.MALE));
		people.add(new Person(15, "Viserys Targaryen",  23, Gender.MALE));
		people.add(new Person(16, "Daenerys Targaryen", 13, Gender.FEMALE));
		people.add(new Person(17, "Jorah Mormont",      40, Gender.MALE));
	}
}
