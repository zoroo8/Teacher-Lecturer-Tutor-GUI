    
/**
 * Write a description of class Teacher here.
 *
 * @author (Sabin Karki)
 * @version (a version number or a date)
 */
public class Teacher
{
    //Attributes
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    //Constructor
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus)
    {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address= address;
        this.workingType= workingType;
        this.employmentStatus= employmentStatus;
    }
    
    //Accessor Method
    public int getTeacherId(){
    return this.teacherId;
    }
    public String getTeacherName(){
    return this.teacherName;
    }
    public String getAddress(){
    return this.address;
    }
    public String getWorkingType(){
    return this.workingType;
    }
    public String getEmploymentStatus(){
    return this.employmentStatus;
    }
    public int getWorkingHours(){
    return this.workingHours;
    }
    
    //Setter Method
    public void setWorkingHours(int workingHours){
    this.workingHours= workingHours;
    }
    
    //Display method
    public void display(){
    System.out.println("Teacher ID: "+this.getTeacherId());
    System.out.println("Teacher Name: "+this.getTeacherName());
    System.out.println("Teacher Address: "+this.getAddress());
    System.out.println("Teacher Working Type: "+this.getWorkingType());
    System.out.println("Teacher Employment Status: "+this.getEmploymentStatus());
    //Applying condition
    if(getWorkingHours()>0){
        System.out.println("Teacher Working Hours: "+this.getWorkingHours());
    }else{
    System.out.println("Teacher Working Hours: null");
    }
    }
}
