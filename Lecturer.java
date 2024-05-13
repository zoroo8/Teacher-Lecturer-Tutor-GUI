    
/**
 * Write a description of class Lecturer here.
 *
 * @author (Sabin Karki)
 * @version (a version number or a date)
 */
//It is an child class to Teacher and is an hierarchical model
public class Lecturer extends Teacher
{
    //Attributes
    private String department,grade;
    private int yearOfExperience;
    private int gradedScore;
    private boolean hasGraded;

    //Constructor
    public Lecturer(int teacherId, String teacherName, String address, String workingType, String employmentStatus,int workingHours, String department, int yearOfExperience)
    {
        //Calling teacher (parent class or super class) 
        super(teacherId, teacherName, address, workingType, employmentStatus);
        this.setWorkingHours(workingHours);
        this.department= department;
        this.yearOfExperience= yearOfExperience;
        this.gradedScore= 0; //Assigning Default Value
        this.hasGraded= false; //Assigning 'false' as told in scenario
    }
    
     //Accessor Method
    public String getDepartment(){
    return this.department;
    }
    public int getYearOfExperience(){
    return this.yearOfExperience;
    }
    public int getGradedScore(){
    return this.gradedScore;
    }
    public boolean getHasGraded(){
    return this.hasGraded;
    }
    
    public String getGrade(){
    return this.grade;
    }
    
    //Mutator Method
    public void setGradedScore(int gradedScore){
    this.gradedScore= gradedScore;
    }
    
    //gradeAssignment Method
    public void gradeAssignment(int gradedScore, String department, int yearOfExperience){
    //Checking whether Assignment is checked or not
    if(this.hasGraded){
    System.out.println("The assignment has already been graded.");
    }
    //In case of not grading, operationg steps
    if(yearOfExperience>=5 && getDepartment()==this.department)
    {
    //Finding which grade has student achieved
    if (gradedScore >= 70 && gradedScore <= 100) {
        this.grade = "Grade A has been secured";
    } else if (gradedScore >= 60) {
        this.grade = "Grade B has been secured";
    } else if (gradedScore >= 50) {
        this.grade = "Grade C has been secured";
    } else if (gradedScore >= 40) {
        this.grade = "Grade D has been secured";
    } else if (gradedScore < 40) {
        this.grade = "Grade E has been secured";
    } else {
        this.grade = "Input correct graded score in it.";
    }
    System.out.println(getGrade());
    this.hasGraded= true;//As in scenario it is changed to 'true' to not be graded again
    }else{
    //In case of not meeting requirements as above
    System.out.println("The above requirement hasn't been met.");
    }
    }
    
    //Display Method
    public void display(){
        //Calling display method in Teacher class
        System.out.println("Teacher ID: "+this.getTeacherId());
        System.out.println("Teacher Name: "+this.getTeacherName());
        System.out.println("Teacher Address: "+this.getAddress());
        System.out.println("Teacher Working Type: "+this.getWorkingType());
        System.out.println("Teacher Employment Status: "+this.getEmploymentStatus());
        //Applying condition
        System.out.println("Teacher Working Hours: " + (getWorkingHours() > 0 ? this.getWorkingHours() : "null"));
    
        //We could also use 'super.display()' for calling display method in Teacher class as it shortens the method but still the method could be considered method overiding
        
        //Displaying the values of Lecturer class
        System.out.println("Department: "+this.getDepartment());
        System.out.println("Year of Experience: "+this.getYearOfExperience());
        System.out.println("Graded Score: "+this.getGradedScore());
        //Checking whether the Assignments has been graded or not and Displaying the values
        if(hasGraded){
        System.out.println("Graded: "+this.getHasGraded());
        }else{
        System.out.println("Assignment hasnt been graded yet.");
        }
    }
}
