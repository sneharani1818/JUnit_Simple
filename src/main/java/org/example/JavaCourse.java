package org.example;

public class JavaCourse implements Course{

    @Override
    public boolean coursePurchased() {
        System.out.println("Java Course purchased");
        return true;
    }
}
