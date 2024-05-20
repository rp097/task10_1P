package task10_1P;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestOnTrack {

	//Test GetUnits()
	
	@Test
	public void testGetUnitsValidInput()
	{
        String[] expectedUnits = {"SIT707", "SIT744", "SIT719", "SIT718"};
        String[] actualUnits = OnTrackFunctions.getUnits("PG", "s222606849");
        assertArrayEquals(expectedUnits, actualUnits);
	}
	
	@Test
	public void testGetUnitsIncorrectDegreeLevel()
	{
        String[] expectedUnits = {};
        String[] actualUnits = OnTrackFunctions.getUnits("UG", "s222606849");
        assertArrayEquals(expectedUnits, actualUnits);
	}
	
	@Test
	public void testGetUnitsBlankDegreeLevel()
	{
        String[] expectedUnits = {};
        String[] actualUnits = OnTrackFunctions.getUnits("", "s222606849");
        assertArrayEquals(expectedUnits, actualUnits);
	}
	
	@Test
	public void testGetUnitsIncorrectStudentID()
	{
        String[] expectedUnits = {};
        String[] actualUnits = OnTrackFunctions.getUnits("PG", "s333606848");
        assertArrayEquals(expectedUnits, actualUnits);
	}
	
	@Test
	public void testGetUnitsBlankStudentID()
	{
        String[] expectedUnits = {};
        String[] actualUnits = OnTrackFunctions.getUnits("PG", "");
        assertArrayEquals(expectedUnits, actualUnits);
	}
	
	//Test GetTasks()
	@Test
    public void testGetTasksValidUnitCode() {
        String[] expectedTasks = {"Task 1.1P", "Task 2.1P", "Task 3.2C", "Task 4.3D"};
        String[] actualTasks = OnTrackFunctions.getTasks("SIT707");
        assertArrayEquals(expectedTasks, actualTasks);
    }
	
	@Test
    public void testGetTasksInvalidUnitCode() {
        String[] expectedTasks = {};
        String[] actualTasks = OnTrackFunctions.getTasks("BIT808");
        assertArrayEquals(expectedTasks, actualTasks);
    }
	
	@Test
    public void testGetTasksBlankUnitCode() {
        String[] expectedTasks = {};
        String[] actualTasks = OnTrackFunctions.getTasks("");
        assertArrayEquals(expectedTasks, actualTasks);
    }
	
}
