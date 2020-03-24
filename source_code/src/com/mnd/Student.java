package com.mnd;

public class Student {
    private String studentCode;
    private String name;
    private String studentClass;
    private String phone;
    private String email;
    private String address;

    public Student(String studentCode,
                   String name,
                   String studentClass,
                   String phone,
                   String email,
                   String address
    ) {
        this.studentCode = studentCode;
        this.name = name;
        this.studentClass = studentClass;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Student compare(String studentCode) {
        if (studentCode.equals(this.studentCode)) return this;
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCode='" + studentCode + '\'' +
                ", name='" + name + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
