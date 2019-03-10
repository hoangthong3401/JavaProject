package version1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Member implements iMember {

    private String fullName;
    private String occupation;
    private Date dob;

    public Member() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Member(String fullName, String occupation, Date dob) {
        this.fullName = fullName;
        this.occupation = occupation;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Member{" + "fullName=" + fullName + ", occupation=" + occupation + ", dob=" + dob + '}';
    }

    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Full name? - ");
        this.fullName = sc.nextLine();
        System.out.print("Occupation? - ");
        this.occupation = sc.nextLine();
        System.out.print("Date of birth(dd/mm/yyyy)? - ");
        String dobString = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.dob = sdf.parse(dobString);
        } catch (ParseException ex) {
            this.dob = null;
        }
        while (dob == null) {
            System.out.print("Date of birth? - ");
            try {
                this.dob = sdf.parse(dobString);
            } catch (ParseException ex) {
                this.dob = null;
            }
        }
        sc.close();
    }

    @Override
    public void displayInfo() {
        this.toString();
    }

    @Override
    public boolean isMoreThan80YearOld() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.dob);
        return Year.now().getValue() - calendar.get(Calendar.YEAR) >= 80;
    }

}
