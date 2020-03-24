package com.mnd;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Constants {
    public static final String PORT = "5665";

    public static final String HOST = "localhost";

    public static final String SERVICE_NAME = "getStudent";

    public static final ArrayList<Student> STUDENTS = new ArrayList<>(Arrays.asList(
            new Student("16022410", "Manh Nguyen", "K61 CA CLC2", "0809070605", "16022410@gmail.com", "G2 UET"),
            new Student("16022411", "Hanh Nguyen", "K61 CA CLC3", "0703050102", "16022411@gmail.com", "G2 UET"),
            new Student("16022412", "Duong Nguyen", "K61 CA CLC1", "012030412", "16022412@gmail.com", "GD2 UET"),
            new Student("16022413", "Son Nguyen", "K62 CA CLC2", "091234413123", "16022413@gmail.com", "GD2 UET")
    ));
}
