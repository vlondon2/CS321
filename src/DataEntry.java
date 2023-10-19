package src;

public class DataEntry {
    private Petition newPetition;

    public DataEntry() {
        newPetition = new Petition();
    }
    private void setPetitionerFirstName(String firstName) {
        newPetition.setPetitionerFirstName(firstName);
    }

    private void setPetitionerLastName(String lastName) {
        newPetition.setPetitionerLastName(lastName);
    }

    private void setANumber(String aNumber) {
        newPetition.setANumber(aNumber);
    }

    private void setBeneficiaryFirstName(String firstName) {
        newPetition.setBeneficiaryFirstName(firstName);
    }

    private void setBeneficiaryLastName(String lastName) {
        newPetition.setBeneficiaryLastName(lastName);
    }

    private void setDobYear(int year) {
        newPetition.setDobYear(year);
    }

    private void setDobMonth(int month) {
        newPetition.setDobMonth(month);
    }

    private void setDobDay(int day) {
        newPetition.setDobDay(day);
    }

    private boolean checkStatus(String aNumber) {
        return checkStatus(aNumber);
    }

    private boolean submitPetition() {
        return false;
    }

    private void clearScreen() {
        newPetition = new Petition();
    }
}
