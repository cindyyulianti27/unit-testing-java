package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentGradeTest {

    private StudentGrade studentGrade;

    @BeforeEach
    public void setUp() {
        studentGrade = new StudentGrade();
    }

    // P1: Skor tidak valid
    @Test
    public void testInvalidScore() {
        assertThrows(IllegalArgumentException.class,
                () -> studentGrade.calculateGrade(-1));
    }

    // P2: Grade A
    @Test
    public void testA() {
        assertEquals("A", studentGrade.calculateGrade(80));
    }

    // P3: Grade B
    @Test
    public void testB() {
        assertEquals("B", studentGrade.calculateGrade(70));
    }

    // P4: Grade C
    @Test
    public void testC() {
        assertEquals("C", studentGrade.calculateGrade(60));
    }

    // P5: Grade D
    @Test
    public void testD() {
        assertEquals("D", studentGrade.calculateGrade(50));
    }

    // P6: Grade E
    @Test
    public void testE() {
        assertEquals("E", studentGrade.calculateGrade(49));
    }

    // Q1: Skor tidak valid pada isPassed()
    @Test
    public void testInvalidPassed() {
        assertThrows(IllegalArgumentException.class,
                () -> studentGrade.isPassed(-1));
    }

    // Q2: Mahasiswa lulus
    @Test
    public void testLulus() {
        assertTrue(studentGrade.isPassed(60));
    }

    // Q3: Mahasiswa tidak lulus
    @Test
    public void testTidakLulus() {
        assertFalse(studentGrade.isPassed(59));
    }
}
