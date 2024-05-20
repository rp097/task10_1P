package task10_1P;

public class OnTrackFunctions {

    public static String[] getUnits(String degreeLevel, String studentId) {
        String[] pgUnits = {"SIT707", "SIT744", "SIT719", "SIT718"};
        if ("PG".equals(degreeLevel) && "s222606849".equals(studentId)){
            return pgUnits;
        } else {
            return new String[]{}; //Return an empty array if the degree level is not found
        }
    }
	
    public static String[] getTasks(String unitCode) {
        String[] sit707Tasks = {"Task 1.1P", "Task 2.1P", "Task 3.2C", "Task 4.3D"};
        String[] sit744Tasks = {"Task 6.1P", "Task 6.2C", "Task 7.3D"};
        String[] sit719Tasks = {"Task 8.1P", "Task 9.2C", "Task 10.3D"};
        String[] sit718Tasks = {"Task 1.1P", "Task 2.3D", "Task 4.2C"};

        
        if(unitCode.equals("SIT707")) {
        	return sit707Tasks;
        }
        else if(unitCode.equals("SIT744")) {
        	return sit744Tasks;
        }
        else if(unitCode.equals("SIT719")) {
        	return sit719Tasks;
        }
        else if(unitCode.equals("SIT718")) {
        	return sit718Tasks;
        }
        else
        {
        	return new String[]{}; // Return an empty array if the unit code is not found
        }
                
        
    }
}
	
