package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class GradeTest {

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionNonNumber(){
        Grade grade = new Grade();
        grade.getGrade("3","a");
        grade.getGrade("4","a");
        grade.getGrade("a","50");
        grade.getGrade("b","100");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionWrongCredit(){
        Grade grade = new Grade();
        grade.getGrade("5","240");
        grade.getGrade("2","240");
    }


    @Test(expected = IllegalArgumentException.class)
    public void testExceptionUpper(){
        Grade grade = new Grade();
        grade.getGrade("3","401");
        grade.getGrade("4","401");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionLower(){
        Grade grade = new Grade();
        grade.getGrade("3","401");
        grade.getGrade("4","401");
    }


    @Test
    public void testGradeA() {
        Grade grade = new Grade();
        assertEquals("A expected",'A',grade.getGrade("3","240"));
        assertEquals("A expected",'A',grade.getGrade("3","239.1"));
        assertEquals("A expected",'A',grade.getGrade("4","320"));
        assertEquals("A expected",'A',grade.getGrade("4","319.1"));
    }

    @Test
    public void testGradeB() {
        Grade grade = new Grade();
        assertEquals("B expected",'B',grade.getGrade("3","210"));
        assertEquals("B expected",'B',grade.getGrade("3","219.1"));
        assertEquals("B expected",'B',grade.getGrade("4","280"));
        assertEquals("B expected",'B',grade.getGrade("4","279.1"));
    }

    @Test
    public void testGradeC() {
        Grade grade = new Grade();
        assertEquals("C expected",'C',grade.getGrade("3","180"));
        assertEquals("C expected",'C',grade.getGrade("3","179.1"));
        assertEquals("C expected",'C',grade.getGrade("4","240"));
        assertEquals("C expected",'C',grade.getGrade("4","239.1"));
    }

    @Test
    public void testGradeF() {
        Grade grade = new Grade();
        assertEquals("F expected",'F',grade.getGrade("3","179"));
        assertEquals("F expected",'F',grade.getGrade("3",".1"));
        assertEquals("F expected",'F',grade.getGrade("4","239"));
        assertEquals("F expected",'F',grade.getGrade("4",".1"));
    }



}