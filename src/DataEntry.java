package src;

public class DataEntry {
    private Petition newPetition = new Petition();

    public Petition getNewPetition() {
        return newPetition;
    }

    public void setPetitionerFirstName(String firstName) {
        newPetition.setPetitionerFirstName(firstName);
    }

    public void setPetitionerLastName(String lastName) {
        newPetition.setPetitionerLastName(lastName);
    }

    public void setANumber(String aNumber) {
        newPetition.setaNumber(aNumber);
    }

    public void setBeneficiaryFirstName(String firstName) {
        newPetition.setBeneficiaryFirstName(firstName);
    }

    public void setBeneficiaryLastName(String lastName) {
        newPetition.setBeneficiaryLastName(lastName);
    }
}
