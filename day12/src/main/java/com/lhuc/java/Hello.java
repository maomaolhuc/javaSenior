package com.lhuc.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author lhucstart
 * @create 2021-07-25 16:23
 */
public class Hello {

    private int NUM = 100;


    @Test
    public void testSort() {

        List<Student> list = new ArrayList<>();

        Random random = new Random();
        for (int i = 1; i <= 100; i++) {
            Student student = new Student();
            student.setId(i);
            int score = random.nextInt(41)+ 60;
            student.setScore(score);
            list.add(student);
        }

        List<Student> studentList = list.stream().sorted(Comparator.comparing(Student::getScore)
                .reversed()).collect(Collectors.toList());


        int len = studentList.size();
        for(int i=0;i<len;i++){
            int rank = i + 1;
            System.err.println("学生id：" + studentList.get(i).getId() + "，分数："
                    + studentList.get(i).getScore() + "，第"+rank+"名");
        }


    }


}
