package com.ttran.practice.rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents8(List<Integer> grades) {

       return grades.stream().map(grade ->
                     (grade < 38 || grade % 5 <3 )? grade: grade + (grade % 5) -1
        ).collect(Collectors.toList());

    }



    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> list = new ArrayList<>(grades.size());
        for (Integer grade : grades) {
            Integer g =  (grade < 38 || grade % 5 < 3 )? grade: grade + (5 -  grade % 5);
            list.add(g);
        }
        return list;
    }

    public static void main(String[] args) {
        Integer[] grades = {4,33, 38, 56, 58};
        List list = Arrays.asList(grades);
        List values = gradingStudents(list);

        for (Object value : values) {
            System.out.println(value);
        }

    }

}
