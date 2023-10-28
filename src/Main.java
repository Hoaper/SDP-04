public class Main {
    public static void main(String[] args) {
        SmartHomeApp smartHomeApp = new SmartHomeApp();

        DeviceFactory lampFactory = new LampFactory();
        DeviceFactory thermostatFactory = new ThermostatFactory();

        SmartDevice lamp = lampFactory.createDevice();
        SmartDevice thermostat = thermostatFactory.createDevice();

        lamp.registerObserver(smartHomeApp);
        thermostat.registerObserver(smartHomeApp);

        lamp.turnOn();
        thermostat.turnOn();
        lamp.turnOff();
        thermostat.turnOff();
    }
}
