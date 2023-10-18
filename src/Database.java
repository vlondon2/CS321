package src;

import java.util.ArrayList;

public class Database {
    private ArrayList<Petition> database;

    public Database() {
        database = new ArrayList<>();
    }

    public void addToDatabase(Petition petition) {
        database.add(petition);
    }

    public boolean removeFromDatabase(Petition petition) {
        return database.remove(petition);
    }

    public boolean checkDatabase(String aNumber) {
        for (Petition petition:
             database) {
            if (petition.getaNumber().equals(aNumber)) {
                return true;
            }
        }
        return false;
    }

    public Petition getPetitionFromDatabase(String aNumber) {
        for (Petition petition:
             database) {
            if (petition.getaNumber().equals(aNumber)) {
                return petition;
            }
        }
        return null;
    }
}
