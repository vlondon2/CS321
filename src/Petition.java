package src;

public class Petition {
    public String aNumber;
    public String firstName;
    public String lastName;

    public Petition() {
        this.aNumber = "";
        this.firstName = "";
        this.lastName = "";
    }

    public void setaNumber(String aNumber) {
        this.aNumber = aNumber;
    }

    public String getaNumber() {
        return aNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
