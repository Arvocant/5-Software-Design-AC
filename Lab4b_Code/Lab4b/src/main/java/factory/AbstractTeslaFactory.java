package factory;

import tesla.Tesla;

public interface AbstractTeslaFactory
{
    Tesla getRedCar(String name);
    Tesla getBlackCar(String name);
}
