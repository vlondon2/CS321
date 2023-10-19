package src;

import java.util.ArrayList;

public class Database {
    private static ArrayList<Petition> database;

    public Database() {
        database = new ArrayList<Petition>();
    }

    public void addToDatabase(Petition petition) {
        database.add(petition);
    }

    public boolean removeFromDatabase(Petition petition) {
        return database.remove(petition);
    }

    public ArrayList<Petition> getDatabase() {
        return database;
    }
}
