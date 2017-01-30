
/**
 * Write a description of class Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Employee extends Person
{
    private int startDate;
    private String positionTitle;
    
    public Employee()
    {
        startDate = 0;
        positionTitle = "";
    }
    
    public Employee(int s, String p){
        startDate = s;
        positionTitle = p;
    }
    
    public int getStartDate(){
        return startDate;
    }
    
    public String getPositionTitle(){
        return postionTitle;
    }
    
    public int yearsServed(){
        
    }
}
