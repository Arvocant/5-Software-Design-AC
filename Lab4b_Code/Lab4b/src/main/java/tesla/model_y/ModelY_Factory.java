package tesla.model_y;

import factory.AbstractTeslaFactory;
import tesla.Tesla;

public class ModelY_Factory implements AbstractTeslaFactory {
    @Override
    public Tesla getRedCar(String name) {
        return new ModelY_Red(name);
    }

    @Override
    public Tesla getBlackCar(String name) {
        return new ModelY_Black(name);
    }
}
