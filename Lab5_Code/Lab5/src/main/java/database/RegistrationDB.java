package database;

import employee.Employee;
import observers.DatabaseObserver;
import register_entry.RegisterEntry;
import register_entry.RegisterEntryNull;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;

public class RegistrationDB extends Database
{
    private final HashMap<Employee, RegisterEntry> db;
    private static RegistrationDB instance;

    private RegistrationDB() {
        this.db = new HashMap<>();
    }

    @Override
    public void addEntry(Employee e, RegisterEntry re)
    {
        this.db.put(e, re);
        PropertyChangeEvent event = new PropertyChangeEvent(this, "data", this.db, re);

        this.property.firePropertyChange(event);
    }

    @Override
    public RegisterEntry getEntry(Employee e)
    {
        return this.db.getOrDefault(e, new RegisterEntryNull());

    }


    public static RegistrationDB getInstance(){
        if (instance == null){
            instance = new RegistrationDB();
        }
        return instance;
    }

    @Override
    public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        super.addPropertyChangeListener(propertyName, listener);
    }

    @Override
    public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        super.removePropertyChangeListener(propertyName, listener);
    }

}
