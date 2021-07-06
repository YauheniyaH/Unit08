package com.epam.unit08.task01;


import java.util.Comparator;

public class NameSorter implements Comparator<Customer> 
{
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
    }
}