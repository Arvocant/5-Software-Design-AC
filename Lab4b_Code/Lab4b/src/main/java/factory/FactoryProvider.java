package factory;

import tesla.Tesla;
import tesla.model_3.Model3_Factory;
import tesla.model_s.ModelS_Factory;
import tesla.model_x.ModelX_Factory;
import tesla.model_y.ModelY_Factory;

import java.util.Objects;

public class FactoryProvider
{
    // Use the following structure to make new factories in this provider.
    // Change the name from "YourNewFactory" to a more suitable name for your factories.

    public static AbstractTeslaFactory yourNewFactory(String type){


        if (Objects.equals(type, "modelS"))
            return new ModelS_Factory();
        else if (Objects.equals(type, "model3"))
            return new Model3_Factory();
        else if (Objects.equals(type, "modelX"))
            return new ModelX_Factory();
        else if (Objects.equals(type, "modelY"))
            return new ModelY_Factory();
        else
            return null;
    }

    // In this way, the main function can call FactoryProvider.yourNewFactory() and gets a factory to work with.
}
