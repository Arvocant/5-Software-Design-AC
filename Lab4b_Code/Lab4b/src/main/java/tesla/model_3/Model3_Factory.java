package tesla.model_3;

import factory.AbstractTeslaFactory;
import tesla.Tesla;

public class Model3_Factory implements AbstractTeslaFactory {

    @Override
    public Tesla getRedCar(String name) {
        return new Model3_Red(name);
    }

    @Override
    public Tesla getBlackCar(String name) {
        return new Model3_Black(name);
    }
}
