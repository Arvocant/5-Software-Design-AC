package database;

import employee.Employee;
import register_entry.RegisterEntry;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public abstract class Database
{
    protected final PropertyChangeSupport property;
    public Database()
    {
        property = new PropertyChangeSupport(this);
    }

    public abstract void addEntry(Employee e, RegisterEntry re);
    public abstract RegisterEntry getEntry(Employee e);

    public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {

        property.addPropertyChangeListener(propertyName, listener);
    }

    public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {

        property.removePropertyChangeListener(propertyName, listener);
    }

}
