
import java.text.NumberFormat;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 13316
 */
public class Profile {
    private static final NumberFormat CF = NumberFormat.getCurrencyInstance(Locale.US);
    private int             buildingId1;
    private int             lblEmployeeIDNum1;
    private String          username1;   
    private String          firstName1;
    private String          middleName1;
    private String          lastName1;
    private String          driverLicense1;
    private int             issueDate1;
    private int             experationDate1;
    private String          dlAddress1;
    private String          dlAddress2;
    private String          dlCity1;
    private String          dlState1;
    private int             dlZipCode1;
    private int             dlPlus41;
    private int             ssn1;
    private int             fein1;
    private String          equipmentName;
    private double          price;
    private String          status;
    private int             buildingId;
    private long            checkIn;   
    private long            checkOut;   

    void setString(int i, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public enum Gender1 {
        Male, Female
    }
    public enum EmployeeStatus1 {
        Active, Inactive, Terminated
    }
    
    private Gender1         gender1;
    private EmployeeStatus1 employeeStatus1;
    private static final String GENDER1 = "Male, Female";
    private static final String EMPLOYEESTATUS1 = "Active";

    ECS obj = new ECS();
    //obj.show();
    //constructs
    public Profile()
    {
        buildingId1      = 0;
        lblEmployeeIDNum1= 0;
        username1        = "";   
        firstName1       = "";
        middleName1      = "";
        lastName1        = "";
        driverLicense1   = "";
        issueDate1       = 0;
        experationDate1  = 0;
        dlAddress1       = "";
        dlAddress2       = "";
        dlCity1          = "";
        dlState1         = "";
        dlZipCode1       = 0;
        dlPlus41         = 0;
        ssn1             = 0;
        fein1            = 0;
        equipmentName    = "";
        price            = 0.00;
        status           = "";
        buildingId       = 0;
        checkIn          = 0;
        checkOut         = 0;
    }

    public Profile(int buildingId1, int lblEmployeeIDNum1, String username1, String firstName1,
            String middleName1, String lastName1, String driverLicense1, 
            int issueDate1, int experationDate1, String dlAddress1,
            String dlAddress2, String dlCity1, String dlState1, int dlZipCode1,
            int dlPlus41, int ssn1, int fein1, long checkIn, long checkOut) {
        
        this.buildingId1 = buildingId1;
        this.lblEmployeeIDNum1 = lblEmployeeIDNum1;
        this.username1 = username1;
        this.firstName1 = firstName1;
        this.middleName1 = middleName1;
        this.lastName1 = lastName1;
        this.driverLicense1 = driverLicense1;
        this.issueDate1 = issueDate1;
        this.experationDate1 = experationDate1;
        this.dlAddress1 = dlAddress1;
        this.dlAddress2 = dlAddress2;
        this.dlCity1 = dlCity1;
        this.dlState1 = dlState1;
        this.dlZipCode1 = dlZipCode1;
        this.dlPlus41 = dlPlus41;
        this.ssn1 = ssn1;
        this.fein1 = fein1;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    //Behaviours
 
    //@Override

    //Getters and Setters

    public int getBuildingId1() {
        return buildingId1;
    }
    public void setBuildingId1(int buildingId1) {
        this.buildingId1 = buildingId1;
    }

    public int getEmployeeIDNum1() {
        return lblEmployeeIDNum1;
    }
    public void setEmployeeIDNum1(int lblEmployeeIDNum1) {
        this.lblEmployeeIDNum1 = lblEmployeeIDNum1;
    }

    public String getUsername1() {
        return username1;
    }
    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public String getFirstName1() {
        return firstName1;
    }
    public void setFirstName1(String firstName1) {
        this.firstName1 = firstName1;
    }

    public String getMiddleName1() {
        return middleName1;
    }
    public void setMiddleName1(String middleName1) {
        this.middleName1 = middleName1;
    }

    public String getLastName1() {
        return lastName1;
    }
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getDriverLicense1() {
        return driverLicense1;
    }
    public void setDriverLicense1(String driverLicense1) {
        this.driverLicense1 = driverLicense1;
    }

    public int getIssueDate1() {
        return issueDate1;
    }
    public void setIssueDate1(int issueDate1) {
        this.issueDate1 = issueDate1;
    }

    public int getExperationDate1() {
        return experationDate1;
    }
    public void setExperationDate1(int experationDate1) {
        this.experationDate1 = experationDate1;
    }

    public String getDlAddress1() {
        return dlAddress1;
    }
    public void setDlAddress1(String dlAddress1) {
        this.dlAddress1 = dlAddress1;
    }

    public String getDlAddress2() {
        return dlAddress2;
    }
    public void setDlAddress2(String dlAddress2) {
        this.dlAddress2 = dlAddress2;
    }

    public String getDlCity1() {
        return dlCity1;
    }
    public void setDlCity1(String dlCity1) {
        this.dlCity1 = dlCity1;
    }

    public String getDlState1() {
        return dlState1;
    }
    public void setDlState1(String dlState1) {
        this.dlState1 = dlState1;
    }

    public int getDlZipCode1() {
        return dlZipCode1;
    }
    public void setDlZipCode1(int dlZipCode1) {
        this.dlZipCode1 = dlZipCode1;
    }

    public int getDlPlus41() {
        return dlPlus41;
    }
    public void setDlPlus41(int dlPlus41) {
        this.dlPlus41 = dlPlus41;
    }

    public int getSsn1() {
        return ssn1;
    }
    public void setSsn1(int ssn1) {
        this.ssn1 = ssn1;
    }

    public int getFein1() {
        return fein1;
    }
    public void setFein1(int fein1) {
        this.fein1 = fein1;
    }

    public long getCheckIn() {
        return checkIn;
    }
    public void setCheckIn(long checkIn) {
        this.checkIn = checkIn;
    }
    public long getCheckOut() {
        return checkOut;
    }
    public void setCheckOut(long checkOut) {
//        this.checkOut = setTime();
    }

    public void clearOrder() {
        setEmployeeStatus1(EmployeeStatus1.Active);
        setGender1(Gender1.Male);
        setBuildingId1(0);
        setEmployeeIDNum1(0);
        setUsername1("");
        setFirstName1("");
        setMiddleName1("");
        setLastName1("");
        setDriverLicense1("");
        setIssueDate1(0);
        setExperationDate1(0);
        setDlAddress1("");
        setDlAddress2("");
        setDlCity1("");
        setDlState1("");
        setDlZipCode1(0);
        setDlPlus41(0);
        setSsn1(0);

    }
    
    public void setGender1(Gender1 type) {
         gender1 = type;
    }

    public String getGender1() {
        String str;
        str = switch (gender1) {
            case Male -> "Male";
            case Female -> "Female";
            default -> "Male";
        };
        return str;
    }
    public void setEmployeeStatus1(EmployeeStatus1 type) {
         employeeStatus1 = type;
    }
    public String getEmployeeStatus1() {
        String str;
        str = switch (employeeStatus1) {
            case Active -> "Active";
            case Inactive -> "Inactive";
            case Terminated -> "Terminated";
            default -> "Active";
        };
        return str;
    }

    public String getEmployeeInformation() {
        StringBuilder str = new StringBuilder();
        str.append("  \n");
        str.append("\nMale");
        str.append(CF.format(GENDER1));
        str.append("\nFemale");
        str.append(CF.format(GENDER1));
        str.append("\nActive");
        str.append(CF.format(EMPLOYEESTATUS1));
        str.append("\nInactive");
        str.append(CF.format(EMPLOYEESTATUS1));
        str.append("\nTerminated");
        str.append(CF.format(EMPLOYEESTATUS1));
        return str.toString();
    }
    
    public void clearForm() {
        setBuildingId1(0);
        setEmployeeIDNum1(0);
        setUsername1("");
        setFirstName1("");
        setMiddleName1("");
        setLastName1("");
        setDriverLicense1("");
        setIssueDate1(0);
        setExperationDate1(0);
        setDlAddress1("");
        setDlAddress2("");
        setDlCity1("");
        setDlState1("");
        setDlZipCode1(0);
        setDlPlus41(0);
        setSsn1(0);
        setFein1(0);
        setCheckIn(0);
    }
    
    @Override
    public String toString() {
        return getEmployeeInformation();
    }
}
