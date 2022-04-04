package com.example.guilessonnum2;

public class Friend {
    private String name;
    private int age;
    private String job;

    Friend(String firstName, String lastName, int age, String job) {
        this.name = firstName + " " + lastName;
        this.age = age;
        this.job = job;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return name +
                ", age: " + age +
                ", job: " + job ;
    }
}
