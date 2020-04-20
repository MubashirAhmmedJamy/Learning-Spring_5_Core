package com.javaKnowledge;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private Address address;
    private List<Address> add;
    private List<String> books;

    public Employee(int id, String name, Address address, List<Address> add, List<String> books) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.add = add;
        this.books = books;
    }
//    
//
//    
//    
//    public Employee(int id, String name, Address address, List<Address> add) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//        this.add = add;
//    }
//
//    public Employee(int id, String name, Address address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }
//
//    public Employee() {
//        
//    }
//    
//    public Employee(int id) {
//        this.id = id;
//    }
//
//    public Employee(String name) {
//        this.name = name;
//    }
//
//    public Employee(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
    
    public void show(){
        System.out.println(id+" : "+name);
        System.out.println(address);
        System.out.println(add);
        System.out.println(books);
    }
}
