package com.example.core.chap02;

public class JapaneseRastaurant implements Restaurant{

    private Chef chef;

    private Course course;

    public JapaneseRastaurant(){
        this.chef = new JapaneseChef();
        this.course = new JapaneseCourse();
    }

    @Override
    public void order(){
        System.out.println("일식을 주문합니다");
    }
}
