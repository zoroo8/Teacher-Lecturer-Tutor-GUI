import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TeacherGUI{
    // Instance variables
    JFrame frame, secframe, thirframe;
    JPanel panel, secpanel, thirpanel;
    JScrollPane scrollPane;
    JMenuBar menuBar;
    JMenu fileMenu, viewMenu, fontMenu, helpMenu, settingMenu, aboutMenu;
    JMenuItem fileNew, fileOpen, viewLight, viewDark,fontSmall,fontMedium,fontBig;
    JLabel companyName,headdesc, lectdesc, tutdesc;
    JButton lecturerButton, tutorButton, clear, regi, display;
    //For secframe
    JLabel labid1, labname1, labaddr1, labworkty1, labempsta1, labworkhr1, labdep1, labyoe1, labgrasco1;
    JLabel gradeassignmentLabel;
    JTextField id1, name1, addr1, workty1, workhr1, dep1, yoe1, grasco1;
    JRadioButton empsta1a,empsta1b,empsta1c;
    //for thirframe
    JLabel labid2, labname2, labaddr2, labworkty2, labempsta2, labworkhr2, labsal2, labspec2, labacaqua2, labperfind2;
    JTextField id2, name2, addr2, workty2, workhr2, sal2, spec2, acaqua2;
    JRadioButton empsta2a,empsta2b,empsta2c;
    JComboBox<String> perfind2;
    JLabel moreDesc,salaryDesc,remtutorDesc;
    //ArrayList
    private ArrayList <Teacher> teachers= new ArrayList<>();

    public TeacherGUI() {
        //Creating Frame and Panels 
        frame = new JFrame("GUI");
        frame.setSize(600, 400);
        frame.setLayout(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(3000, 1080);
        frame.add(panel);

        //MenuBar
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        fileMenu = new JMenu("File");
        viewMenu = new JMenu("View");
        fontMenu = new JMenu("Font");
        helpMenu = new JMenu("Setting");
        settingMenu = new JMenu("Help");
        aboutMenu = new JMenu("About");
        
        //MenuItems
        fileNew= new JMenuItem("New");
        fileOpen= new JMenuItem("Open");
        viewLight = new JMenuItem("Light Mode");
        viewDark = new JMenuItem("Dark Mode");
        fontSmall= new JMenuItem("Small");
        fontMedium= new JMenuItem("Medium");
        fontBig= new JMenuItem("Big");
        
        //Adding these
        fileMenu.add(fileNew);
        fileMenu.add(fileOpen);
        viewMenu.add(viewLight);
        viewMenu.add(viewDark);
        fontMenu.add(fontSmall);
        fontMenu.add(fontMedium);
        fontMenu.add(fontBig);

        menuBar.add(fileMenu);
        menuBar.add(viewMenu);
        menuBar.add(fontMenu);
        menuBar.add(settingMenu);
        menuBar.add(helpMenu);
        menuBar.add(aboutMenu);
        
        viewLight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent l11) {
                setLightview();
            }
        });

        viewDark.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent l1) {
                setDarkview();
            }
        });

        //Inside the frames these components are added
        companyName= new JLabel("SATYA EDUCATION");
        companyName.setFont(new Font("Arial", Font.BOLD, 15));
        companyName.setBounds(220,10,200,40);
        panel.add(companyName);
        
        headdesc = new JLabel("SELECT ANY TEACHERS TO YOUR WISHLIST FOR YOU STUDIES!!");
        headdesc.setFont(new Font("Arial", Font.BOLD, 14));
        headdesc.setBounds(10, 50, 550, 40);
        panel.add(headdesc);

        lecturerButton = new JButton("Lecturer");
        lecturerButton.setBounds(120, 100, 140, 40);
        panel.add(lecturerButton);

        tutorButton = new JButton("Tutor");
        tutorButton.setBounds(330, 100, 140, 40);
        panel.add(tutorButton);

        //Adding functionality to buttons
        lecturerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                lecturerMethod();
            }
        });

        tutorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e2) {
                tutorMethod();
            }
        });

        frame.setVisible(true);
    }

    // lecturerMethod
    private void lecturerMethod() {
        //Creating another frame and panels for runnning this method
        secframe = new JFrame("Lecturer Registration Form");
        secframe.setSize(2000, 1080);
        secframe.setLayout(null);

        secpanel = new JPanel();
        secpanel.setLayout(null);
        secpanel.setSize(2000, 1080);
        secframe.add(secpanel);
        
        //Scrolling setting
        secpanel.setPreferredSize(new Dimension(1000, 1080)); // Set preferred size
        secframe.add(new JScrollPane(secpanel)); // Wrap panel in JScrollPane
        JScrollPane scrollPane = new JScrollPane(secpanel);
        scrollPane.setBounds(0, 0, 1530, 900); // Set bounds for scroll pane
        secframe.add(scrollPane);
        
        //MenuBar Settings
        menuBar = new JMenuBar();
        secframe.setJMenuBar(menuBar);

        fileMenu = new JMenu("File");
        viewMenu = new JMenu("View");
        fontMenu = new JMenu("Font");
        helpMenu = new JMenu("Setting");
        settingMenu = new JMenu("Help");
        aboutMenu = new JMenu("About");

        fileNew= new JMenuItem("New");
        fileOpen= new JMenuItem("Open");
        viewLight = new JMenuItem("Light Mode");
        viewDark = new JMenuItem("Dark Mode");
        fontSmall= new JMenuItem("Small");
        fontMedium= new JMenuItem("Medium");
        fontBig= new JMenuItem("Big");
        
        fileMenu.add(fileNew);
        fileMenu.add(fileOpen);
        viewMenu.add(viewLight);
        viewMenu.add(viewDark);
        fontMenu.add(fontSmall);
        fontMenu.add(fontMedium);
        fontMenu.add(fontBig);

        menuBar.add(fileMenu);
        menuBar.add(viewMenu);
        menuBar.add(fontMenu);
        menuBar.add(settingMenu);
        menuBar.add(helpMenu);
        menuBar.add(aboutMenu);

        //action listener of theme
        viewLight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent l12) {
                setLightviewsec();
            }
        });

        viewDark.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent l2) {
                setDarkviewsec();
            }
        });

        //Adding components to secpanel
        lectdesc = new JLabel("Lecturer Details");
        lectdesc.setFont(new Font("Arial", Font.PLAIN, 24));
        lectdesc.setBounds(650, 10, 200, 40);
        secpanel.add(lectdesc);
        
        labid1 = new JLabel("Lecturer's ID:");
        labid1.setBounds(500, 90, 130, 40);
        secpanel.add(labid1);
        
        id1 = new JTextField();
        id1.setBounds(650, 90, 150, 35);
        secpanel.add(id1);
        
        labname1 = new JLabel("Lecturer's Name:");
        labname1.setBounds(500, 150, 130, 40);
        secpanel.add(labname1);
        
        name1 = new JTextField();
        name1.setBounds(650, 150, 150, 35);
        secpanel.add(name1);
        
        labaddr1 = new JLabel("Lecturer's Address:");
        labaddr1.setBounds(500, 210, 130, 40);
        secpanel.add(labaddr1);
        
        addr1 = new JTextField();
        addr1.setBounds(650, 210, 150, 35);
        secpanel.add(addr1);
        
        labworkty1 = new JLabel("Working Type:");
        labworkty1.setBounds(500, 270, 130, 40);
        secpanel.add(labworkty1);
        
        workty1 = new JTextField();
        workty1.setBounds(650, 270, 150, 35);
        secpanel.add(workty1);
        
        labempsta1 = new JLabel("Employment Status:");
        labempsta1.setBounds(500, 330, 130, 40);
        secpanel.add(labempsta1);
        
        empsta1a = new JRadioButton("Employed");
        empsta1a.setBounds(650, 330, 100, 35);
        empsta1b= new JRadioButton("UnEmployed");
        empsta1b.setBounds(750, 330, 100, 35);
        empsta1c= new JRadioButton("Part-time");
        empsta1c.setBounds(850, 330, 100, 35);
        
        //grouping
        ButtonGroup empsta1= new ButtonGroup();
        empsta1.add(empsta1a);
        empsta1.add(empsta1b);
        empsta1.add(empsta1c);
        
        secpanel.add(empsta1a);
        secpanel.add(empsta1b);
        secpanel.add(empsta1c);
        
        labworkhr1 = new JLabel("Working Hours:");
        labworkhr1.setBounds(500, 390, 130, 40);
        secpanel.add(labworkhr1);
        
        workhr1 = new JTextField();
        workhr1.setBounds(650, 390, 150, 35);
        secpanel.add(workhr1);
        
        labdep1 = new JLabel("Department:");
        labdep1.setBounds(500, 450, 130, 40);
        secpanel.add(labdep1);
        
        dep1 = new JTextField();
        dep1.setBounds(650, 450, 150, 35);
        secpanel.add(dep1);
        
        labyoe1 = new JLabel("Year Of Experience:");
        labyoe1.setBounds(500, 510, 130, 40);
        secpanel.add(labyoe1);
        
        yoe1 = new JTextField();
        yoe1.setBounds(650, 510, 150, 35);
        secpanel.add(yoe1);
        
        clear = new JButton("Clear");
        clear.setBounds(450, 570, 130, 35);
        secpanel.add(clear);
        
        regi = new JButton("Register");
        regi.setBounds(600, 570, 130, 35);
        secpanel.add(regi);
        
        display= new JButton("Display");
        display.setBounds(750,570,130,35);
        secpanel.add(display);
        
        //using HTML-formatted text content and using <br> to break lines
        gradeassignmentLabel= new JLabel("<html>The Grade Assignment button allows the user to <br> assign grades or scores to assignments submitted<br> by students. If you wanna check your grade click on<br> Grade assignment below.</html>");
        gradeassignmentLabel.setBounds(60,630,700,60);
        secpanel.add(gradeassignmentLabel);
        
        JButton gradeAssignment= new JButton("Grade Assignment");
        gradeAssignment.setBounds(125,700,150,35);
        secpanel.add(gradeAssignment);
        
        //Onclicking buttons ActionListener does run
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent c1) {
                JOptionPane.showMessageDialog(clear,"Clear all field?","Clear",JOptionPane.WARNING_MESSAGE);
                //Removing the content of textfields
                id1.setText("");
                name1.setText("");
                addr1.setText("");
                workty1.setText("");
                empsta1.clearSelection();
                workhr1.setText("");
                dep1.setText("");
                yoe1.setText("");
            }
        });
        
        regi.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent r1) {
                int choice=JOptionPane.showConfirmDialog(regi,"Are all the detail given OK?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(choice==JOptionPane.NO_OPTION){
                    //Removing the content of textfields
                    id1.setText("");
                    name1.setText("");
                    addr1.setText("");
                    workty1.setText("");
                    empsta1.clearSelection();
                    workhr1.setText("");
                    dep1.setText("");
                    yoe1.setText("");
                }
                else{
                    try{
                        //keeping the inputs in variable
                        int lectid= Integer.parseInt(id1.getText());
                        String lectname= name1.getText();
                        String lectadd=addr1.getText();
                        String lectworkty=workty1.getText();
                        String lectempsta = "";
                        if (empsta1a.isSelected()) {
                            lectempsta = empsta1a.getText();
                        } else if (empsta1b.isSelected()) {
                            lectempsta = empsta1b.getText();
                        } else if (empsta1c.isSelected()) {
                        lectempsta = empsta1c.getText();
                        }
                        int lectworkhr=Integer.parseInt(workhr1.getText());
                        String lectdep= dep1.getText();
                        int lectyoe=Integer.parseInt(yoe1.getText());
                        boolean idExists = false;
                        //checking whether id validation
                        for (Teacher user : teachers) {
                            if (user.getTeacherId() == lectid) {
                                idExists = true;
                                break;
                            }
                        }
                        if(idExists) {
                        JOptionPane.showMessageDialog(secframe, "ID already exists. Please enter a unique ID.", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                        Lecturer lec= new Lecturer(lectid,lectname,lectadd,lectworkty,lectempsta,lectworkhr,lectdep,lectyoe);
                        teachers.add(lec);

                        JOptionPane.showMessageDialog(secframe, "Registered successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                    }   
                    catch(NumberFormatException e101){
                        JOptionPane.showMessageDialog(secframe, "Please enter valid numeric values for ID, working hours and year of experience.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        
        //GradeAssignment Method
        gradeAssignment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ga) {
                JFrame gradeassignmentFrame = new JFrame("Grade Assignment");
                gradeassignmentFrame.setSize(400,400);
                    
                gradeassignmentFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    
                JPanel gaPanel = new JPanel(new GridLayout(10,1));
                gradeassignmentFrame.add(gaPanel);
                    
                gaPanel= new JPanel(new GridBagLayout());
                GridBagConstraints constraints= new GridBagConstraints();
                constraints.fill= GridBagConstraints.HORIZONTAL;
                constraints.insets= new Insets(10,10,10,10);
                
                //components
                JLabel gaDesc = new JLabel("Grade Assignment");
                gaDesc.setFont(new Font("Arial", Font.BOLD, 17));
                
                JLabel labveriid1 = new JLabel("Lecturer ID:");
                
                JTextField veriid1 = new JTextField(15); 
                
                JLabel labverigrasco1 = new JLabel("Graded Score:");
            
                JTextField verigrasco1 = new JTextField(15);
                    
                JLabel labveridep1 = new JLabel("Department:");
            
                JTextField veridep1 = new JTextField(15);
            
                JLabel labveriyoe1 = new JLabel("Year Of Experience:");
            
                JTextField veriyoe1 = new JTextField(15);
            
                JButton gasubmit = new JButton("Submit");
                    
                //setting constraints and adding
                constraints.gridx=0;
                constraints.gridy=0;
                gaPanel.add(gaDesc, constraints);
                    
                constraints.gridx = 0;
                constraints.gridy = 1;
                gaPanel.add(labveriid1,constraints);
                    
                constraints.gridx = 1;
                gaPanel.add(veriid1, constraints);
                    
                constraints.gridx = 0;
                constraints.gridy = 2;
                gaPanel.add(labverigrasco1,constraints);
                    
                constraints.gridx = 1;
                gaPanel.add(verigrasco1, constraints);
                
                constraints.gridx=0;
                constraints.gridy=3;
                gaPanel.add(labveridep1, constraints);
                    
                constraints.gridx=1;
                gaPanel.add(veridep1, constraints);
                    
                constraints.gridx=0;
                constraints.gridy=4;
                gaPanel.add(labveriyoe1, constraints);
                    
                constraints.gridx=1;
                gaPanel.add(veriyoe1, constraints);
                    
                constraints.gridx= 0;
                constraints.gridy= 5;
                constraints.gridwidth= 2;
                constraints.anchor= GridBagConstraints.CENTER;
                gaPanel.add(gasubmit, constraints);
                
                gradeassignmentFrame.getContentPane().add(gaPanel,BorderLayout.CENTER);
                    
                gasubmit.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ga1) {
                        int choice=JOptionPane.showConfirmDialog(gasubmit,"Are all the detail given OK?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                            if(choice==JOptionPane.NO_OPTION){
                                veriid1.setText("");
                                verigrasco1.setText("");
                                veridep1.setText("");
                                veriyoe1.setText("");
                            }
                            else if(choice==JOptionPane.YES_OPTION){
                                boolean lectFind= false;
                                int lectID = Integer.parseInt(veriid1.getText()); 
                                int lectgradedScore = Integer.parseInt(verigrasco1.getText());
                                String lectdepartment = veridep1.getText(); 
                                int lectyearsOfExperience = Integer.parseInt(veriyoe1.getText());
                        
                                // Searchig for given lecturer id
                                for (Teacher teacher : teachers) {
                                    if (teacher instanceof Lecturer) {
                                        Lecturer lect = (Lecturer) teacher;
                                        if (lect.getTeacherId()==(lectID)) {
                                            lect.setGradedScore(lectgradedScore);
                                            lect.gradeAssignment(lectgradedScore, lectdepartment, lectyearsOfExperience);
                                            // Displaying information
                                            String message = "Lecturer ID: " + lectID + "\n" + "Graded Score: " + lectgradedScore + "\n" + "Obtained Grade: "+lect.getGrade()+"\n"+ "Department: " + lectdepartment + "\n" + "Years of Experience: " + lectyearsOfExperience;
                                            JOptionPane.showMessageDialog(gradeassignmentFrame,message, "Assignment Graded Successfully!", JOptionPane.INFORMATION_MESSAGE);
                                            lectFind= true;
                                            break;
                                        }
                                    }
                                }
                        
                                // If the loop finishes without finding the lecturer, display an error message
                                if(!lectFind){
                                JOptionPane.showMessageDialog(gradeassignmentFrame, "Lecturer with ID " + lectID + " not found.", "Error404", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                });
                gradeassignmentFrame.setVisible(true);
        }
        });
        
        display.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent d1) {
            if (teachers==null || teachers.isEmpty()) {
                JOptionPane.showMessageDialog(secframe, "No lecturer registered yet.", "Empty", JOptionPane.WARNING_MESSAGE);
            } else {
                String displayMessage = "Lecturer Details:\n";
                for (Teacher teacher : teachers) {
                    if (teacher instanceof Lecturer) {
                        //a new instance of the Lecturer class is created
                        Lecturer lecturer = (Lecturer) teacher;
                        //Calling the method from lecturer class
                        lecturer.display();
                        // Append lecturer details to the displayMessage
                        displayMessage += "Teacher ID: " + lecturer.getTeacherId() + "\n";
                        displayMessage += "Teacher Name: " + lecturer.getTeacherName() + "\n";
                        displayMessage += "Teacher Address: " + lecturer.getAddress() + "\n";
                        displayMessage += "Teacher Working Type: " + lecturer.getWorkingType() + "\n";
                        displayMessage += "Teacher Employment Status: " + lecturer.getEmploymentStatus() + "\n";
                        // Applying condition
                        displayMessage += "Teacher Working Hours: " + (lecturer.getWorkingHours() > 0 ? lecturer.getWorkingHours() : "null") + "\n";
                
                        // Displaying the values of Lecturer class
                        displayMessage += "Department: " + lecturer.getDepartment() + "\n";
                        displayMessage += "Year of Experience: " + lecturer.getYearOfExperience() + "\n";
                        displayMessage += "Graded Score: " + lecturer.getGradedScore() + "\n";
                        // Checking whether the Assignments has been graded or not and Displaying the values
                        if (lecturer.getHasGraded()) {
                            displayMessage += "Graded: " + lecturer.getHasGraded() + "\n";
                        } else {
                            displayMessage += "Assignment hasn't been graded yet.\n";
                        }
                
                        // Append a newline to separate each lecturer's details
                        displayMessage += "\n";
                    }
                }
                JOptionPane.showMessageDialog(secframe, displayMessage, "Lecturer Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    });
        secframe.setVisible(true);
    }
    
    /*
       This method does 
       is tutors add and all of those method like set salary
       and removing tutor
       */
    private void tutorMethod() {
        thirframe = new JFrame("Tutor Registration Form");
        thirframe.setSize(2000, 1080);
        thirframe.setLayout(null);

        thirpanel = new JPanel();
        thirpanel.setLayout(null);
        thirpanel.setSize(2000,1080);
        thirframe.add(thirpanel);
        
        thirpanel.setPreferredSize(new Dimension(1000, 1080)); // Set preferred size
        thirframe.add(new JScrollPane(thirpanel)); // Wrap panel in JScrollPane
        JScrollPane scrollPane = new JScrollPane(thirpanel);
        scrollPane.setBounds(0, 0, 1530, 900); // Set bounds for scroll pane
        thirframe.add(scrollPane);
        
        // MenuBar Settings
        menuBar = new JMenuBar();
        thirframe.setJMenuBar(menuBar);

        fileMenu = new JMenu("File");
        viewMenu = new JMenu("View");
        fontMenu = new JMenu("Font");
        helpMenu = new JMenu("Setting");
        settingMenu = new JMenu("Help");
        aboutMenu = new JMenu("About");

        fileNew= new JMenuItem("New");
        fileOpen= new JMenuItem("Open");
        viewLight = new JMenuItem("Light Mode");
        viewDark = new JMenuItem("Dark Mode");
        fontSmall= new JMenuItem("Small");
        fontMedium= new JMenuItem("Medium");
        fontBig= new JMenuItem("Big");
        
        fileMenu.add(fileNew);
        fileMenu.add(fileOpen);
        viewMenu.add(viewLight);
        viewMenu.add(viewDark);
        fontMenu.add(fontSmall);
        fontMenu.add(fontMedium);
        fontMenu.add(fontBig);

        menuBar.add(fileMenu);
        menuBar.add(viewMenu);
        menuBar.add(fontMenu);
        menuBar.add(settingMenu);
        menuBar.add(helpMenu);
        menuBar.add(aboutMenu);

        viewLight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent l13) {
                setLightviewthir();
            }
        });

        viewDark.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent l3) {
                setDarkviewthir();
            }
        });
        
        //Inputs Fields and Labels
        tutdesc = new JLabel("Tutor's Details");
        tutdesc.setFont(new Font("Arial", Font.PLAIN, 24));
        tutdesc.setBounds(650, 10, 200, 40);
        thirpanel.add(tutdesc);

        labid2 = new JLabel("Tutor's ID:");
        labid2.setBounds(500, 90, 130, 40);
        thirpanel.add(labid2);

        id2 = new JTextField();
        id2.setBounds(650, 90, 150, 35);
        thirpanel.add(id2);

        labname2 = new JLabel("Tutor's Name:");
        labname2.setBounds(500, 150, 130, 40);
        thirpanel.add(labname2);

        name2 = new JTextField();
        name2.setBounds(650, 150, 150, 35);
        thirpanel.add(name2);

        labaddr2 = new JLabel("Tutor’s Address:");
        labaddr2.setBounds(500, 210, 130, 40);
        thirpanel.add(labaddr2);

        addr2 = new JTextField();
        addr2.setBounds(650, 210, 150, 35);
        thirpanel.add(addr2);

        labworkty2 = new JLabel("Working Type:");
        labworkty2.setBounds(500, 270, 130, 40);
        thirpanel.add(labworkty2);

        workty2 = new JTextField();
        workty2.setBounds(650, 270, 150, 35);
        thirpanel.add(workty2);

        labempsta2 = new JLabel("Employment Status:");
        labempsta2.setBounds(500, 330, 130, 40);
        thirpanel.add(labempsta2);

        empsta2a = new JRadioButton("Employed");
        empsta2a.setBounds(650, 330, 100, 35);
        empsta2b= new JRadioButton("UnEmployed");
        empsta2b.setBounds(750, 330, 100, 35);
        empsta2c= new JRadioButton("Part-time");
        empsta2c.setBounds(850, 330, 100, 35);
        //grouping
        ButtonGroup empsta2= new ButtonGroup();
        empsta2.add(empsta2a);
        empsta2.add(empsta2b);
        empsta2.add(empsta2c);
        //adding to third panel
        thirpanel.add(empsta2a);
        thirpanel.add(empsta2b);
        thirpanel.add(empsta2c);

        labworkhr2 = new JLabel("Working Hours:");
        labworkhr2.setBounds(500, 390, 130, 40);
        thirpanel.add(labworkhr2);
        
        workhr2 = new JTextField();
        workhr2.setBounds(650, 390, 150, 35);
        thirpanel.add(workhr2);

        labsal2 = new JLabel("Salary:");
        labsal2.setBounds(500, 450, 130, 40);
        thirpanel.add(labsal2);

        sal2 = new JTextField();
        sal2.setBounds(650, 450, 150, 35);
        thirpanel.add(sal2);

        labspec2 = new JLabel("Specialization:");
        labspec2.setBounds(500, 510, 130, 40);
        thirpanel.add(labspec2);

        spec2 = new JTextField();
        spec2.setBounds(650, 510, 150, 35);
        thirpanel.add(spec2);

        labacaqua2 = new JLabel("Academic Qualification:");
        labacaqua2.setBounds(500, 570, 150, 40);
        thirpanel.add(labacaqua2);

        acaqua2 = new JTextField();
        acaqua2.setBounds(650, 570, 150, 35);
        thirpanel.add(acaqua2);

        labperfind2 = new JLabel("Performance Index:");
        labperfind2.setBounds(500, 630, 130, 40);
        thirpanel.add(labperfind2);

        String Index[]= new String[10];
        for(int j=0;j<10;j++){
        Index[j]= String.valueOf(j+1);
        }
        perfind2 = new JComboBox<>(Index);
        perfind2.setBounds(650, 630, 150, 35);
        thirpanel.add(perfind2);

        clear = new JButton("Clear");
        clear.setBounds(500, 690, 130, 35);
        thirpanel.add(clear);
        
        regi = new JButton("Register");
        regi.setBounds(650, 690, 130, 35);
        thirpanel.add(regi);
        
        display= new JButton("Display");
        display.setBounds(800,690,130,35);
        thirpanel.add(display);
        
        //Other method's button and short descripton
        moreDesc= new JLabel("More Functions");
        moreDesc.setBounds(1000,160,300,30);
        thirpanel.add(moreDesc);
        
        salaryDesc= new JLabel("To Find the Salary according to his/her skill");
        salaryDesc.setBounds(1000,210,300,30);
        thirpanel.add(salaryDesc);
        
        JButton setSalary = new JButton("Salary Calculator");
        setSalary.setBounds(1000,250,300,30);
        thirpanel.add(setSalary);
        
        remtutorDesc= new JLabel("Remove Tutor according to his.her skill.");
        remtutorDesc.setBounds(1000,330,300,30);
        thirpanel.add(remtutorDesc);
        
        JButton removeTutor = new JButton("Remove Tutor");
        removeTutor.setBounds(1000,370,300,30);
        thirpanel.add(removeTutor);
        
        //Clearing the field;s content
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent c2) {
                JOptionPane.showMessageDialog(clear,"Clear all field?","Clear",JOptionPane.WARNING_MESSAGE);
                id2.setText("");
                name2.setText("");
                addr2.setText("");
                workty2.setText("");
                empsta2.clearSelection();
                workhr2.setText("");
                sal2.setText("");
                spec2.setText("");
                acaqua2.setText("");
                int index2 = 0;
                perfind2.setSelectedIndex(index2);
            }
        });
        
        //Registration process where inputs are added into arryalist
        regi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent r2) {
                int choice=JOptionPane.showConfirmDialog(regi,"Are all the detail given OK?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(choice==JOptionPane.NO_OPTION){
                    id2.setText("");
                    name2.setText("");
                    addr2.setText("");
                    workty2.setText("");
                    empsta2.clearSelection();
                    workhr2.setText("");
                    sal2.setText("");
                    spec2.setText("");
                    acaqua2.setText("");
                    int index2 = 0;
                    perfind2.setSelectedIndex(index2);
                }
                else{
                    try{
                        int tutid= Integer.parseInt(id2.getText());
                        String tutname= name2.getText();
                        String tutadd=addr2.getText();
                        String tutworkty=workty2.getText();
                        String tutempsta = "";
                        if (empsta2a.isSelected()) {
                            tutempsta = empsta2a.getText();
                        } else if (empsta2b.isSelected()) {
                            tutempsta = empsta2b.getText();
                        } else if (empsta2c.isSelected()) {
                        tutempsta = empsta2c.getText();
                        }
                        int tutworkhr=Integer.parseInt(workhr2.getText());
                        double tutsal= Double.parseDouble(sal2.getText());
                        String tutspec= spec2.getText();
                        String tutacaqua= acaqua2.getText();
                        int tutperfind=0;
                        boolean idExists=false;
                        for (Teacher user : teachers) {
                            if (user.getTeacherId() == tutid) {
                                idExists = true;
                                break;
                            }
                        }
                        if(idExists) {
                        JOptionPane.showMessageDialog(secframe, "ID already exists. Please enter a unique ID.", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            try {
                                String value = (String) perfind2.getSelectedItem();
                                tutperfind = Integer.parseInt(value);
                            } catch (NumberFormatException num103) {
                                JOptionPane.showMessageDialog(perfind2,"Enter correct input!","OK",JOptionPane.WARNING_MESSAGE);
                            }
                            
                            Tutor tut= new Tutor(tutid,tutname,tutadd,tutworkty,tutempsta,tutworkhr,tutsal,tutspec,tutacaqua,tutperfind);
                            teachers.add(tut);
    
                            JOptionPane.showMessageDialog(thirframe, "Registered successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    catch(NumberFormatException e103){
                        JOptionPane.showMessageDialog(thirframe, "Please enter valid numeric values for ID, working hours, year of experience, graded score, and salary.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                
                }
            }
        });
        
        //Set Salary Method Button
        setSalary.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent set) {
                JFrame setSalaryFrame = new JFrame("Set Salary");
                setSalaryFrame.setSize(400,400);
                    
                setSalaryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    
                JPanel salPanel = new JPanel(new GridLayout(10,1));
                setSalaryFrame.add(salPanel);
                    
                salPanel= new JPanel(new GridBagLayout());
                GridBagConstraints constraints= new GridBagConstraints();
                constraints.fill= GridBagConstraints.HORIZONTAL;
                constraints.insets= new Insets(10,10,10,10);
                    
                //components
                JLabel salDesc = new JLabel("Salary Calculator");
                salDesc.setFont(new Font("Arial", Font.BOLD, 17));
                
                JLabel labveriid = new JLabel("Tutor ID:");
                
                JTextField veriid = new JTextField(15); 
                
                JLabel labverisal = new JLabel("Salary:");
            
                JTextField verisal = new JTextField(15);
                    
                JLabel labveriperfind = new JLabel("Performance Index:");
            
                
                
                String Index[]= new String[10];
                for(int j=0;j<10;j++){
                Index[j]= String.valueOf(j+1);
                }
                JComboBox<String> veriperfind = new JComboBox<>(Index);

            
                JButton salsubmit = new JButton("Calculate");
                    
                //setting constraints and adding
                constraints.gridx=0;
                constraints.gridy=0;
                salPanel.add(salDesc, constraints);
                    
                constraints.gridx = 0;
                constraints.gridy = 1;
                salPanel.add(labveriid,constraints);
                    
                constraints.gridx = 1;
                salPanel.add(veriid, constraints);
                    
                constraints.gridx = 0;
                constraints.gridy = 2;
                salPanel.add(labverisal,constraints);
                    
                constraints.gridx = 1;
                salPanel.add(verisal, constraints);
                
                constraints.gridx=0;
                constraints.gridy=3;
                salPanel.add(labveriperfind, constraints);
                    
                constraints.gridx=1;
                salPanel.add(veriperfind, constraints);
                    
                constraints.gridx= 0;
                constraints.gridy= 4;
                constraints.gridwidth= 2;
                constraints.anchor= GridBagConstraints.CENTER;
                salPanel.add(salsubmit, constraints);
                    
                setSalaryFrame.getContentPane().add(salPanel,BorderLayout.CENTER);
                
                //On clicking calculate this actionListener will be runned
                    salsubmit.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent regi2a) {
                        if(veriid==null || verisal== null){
                        JOptionPane.showMessageDialog(setSalaryFrame,"Empty Field! Please fill the empty box.","OK",JOptionPane.WARNING_MESSAGE);
                        }
                        
                        int choice=JOptionPane.showConfirmDialog(salsubmit,"Are all the detail given OK?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                        if(choice==JOptionPane.NO_OPTION){
                            veriid.setText("");
                            verisal.setText("");
                            int index3 = 0;
                            veriperfind.setSelectedIndex(index3);
                        }
                        else if(choice==JOptionPane.YES_OPTION){
                            boolean tutFind= false;
                            int tutId = Integer.parseInt(veriid.getText()); 
                            double tutsal = Double.parseDouble(verisal.getText());
                            int tutperfind=0;
                            try {
                                String value = (String) veriperfind.getSelectedItem();
                                tutperfind = Integer.parseInt(value);
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(salsubmit,"Enter correct input!","OK",JOptionPane.WARNING_MESSAGE);
                            }
                            
                            //Searchig for given tutor's id
                            for (Teacher teacher : teachers) {
                                if (teacher instanceof Tutor) {
                                    //
                                    Tutor tut = (Tutor) teacher;
                                    if (tut.getTeacherId()==(tutId)) {
                                        tut.set(tutsal,tutperfind);
                                        // Displaying information
                                        String message = "Tutors ID: " + tutId + "\n" + "Old Salary: " + tutsal + "\n" + "Performance Index: "+tutperfind+"\n"+ "New Salary: " + tut.getSalary();
                                        JOptionPane.showMessageDialog(setSalaryFrame,message, "Salary Updated Successfully!", JOptionPane.INFORMATION_MESSAGE);
                                        tutFind= true;
                                        break;
                                    }
                                }
                            }
                            
                            //If the loop finishes without finding the lecturer, display an error message
                            if(!tutFind){
                                JOptionPane.showMessageDialog(setSalaryFrame, "Tutor with ID " + tutId + " not found.", "Error404", JOptionPane.ERROR_MESSAGE);
                            }           
                        }
                }
            });   
            setSalaryFrame.setVisible(true);
            }
        });
        
        //Removing tutor according to his/her certification
        removeTutor.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent rem) {
            String tutorIdStr = JOptionPane.showInputDialog(thirframe, "Enter Tutor ID to remove:", "Remove Tutor", JOptionPane.QUESTION_MESSAGE);
            boolean tutorFound= false;
            //Checking if input is not empty
            if (tutorIdStr != null && !tutorIdStr.isEmpty()) {
                try {
                    int tutorId = Integer.parseInt(tutorIdStr);
                    //Iterating through the teachers list
                    for (Teacher teacher : teachers) {
                        if (teacher instanceof Tutor) {
                            Tutor tutor = (Tutor) teacher;
                            if (tutor.getTeacherId() == tutorId) {
                                if(tutor.getIsCertified()){
                                //Remove the tutor from the list
                                tutor.removeTutor();
                                JOptionPane.showMessageDialog(thirframe, "Tutor ID " + tutorId + " removed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                                }
                                else{
                                JOptionPane.showMessageDialog(thirframe, "Tutor cannot be removed", "Success", JOptionPane.INFORMATION_MESSAGE);
                                }
                                tutorFound = true;
                                break;
                            }
                        }
                    }
    
                    //If tutor ID is not found
                    if (!tutorFound) {
                        JOptionPane.showMessageDialog(thirframe, "Tutor ID " + tutorId + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex3) {
                    JOptionPane.showMessageDialog(thirframe, "Invalid input! Please enter a valid Tutor ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(thirframe, "Invalid input! Please enter valid inputs.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });

        //Displaying the results of the frame
        display.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent d2) {
            if (teachers==null || teachers.isEmpty()) {
                JOptionPane.showMessageDialog(thirframe, "No tutor registered yet.", "Empty", JOptionPane.WARNING_MESSAGE);
            } else {
                String displayMessage = "Tutor Details:\n";
                for (Teacher teacher : teachers) {
                    if (teacher instanceof Tutor) {
                        Tutor tutor = (Tutor) teacher;
                        //calling method from tutor class displaying for terminal
                        tutor.display();
                        //Displaying it in GUI
                        displayMessage += "Tutor ID: " + tutor.getTeacherId() + "\n" +
                           "Name: " + tutor.getTeacherName() + "\n" +
                           "Address: " + tutor.getAddress() + "\n" +
                           "Working Type: " + tutor.getWorkingType() + "\n" +
                           "Employment Status: " + tutor.getEmploymentStatus() + "\n" +
                           "Working Hours: " + tutor.getWorkingHours() + "\n" +
                           "Salary: " + tutor.getSalary() + "\n" +
                           "Specialization: " + tutor.getSpecialization() + "\n" +
                           "Academic Qualification: " + tutor.getAcademicQualification() + "\n" +
                           "Performance Index: " + tutor.getPerformanceIndex();
                    }
                }
                JOptionPane.showMessageDialog(thirframe, displayMessage, "Tutor Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    });
        thirframe.setVisible(true);
    }
    
    /*Theme colors |
                   |
                   V
    */
    private void setLightview() {
            panel.setBackground(Color.WHITE);
            headdesc.setForeground(Color.BLACK);
            menuBar.setBackground(Color.WHITE);
            fileMenu.setForeground(Color.BLACK);
            viewMenu.setForeground(Color.BLACK);
            fontMenu.setForeground(Color.BLACK);
            helpMenu.setForeground(Color.BLACK);
            settingMenu.setForeground(Color.BLACK);
            aboutMenu.setForeground(Color.BLACK);
    }

    private void setDarkview() {
            panel.setBackground(Color.DARK_GRAY);
            headdesc.setForeground(Color.WHITE);
            menuBar.setBackground(Color.BLACK);
            fileMenu.setForeground(Color.WHITE);
            viewMenu.setForeground(Color.WHITE);
            fontMenu.setForeground(Color.WHITE);
            helpMenu.setForeground(Color.WHITE);
            settingMenu.setForeground(Color.WHITE);
            aboutMenu.setForeground(Color.WHITE);
    }

    private void setLightviewsec() {
            secpanel.setBackground(Color.WHITE);
            lectdesc.setForeground(Color.BLACK);
            menuBar.setBackground(Color.WHITE);
            fileMenu.setForeground(Color.BLACK);
            viewMenu.setForeground(Color.BLACK);
            fontMenu.setForeground(Color.BLACK);
            helpMenu.setForeground(Color.BLACK);
            settingMenu.setForeground(Color.BLACK);
            aboutMenu.setForeground(Color.BLACK);
            labname1.setForeground(Color.BLACK);
            labid1.setForeground(Color.BLACK);
            labaddr1.setForeground(Color.BLACK);
            labworkty1.setForeground(Color.BLACK);
            labempsta1.setForeground(Color.BLACK);
            labworkhr1.setForeground(Color.BLACK);
            labdep1.setForeground(Color.BLACK);
            labyoe1.setForeground(Color.BLACK);
    }
    
    private void setDarkviewsec() {
            secpanel.setBackground(Color.DARK_GRAY);
            lectdesc.setForeground(Color.WHITE);
            menuBar.setBackground(Color.BLACK);
            fileMenu.setForeground(Color.WHITE);
            viewMenu.setForeground(Color.WHITE);
            fontMenu.setForeground(Color.WHITE);
            helpMenu.setForeground(Color.WHITE);
            settingMenu.setForeground(Color.WHITE);
            aboutMenu.setForeground(Color.WHITE);
            labname1.setForeground(Color.WHITE);
            labid1.setForeground(Color.WHITE);
            labaddr1.setForeground(Color.WHITE);
            labworkty1.setForeground(Color.WHITE);
            labempsta1.setForeground(Color.WHITE);
            labworkhr1.setForeground(Color.WHITE);
            labdep1.setForeground(Color.WHITE);
            labyoe1.setForeground(Color.WHITE);
            gradeassignmentLabel.setForeground(Color.WHITE);
    }

    private void setLightviewthir() {
            thirpanel.setBackground(Color.WHITE);
            tutdesc.setForeground(Color.BLACK);
            menuBar.setBackground(Color.WHITE);
            fileMenu.setForeground(Color.BLACK);
            viewMenu.setForeground(Color.BLACK);
            fontMenu.setForeground(Color.BLACK);
            helpMenu.setForeground(Color.BLACK);
            settingMenu.setForeground(Color.BLACK);
            aboutMenu.setForeground(Color.BLACK);
            labname2.setForeground(Color.BLACK);
            labid2.setForeground(Color.BLACK);
            labaddr2.setForeground(Color.BLACK);
            labworkty2.setForeground(Color.BLACK);
            labempsta2.setForeground(Color.BLACK);
            labworkhr2.setForeground(Color.BLACK);
            labsal2.setForeground(Color.BLACK);
            labspec2.setForeground(Color.BLACK);
            labacaqua2.setForeground(Color.BLACK);
            labperfind2.setForeground(Color.BLACK);
            moreDesc.setForeground(Color.BLACK);
            salaryDesc.setForeground(Color.BLACK);
            remtutorDesc.setForeground(Color.BLACK);
    }

    private void setDarkviewthir() {
            thirpanel.setBackground(Color.DARK_GRAY);
            tutdesc.setForeground(Color.WHITE);
            menuBar.setBackground(Color.BLACK);
            fileMenu.setForeground(Color.WHITE);
            viewMenu.setForeground(Color.WHITE);
            fontMenu.setForeground(Color.WHITE);
            helpMenu.setForeground(Color.WHITE);
            settingMenu.setForeground(Color.WHITE);
            aboutMenu.setForeground(Color.WHITE);
            labname2.setForeground(Color.WHITE);
            labid2.setForeground(Color.WHITE);
            labaddr2.setForeground(Color.WHITE);
            labworkty2.setForeground(Color.WHITE);
            labempsta2.setForeground(Color.WHITE);
            labworkhr2.setForeground(Color.WHITE);
            labsal2.setForeground(Color.WHITE);
            labspec2.setForeground(Color.WHITE);
            labacaqua2.setForeground(Color.WHITE);
            labperfind2.setForeground(Color.WHITE);
            moreDesc.setForeground(Color.WHITE);
            salaryDesc.setForeground(Color.WHITE);
            remtutorDesc.setForeground(Color.WHITE);
    }
    
    // Main method
    public static void main(String args[]) {
        new TeacherGUI();
    }
}
