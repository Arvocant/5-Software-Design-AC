package observers;

import employee.Employee;
import register_entry.RegisterEntry;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class DatabaseObserver implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String name = evt.getPropertyName();
        RegisterEntry entry = (RegisterEntry) evt.getNewValue();

        //Employee employee = (Employee) evt.getPropertyName();

        System.out.println("Database got updated");
        System.out.println("The added entry is: " + entry.toString());
    }
}
