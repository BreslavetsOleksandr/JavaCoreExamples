package ru.geekbrains.qa.java2.lesson4.HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contacts {

    Map<String, List<String>> contacts = new HashMap<>();

    public void add(String name, String phone) {
        if (contacts.containsKey(name)) {
            ArrayList<String> strings = new ArrayList<>(contacts.get(name));
            strings.add(phone);
            contacts.put(name, strings);
        } else {
            contacts.put(name, List.of(phone));
        }
    }

    public List<String> getPhones(String name) {
        return contacts.get(name);
    }

    public void printNames() {
        System.out.println("Список имен в контактной книге");
        System.out.println(contacts.keySet());
    }

}
