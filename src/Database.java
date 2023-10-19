package src;

import java.util.ArrayList;

public class Database {
    private static ArrayList<Petition> database;

    /**
     * Default constructor
     */
    public Database() {
        database = new ArrayList<Petition>();
    }

    /**
     * This function adds a petition to the database
     *
     * @param petition petition to add
     */
    public void addToDatabase(Petition petition) {
        database.add(petition);
    }

    /**
     * This function removes a petition from the database
     *
     * @param petition petition to remove
     * @return returns true if removed
     */
    public boolean removeFromDatabase(Petition petition) {
        return database.remove(petition);
    }

    /**
     * This function is used to get a reference to the database
     *
     * @return the database arrayList
     */
    public ArrayList<Petition> getDatabase() {
        return database;
    }
}
