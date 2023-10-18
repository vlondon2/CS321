package src;

public class Petition {
    
    private String petitionerFirstName;
    private String petitionerLastName;
    private String aNumber;
    private String beneficiaryFirstName;
    private String beneficiaryLastName;
    private int dobMonth;
    private int dobDay;
    private int dobYear;

    public Petition() {
        this.petitionerFirstName = "";
        this.petitionerLastName = "";
        this.aNumber = "";
        this.beneficiaryFirstName = "";
        this.beneficiaryLastName = "";
        this.dobMonth = 0;
        this.dobDay = 0;
        this.dobYear = 0;
    }

    public void setPetitionerFirstName(String petitionerFirstName) {
        this.petitionerFirstName = petitionerFirstName;
    }

    public String getPetitionerFirstName() {
        return petitionerFirstName;
    }

    public void setPetitionerLastName(String petitionerLastName) {
        this.petitionerLastName = petitionerLastName;
    }

    public String getPetitionerLastName() {
        return petitionerLastName;
    }

    public void setaNumber(String aNumber) {
        this.aNumber = aNumber;
    }

    public String getaNumber() {
        return aNumber;
    }

    public void setBeneficiaryFirstName(String firstName) {
        this.beneficiaryFirstName = firstName;
    }

    public String getBeneficiaryFirstName() {
        return beneficiaryFirstName;
    }

    public void setBeneficiaryLastName(String lastName) {
        this.beneficiaryLastName = lastName;
    }

    public String getBeneficiaryLastName() {
        return beneficiaryLastName;
    }

    public void setDobMonth(int dobMonth) {
        this.dobMonth = dobMonth;
    }

    public int getDobMonth() {
        return dobMonth;
    }

    public void setDobDay(int dobDay) {
        this.dobDay = dobDay;
    }

    public int getDobDay() {
        return dobDay;
    }

    public void setDobYear(int dobYear) {
        this.dobYear = dobYear;
    }

    public int getDobYear() {
        return dobYear;
    }
}
