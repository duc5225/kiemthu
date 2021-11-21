package com.example.noice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    // Kiểm thử giá trị biên

    @Test
    void Test1() {
        assertEquals(false, Problem.solve("a*bc",""));
    }

    @Test
    void Test2() {
        assertEquals(false, Problem.solve("a*bc","a"));
    }

    @Test
    void Test3() {
        assertEquals(true, Problem.solve("a*bc","abc"));
    }

    @Test
    void Test4() {
        assertEquals(false, Problem.solve("a*bc","xyznmljasikhfbuieqwbfiqbfiqsbfsqijbfijsfqbfisbfibwijqbsfjbsqfiqs"));
    }

    @Test
    void Test5() {
        assertEquals(false, Problem.solve("a*bc","1xyznmljasikhfbuieqwbfiqbfiqsbfsqijbfijsfqbfisbfibwijqbsfjbsqfiqs"));
    }

    @Test
    void Test6() {
        assertEquals(false, Problem.solve("","abc"));
    }

    @Test
    void Test7() {
        assertEquals(false, Problem.solve("a","abc"));
    }

    @Test
    void Test8() {
        assertEquals(true, Problem.solve("abc","abc"));
    }

    @Test
    void Test9() {
        assertEquals(false, Problem.solve("xyz*nmljasikhfbuieqwbfiqbfiqsbfsqijbfijsfqbfisbfibwijqbsfjbsqfiqs","abc"));
    }

    @Test
    void Test10() {
        assertEquals(false, Problem.solve("1xyz*nmljasikhfbuieqwbfiqbfiqsbfsqijbfijsfqbfisbfibwijqbsfjbsqfiqs","abc"));
    }

    // Kiểm thử bảng quyết định

    @Test
    void Test11() {
        assertEquals(false, Problem.solve("123","1234"));
    }

    @Test
    void Test12() {
        assertEquals(true, Problem.solve("123","123"));
    }

    @Test
    void Test13() {
        assertEquals(true, Problem.solve("12*3","123"));
    }

    @Test
    void Test14() {
        assertEquals(false, Problem.solve("12*3","142"));
    }

    @Test
    void Test15() {
        assertEquals(false, Problem.solve("12*3","124"));
    }

    @Test
    void Test16() {
        assertEquals(true, Problem.solve("12*3","12003"));
    }

    // Kiểm thử dòng dữ liệu

    @Test
    void Test17() {
        assertEquals(true, Problem.solve("a*c","abc"));
    }

    @Test
    void Test18() {
        assertEquals(true, Problem.solve("ab*","abc"));
    }

    @Test
    void Test19() {
        assertEquals(true, Problem.solve("*bc","abc"));
    }

}