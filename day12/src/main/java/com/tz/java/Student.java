package com.tz.java;

/**
 * @author tzstart
 * @create 2021-07-25 16:21
 */

public class Student {

    private int id;

    private int Score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Score=" + Score +
                '}';
    }
}
