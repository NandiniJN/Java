package Practice;

public class Exception_Activity {

	public static void main(String[] args) {
		
		try {
			Exception_Activity.exceptionTest("Will print to console");
			Exception_Activity.exceptionTest(null);
			Exception_Activity.exceptionTest("Won't execute");
        } catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }

	}

}
