
/**
 * Write a description of class Tutor here.
 *
 * @author (Sabin Karki)
 * @version (a version number or a date)
 */
//It is an child class to Teacher and is an hierarchical model
public class Tutor extends Teacher
{
    // Attributes
    private double salary;
    private String specialization;
    private String academicQualification;
    private int performanceIndex;
    private boolean isCertified;
    
    // Constructor 
    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus, int workingHours, double salary, String specialization, String academicQualification, int performanceIndex)
    {
        // Calling teacher (parent class or super class) 
        super(teacherId, teacherName, address, workingType, employmentStatus);
        this.setWorkingHours(workingHours);
        this.salary= salary;
        this.specialization= specialization;
        this.academicQualification= academicQualification;
        this.performanceIndex= performanceIndex;
        this.isCertified= false;// Assigning 'false' as in question
    }
    
    //Getter Method
    public double getSalary(){
    return this.salary;
    }
    public String getSpecialization(){
    return this.specialization;
    }
    public String getAcademicQualification(){
    return this.academicQualification;
    }
    public int getPerformanceIndex(){
    return this.performanceIndex;
    }
    public boolean getIsCertified(){
    return this.isCertified;
    }
    
    //Set Method
    public void set(double new_salary, int newPerformanceIndex){
    if(getIsCertified()){//Checking certification of tutor either true or false
    System.out.println("The tutor hasn't been certified yet. So, salary cannot be approved");
    return;
    }
    
    //Requirement for increment in salary
    if(newPerformanceIndex>5 && getWorkingHours()>20){
    //Condtion for salary increment
    if(newPerformanceIndex>=5 && newPerformanceIndex<=7){
    new_salary=getSalary()+ (5 * getSalary())/100 ;//Formula in case of Performance Index between 5 and 7
    System.out.println("The salary is "+getSalary()+" and after performance index bonus the new salary is "+new_salary );
    }else if(newPerformanceIndex>=8 && newPerformanceIndex<=9){
    new_salary=getSalary() + (10 * getSalary())/100 ;//Formula in case of Performance Index between 8 and 9
    System.out.println("The salary is "+getSalary()+" and after performance index bonus the new salary is "+new_salary );
    }else if(newPerformanceIndex==10){
    new_salary= (getSalary() + (20 * getSalary())/100 );//Formula in case of Performance Index exactly 10
    System.out.println("The salary is "+getSalary()+" and after performance index bonus the new salary is "+ new_salary );
    }else{
    //In case of not having enough Performance Index to get more salary
    System.out.println("No salary for you man because performance index is too low! Get some diligence performance in you.");
    }
    //The status of isCertified is then set to true
    this.isCertified= true;
    //Setting values for set method
    this.salary=new_salary;
    this.performanceIndex=newPerformanceIndex;
    }
    }

    //removeTutor Method
    public void removeTutor(){
    if(this.isCertified=true){
    this.salary=0;
    this.specialization="";
    this.academicQualification="";
    this.performanceIndex=0;
    this.isCertified=false;
    System.out.println("The tutor has been removed because of not getting certified.");
    }else{
    System.out.println("The tutor cannot be removed because of his/her Certification.");
    }
    }   
    
    //Display Method
    public void display(){
    if(this.isCertified=false){
    //Calling display method in Teacher class as question says to display only these
    System.out.println("Teacher ID: "+this.getTeacherId());
    System.out.println("Teacher Name: "+this.getTeacherName());
    System.out.println("Teacher Address: "+this.getAddress());
    System.out.println("Teacher Working Type: "+this.getWorkingType());
    System.out.println("Teacher Employment Status: "+this.getEmploymentStatus());
    if(getWorkingHours()>0){
        System.out.println("Teacher Working Hours: "+this.getWorkingHours());
    }else{
    System.out.println("Teacher Working Hours: null");
    }
    //We could also use 'super.display()' for calling display method in Teacher class as it shortens the method but still the method could be considered method overiding
    
    //Displaying detail isn't available incase of removing tutor of Tutor sub class
    System.out.println("The tutor detail isn't available");
    }else{
    //Calling display method in Teacher class
    System.out.println("Teacher ID: "+this.getTeacherId());
    System.out.println("Teacher Name: "+this.getTeacherName());
    System.out.println("Teacher Address: "+this.getAddress());
    System.out.println("Teacher Working Type: "+this.getWorkingType());
    System.out.println("Teacher Employment Status: "+this.getEmploymentStatus());
    if(getWorkingHours()>0){
        System.out.println("Teacher Working Hours: "+this.getWorkingHours());
    }else{
    System.out.println("Teacher Working Hours: null");
    }
    //We could also use 'super.display()' for calling display method in Teacher class as it shortens the method but still the method could be considered method overiding
    
    //Displaying the values of Tutor class
    System.out.println("Salary: "+this.getSalary());
    System.out.println("Specialization: "+this.getSpecialization());
    System.out.println("Academic Qualification: "+this.getAcademicQualification());
    System.out.println("Performance Index: "+this.getPerformanceIndex());
    }
    }
}
