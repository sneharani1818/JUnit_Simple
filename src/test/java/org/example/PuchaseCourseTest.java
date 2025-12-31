package org.example;

import junit.framework.TestCase;

public class PuchaseCourseTest extends TestCase {

    public void testProceedWithCourse() {
        Course course=new JavaCourse();
        assertTrue(course.coursePurchased());
    }
}