package com.company2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public void printKeys(Map<String, String> map) {
	map.keySet().forEach(System.out::println);
    }

    public void printValues(Map<String, String> map) {
	map.values().forEach(System.out::println);
    }

    public void printKeysAndValues(Map<String, String> map) {
	map.entrySet()
	    .forEach((entry) -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    public Map<String, Integer> mapFun(Map<String, Integer> map) {
	Map<String, Integer> m = new HashMap<>();
	m.putAll(map);
	m.remove("Jeep Wrangler");
	m.put("Ford Explorer", 2012);
	m.put("Smart Fortwo", 2013);
	return m;
    }

    public Map<String, List<Car>> listCars(List<Car> car){
	Map<String, List<Car>> map = new HashMap<>();
	List<Car> toyotaList = new ArrayList<>();
	toyotaList.add(new Car("Toyota", "Camry"));
	toyotaList.add(new Car("Toyota", "Avalon"));
	toyotaList.add(new Car("Toyota", "Prius"));
	map.put("Toyota", toyotaList);
	List<Car> fordList = new ArrayList<>();
	fordList.add(new Car("Ford", "Taurus"));
	fordList.add(new Car("Ford", "Crown Victoria"));
	fordList.add(new Car("Ford", "Escape"));
	map.put("Ford", fordList);
	List<Car> hondaList = new ArrayList<>();
	hondaList.add(new Car("Honda", "Civic"));
	hondaList.add(new Car("Honda", "Accord"));
	hondaList.add(new Car("Honda", "Prius"));
	map.put("Honda", hondaList);
	return map;
    }
    
}
