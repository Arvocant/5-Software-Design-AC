package tesla.model_s;

import factory.AbstractTeslaFactory;
import tesla.Tesla;
import tesla.model_3.Model3_Black;
import tesla.model_3.Model3_Red;

public class ModelS_Factory implements AbstractTeslaFactory {
    @Override
    public Tesla getRedCar(String name) {
        return new ModelS_Red(name);
    }

    @Override
    public Tesla getBlackCar(String name) {
        return new ModelS_Black(name);
    }
}
