
public class StudentDemo {

    private String name;
    private int code;
    private int maxCourse;
    //constructor
    public StudentDemo(String givenName, int givenCode)
    {
        setName(givenName);
        setCode(givenCode);
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the maxCourse
     */
    public int getMaxCourse() {
        return maxCourse;
    }

    /**
     * @param maxCourse the maxCourse to set
     */
    public void setMaxCourse(int maxCourse) {
        this.maxCourse = maxCourse;
    }
    
    
}
