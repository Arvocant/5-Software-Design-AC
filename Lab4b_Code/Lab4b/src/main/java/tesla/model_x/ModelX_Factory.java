package tesla.model_x;

import factory.AbstractTeslaFactory;
import tesla.Tesla;

public class ModelX_Factory implements AbstractTeslaFactory {

    @Override
    public Tesla getRedCar(String name) {
        return new ModelX_Red(name);
    }

    @Override
    public Tesla getBlackCar(String name) {
        return new ModelX_Black(name);
    }
}
