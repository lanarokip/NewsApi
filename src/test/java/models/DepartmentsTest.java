package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentsTest {
    @Test
//    String departmentName , int No_workers)
    public void depertment_instantiates_correctly() {
        Departments departments= new Departments("engineering",5);
        assertEquals(true, departments instanceof Departments);
    }

    @Test
    public void input_correctly_4() {
        Departments departments= new Departments("engineering",5);
        assertEquals("engineering",departments.getDepartmentName());
    }
}